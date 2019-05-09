package net.proselyte.customerDemo.repository;

import net.proselyte.customerDemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
