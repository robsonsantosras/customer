package boasentregas.customer.controllers;

import boasentregas.customer.models.Customer;
import boasentregas.customer.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("customer/v1")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> get(@PathVariable String id)
    {
        Customer customer = customerService.findById(id);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }

    @PostMapping ("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
    {
        customerService.save(customer);
        return new ResponseEntity<>(customer,HttpStatus.CREATED);
    }

}
