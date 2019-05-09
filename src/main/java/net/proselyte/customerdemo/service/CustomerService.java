package net.proselyte.customerDemo.service;

import net.proselyte.customerDemo.model.Customer;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
