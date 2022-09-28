package br.com.fetchreceita.repository;

import br.com.fetchreceita.models.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustumerRepository extends JpaRepository<CustomersEntity, Integer> {
    Optional<CustomersEntity> findCustomerByCustomerId(Integer id);
}
