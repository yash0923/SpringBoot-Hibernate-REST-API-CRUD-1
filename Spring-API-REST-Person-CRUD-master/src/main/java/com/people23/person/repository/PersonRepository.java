package com.people23.person.repository;

import com.people23.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This use JpaRepository that extends the PagingAndSortingRepository that extends CRUDRepository.
 */
/**
 * Created in Eclipse IDE.
 * Project : Spring-API-REST-Person-CRUD-master
 * User: yash
 * Date: 18/01/2020
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
