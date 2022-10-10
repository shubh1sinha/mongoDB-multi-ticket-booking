package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.spring.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer>{

	List<Bus> findAllBysrcDestn(String name);

	@Modifying
	@Query("update Bus b set b.seats=b.seats-?2 where b.busId=?1")
	void updateSeatsById(int busId, int passengers);

}
