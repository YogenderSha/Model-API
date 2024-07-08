package com.Model_API.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model_API.entity.Training;
import com.Model_API.entity.UserEntity;
import com.Model_API.repository.TrainingsRepository;
import com.Model_API.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepo;
	
	@Autowired
	public TrainingsRepository tsr;
	
	@Override
	public UserEntity getUserById(Long UserId) {
		return userRepo.findById(UserId).orElse(null);
	}
	

	@Override
	public List<UserEntity> getAllUsers() {
		return userRepo.findAll() ;
	}

	@Override
	public void CreateUser(UserEntity user) {
		 userRepo.save(user);
	}

	@Override
	public UserEntity UpdateUser(UserEntity user) {
		return null;
	}

	@Override
	public List<Training> getAllTrainings() {
		return tsr.findAll();
	}

	@Override
	public void addTraining(Training training) {
		 tsr.save(training);
	}

	@Override
	public Training getTrainingById(Long trainingId) {
		   return tsr.findById(trainingId).orElse(null);
	}

	@Override
	public void UpdateTrainingById(Long id, Training training) {
            tsr.deleteById(id);	
            tsr.save(training).setTrainingId(id);
	}

	@Override
	public void deleteTrainingById(Long trainingId) {
          tsr.deleteById(trainingId);	
	}

}
