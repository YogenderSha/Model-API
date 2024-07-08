package com.Model_API.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Training {
	       @Id
	       @GeneratedValue(strategy = GenerationType.AUTO)
	       private Long trainingId;
	       
           private String title;
           private String trainingTopic;
           private int peopleAttended;
           private String trainer;
           private int HoursCount;
           private String location;
           
		public Long getTrainingId() {
			return trainingId;
		}
		public void setTrainingId(Long trainingId) {
			this.trainingId = trainingId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getTrainingTopic() {
			return trainingTopic;
		}
		public void setTrainingTopic(String trainingTopic) {
			this.trainingTopic = trainingTopic;
		}
		public int getPeopleAttended() {
			return peopleAttended;
		}
		public void setPeopleAttended(int peopleAttended) {
			this.peopleAttended = peopleAttended;
		}
		public String getTrainer() {
			return trainer;
		}
		public void setTrainer(String trainer) {
			this.trainer = trainer;
		}
		public int getHoursCount() {
			return HoursCount;
		}
		public void setHoursCount(int hoursCount) {
			HoursCount = hoursCount;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
           
           
           
}
