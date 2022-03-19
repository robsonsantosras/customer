package boasentregas.customer.services;

import boasentregas.customer.models.Customer;

public interface CustomerService {
    void save(Customer customer);
    Customer findById(String id);
}
