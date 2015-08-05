package io.hanmomhanda.wubwur.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by hanmomhanda on 15. 8. 5.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
