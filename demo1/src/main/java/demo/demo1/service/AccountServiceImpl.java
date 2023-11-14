package demo.demo1.service;

import demo.demo1.dto.requestDTO.AccountRequestDTO;
import demo.demo1.dto.responseDTO.AccountDTO;
import demo.demo1.dto.responseDTO.AccountResponseDTO;
import demo.demo1.repository.AccountRepository;
import demo.demo1.repository.repositoryImpl.AccountRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountRepositoryImpl accountRepositoryImpl;

    @Override
    public List<AccountDTO> getAccount() {

        return null;
    }

    @Override
    public List<AccountResponseDTO> findAccount(AccountRequestDTO accountRequestDTO) {
        List<AccountResponseDTO> accountResponseDTOS = accountRepositoryImpl.findCondition(accountRequestDTO);

        return accountResponseDTOS;
    }

    @Override
    public List<AccountResponseDTO> updataAccount(AccountRequestDTO accountRequestDTO) {
        return null;
    }
}
