package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
    @Id
	private int id;
	private String patient_name;
	private String doctor_name;
	private String medicine_name;
	private int fees;

	public Hospital(int id, String patient_name, String doctor_name, String medicine_name, int fees) {
		super();
		this.id = id;
		this.patient_name = patient_name;
		this.doctor_name = doctor_name;
		this.medicine_name = medicine_name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public Hospital() {
		super();

	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", patient_name=" + patient_name + ", doctor_name=" + doctor_name
				+ ", medicine_name=" + medicine_name + ", fees=" + fees + "]";
	}

}
