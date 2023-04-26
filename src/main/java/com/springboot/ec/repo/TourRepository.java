package com.springboot.ec.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.ec.domain.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer> {

}
