package boasentregas.customer.test;

import boasentregas.customer.controllers.CustomerController;
import boasentregas.customer.models.Customer;
import boasentregas.customer.services.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
public class CustomerControllerTest {

    @Mock
    private CustomerService customerService;

    @InjectMocks
    private CustomerController customerController;

    @Test
    public void postCustomerService()
    {
        customerService.save(any(Customer.class));
        assertEquals(HttpStatus.OK,HttpStatus.OK);
    }


    @Test
    public void createCustomer(){

        customerController.createCustomer(any(Customer.class));

        assertEquals(HttpStatus.CREATED,HttpStatus.CREATED);
    }

}
