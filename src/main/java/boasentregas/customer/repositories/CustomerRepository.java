package boasentregas.customer.repositories;

import boasentregas.customer.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String>
{

}
