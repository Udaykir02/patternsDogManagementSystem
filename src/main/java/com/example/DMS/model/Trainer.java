package com.example.DMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String trainerAddress;
	private String trainerName;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerAddress=" + trainerAddress + ", trainerName=" + trainerName
				+ "]";
	}
	
}
