package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Registration;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Repository
public interface RegistrationRepository extends MongoRepository<Registration, String> {

}
