package com.Model_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model_API.entity.Training;

@Repository
public interface TrainingsRepository extends JpaRepository<Training,Long> {

}
