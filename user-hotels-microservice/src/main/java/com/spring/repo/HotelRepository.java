package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Hotel;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Repository
public interface HotelRepository extends MongoRepository<Hotel, Integer> {

	List<Hotel> findAllByCity(String city);

}
