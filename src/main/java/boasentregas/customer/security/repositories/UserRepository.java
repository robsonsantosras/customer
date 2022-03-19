package boasentregas.customer.security.repositories;

import boasentregas.customer.security.repository.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Login,String> {

 }
