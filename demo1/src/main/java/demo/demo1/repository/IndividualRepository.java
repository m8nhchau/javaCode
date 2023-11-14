package demo.demo1.repository;

import demo.demo1.entity.Customer;
import demo.demo1.entity.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IndividualRepository extends JpaRepository<Individual, Integer> {
    @Query(value = "SELECT concat(first_Name ,' ', last_Name) FROM Individual", nativeQuery = true)
    List<Customer> getFullNames();
}

