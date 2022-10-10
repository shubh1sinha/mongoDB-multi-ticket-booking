package com.spring.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.entity.Seat;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {

	@Query("select MAX(seatNo) as seatNo from Seat s where s.trainId=?1 order by s.seatNo DESC")
	String findifSeatIsNull(int trainId);
	
	@Query("select MAX(seatNo) as seatNo from Seat s where s.trainId=?1 order by s.seatNo DESC")
	int findTopByOrderBySeatNoDesc (int trainId);
	
	@Query("select MAX(seatId) as seatId from Seat s  order by s.seatId DESC")
	int findTopByOrderByIdDesc ();
	
	@Query("select MAX(seatId) as seatId from Seat s  order by s.seatId DESC")
	String findNullIdDesc ();
	
	
	


}