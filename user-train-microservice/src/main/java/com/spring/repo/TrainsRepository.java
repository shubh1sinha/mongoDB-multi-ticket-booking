package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.entity.Trains;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Repository
public interface TrainsRepository extends JpaRepository<Trains, Integer> {

	@Query("Select t from Trains t where t.sourceId = ?1 and t.destinationId=?2 and t.departure=?3 and t.departure>=now()")
	List<Trains> findAllBySdId(int sourceId, int destinationId, String date);

	@Modifying
	@Query("Update Trains t set t.seats = t.seats-?1 where t.trainId=?2")
    public void updateSeats(int passengers, int trainId);

}