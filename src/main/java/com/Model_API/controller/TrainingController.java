package com.Model_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model_API.entity.Training;
import com.Model_API.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TrainingController {
 
	@Autowired
	private UserService us;
	
	@GetMapping("/trainings")
	public List<Training> getAllTrainings() {
		return us.getAllTrainings();
	}
	
	@PostMapping("/addTraining")
	public void addTraining (@RequestBody Training training) {		
		 us.addTraining(training);
	}
	
	@GetMapping("/trainings/{id}")
	public Training getTrainingById(@PathVariable("id") Long training_id) {
		return us.getTrainingById(training_id);
	}
	
	@PutMapping("/trainings/{id}")
	public String updateTrainingById(@PathVariable("id") Long id, @RequestBody Training training) {
		us.UpdateTrainingById(id,training);
		return training.getTitle();
	}
	
	@DeleteMapping("/trainings/{id}")
	public String deleteTrainingById (@PathVariable("id") Long training_id) {
		    us.deleteTrainingById(training_id);
		    return training_id.toString();
	}
}
