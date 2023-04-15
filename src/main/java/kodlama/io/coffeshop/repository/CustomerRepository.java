package kodlama.io.coffeshop.repository;

import kodlama.io.coffeshop.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
