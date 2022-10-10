package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Cities;

public interface CityRepository extends JpaRepository<Cities, Integer> {

}
