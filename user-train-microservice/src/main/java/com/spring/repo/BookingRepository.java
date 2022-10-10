package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.entity.Booking;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	@Query("select MAX(bookingId) as bookingId from Booking b  order by b.bookingId DESC")
	int findTopByBookingByIdDesc ();

	@Query("select b from Booking b where b.userId = ?1")
	List<Booking> findAllByBookingId(String userId);

}