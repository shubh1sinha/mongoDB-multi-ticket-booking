package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.SourceDestination;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Repository
public interface SourceDestinationRepository extends JpaRepository<SourceDestination, Integer> {

}