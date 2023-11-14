package demo.demo1.repository.repositoryImpl;

import demo.demo1.dto.requestDTO.AccountRequestDTO;
import demo.demo1.dto.responseDTO.AccountResponseDTO;
import demo.demo1.entity.*;
import demo.demo1.mapper.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl {
    private final EntityManager entityManager;
    private final AccountMapper accountMapper;

    public List<AccountResponseDTO> findCondition(AccountRequestDTO accountRequestDTO) {
        List<Account> account;
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Account> cq = cb.createQuery(Account.class);
        Root<Account> root = cq.from(Account.class);

        List<Predicate> predicates = new ArrayList<>();

        if (StringUtils.isNotBlank(accountRequestDTO.getFirstName())) {
            Join<Account, Customer> customerJoin = root.join("customer", JoinType.LEFT);
            Join<Customer, Individual> individualJoin = customerJoin.join("individual", JoinType.LEFT);
            predicates.add(cb.or(cb.like(cb.upper(individualJoin.get("firstName")), "%" + accountRequestDTO.getFirstName().toUpperCase() + "%"),
                    cb.like(cb.upper(individualJoin.get("lastName")), "%" + accountRequestDTO.getFirstName().toUpperCase() + "%")));
        }
        if (accountRequestDTO.getEmpId() != null) {
            Join<Account, Employee> employeeJoin = root.join("employee", JoinType.LEFT);
            predicates.add(cb.like(employeeJoin.get("employee"), "%" + accountRequestDTO.getEmpId() + "%"));
        }
        if (accountRequestDTO.getBranchId() != null) {
            Join<Account, Branch> branch = root.join("branch", JoinType.LEFT);
            predicates.add(cb.like(branch.get("branchId"), "%" + accountRequestDTO.getBranchId() + "%"));
        }
        if (accountRequestDTO.getMinOpenDate() != null) {
            predicates.add(cb.greaterThanOrEqualTo(root.get("openDate"), accountRequestDTO.getMinOpenDate()));
        }
        if (accountRequestDTO.getMaxOpenDate() != null) {
            predicates.add(cb.lessThanOrEqualTo(root.get("openDate"), accountRequestDTO.getMaxOpenDate()));
        }

        if (accountRequestDTO.getMinAvailBalance() != null) {
            predicates.add(cb.greaterThanOrEqualTo(root.get("availBalance"), accountRequestDTO.getMinAvailBalance()));
        }
        if (accountRequestDTO.getMaxAvailBalance() != null) {
            predicates.add(cb.lessThanOrEqualTo(root.get("availBalance"), accountRequestDTO.getMaxAvailBalance()));
        }

        TypedQuery<Account> query = entityManager.createQuery(cq.select(root).distinct(true)
                .where(cb.and(predicates.toArray(new Predicate[]{}))));

        account = query.getResultList();

        return accountMapper.toResponses(account);
    }
}
