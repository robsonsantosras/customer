package boasentregas.customer.services.implement;

import boasentregas.customer.repositories.CustomerRepository;
import boasentregas.customer.models.Customer;
import boasentregas.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;



    @Override
    public void save(Customer customer)
    {
        customerRepository.save(customer);
    }

    public Customer findById(String id)
    {
        return customerRepository.findById(id).get();
    }
}
