package com.project.entity;

import java.util.Date;

import org.springframework.boot.context.properties.bind.Name;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	@NotBlank(message = "Name Must not be null")
	private String name;

	@NotBlank(message = "email Must not be null")
	private String email;

	@NotBlank(message = "phoneNo Must not be null")
	private String phoneNo;

	@NotBlank(message = "Fees Must not be null")
	private String fees;

	@NotBlank(message = "date Must not be null")
	private String date;

	@NotBlank(message = "gender Must not be null")
	private String gender;

	@NotBlank(message = "course Must not be null")
	private String course;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(Integer userId, @NotBlank String name, @NotBlank String email, @NotBlank String phoneNo, @NotBlank String fees,
			String date, @NotBlank String gender, @NotBlank String course) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.fees = fees;
		this.date = date;
		this.gender = gender;
		this.course = course;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "userId: " + userId + ", Name: " + name + ", Email: " + email + ", phoneNo: " + phoneNo + ", Fees: "
				+ fees + ", date: " + date + ", gender: " + gender + ", course: " + course;
	}

}
