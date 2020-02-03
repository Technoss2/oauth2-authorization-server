package oauth2authorizationserver.oauth2demo.repository;

import oauth2authorizationserver.oauth2demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findByEmail(String email);
}
