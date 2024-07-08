package com.Model_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model_API.entity.UserEntity;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

	     
}
