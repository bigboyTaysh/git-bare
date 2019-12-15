package pl.patryk.springwithgit.repo;

import org.springframework.data.repository.CrudRepository;
import pl.patryk.springwithgit.domain.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
