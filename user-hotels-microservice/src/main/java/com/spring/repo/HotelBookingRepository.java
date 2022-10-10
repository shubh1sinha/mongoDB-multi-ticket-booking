package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.HotelBooking;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Repository
public interface HotelBookingRepository extends MongoRepository<HotelBooking, String> {

	List<HotelBooking> findAllByUserId(String userId);

}
