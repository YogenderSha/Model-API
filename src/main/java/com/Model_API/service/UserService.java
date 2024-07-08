package com.Model_API.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Model_API.entity.Training;
import com.Model_API.entity.UserEntity;

@Service
public interface UserService {

	public UserEntity getUserById(Long id);
	public List<UserEntity> getAllUsers();
	public UserEntity UpdateUser(UserEntity user);
	public void CreateUser(UserEntity user);
	public List<Training> getAllTrainings();
	public void addTraining(Training training);
	public Training getTrainingById(Long id);
	public void UpdateTrainingById(Long id, Training training);
	public void deleteTrainingById(Long training_id);

}
