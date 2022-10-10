package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.BusBooking;

public interface BusBookingRepository extends JpaRepository<BusBooking, Integer> {

	List<BusBooking> findAllByuserId(String userId);

}
