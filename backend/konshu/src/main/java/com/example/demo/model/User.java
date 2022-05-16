package com.example.demo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")

public class User {
	
	private String Username;
	private String Rol;
	private String Password;
	private List<Question> CreatedQuestions;
	private List<Exam> AsignedExams;
	private List<Exam> CreatedExams;
	private List<Score>MyScores;
	public User() {
		
	}

	public User(String username, String rol, String password, List<Question> createdQuestions, List<Exam> asignedExams,
			List<Exam> createdExams) {
		super();
		Username = username;
		Rol = rol;
		Password = password;
		CreatedQuestions = createdQuestions;
		AsignedExams = asignedExams;
		CreatedExams = createdExams;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public List<Question> getCreatedQuestions() {
		return CreatedQuestions;
	}

	public void setCreatedQuestions(List<Question> createdQuestions) {
		CreatedQuestions = createdQuestions;
	}

	public List<Exam> getAsignedExams() {
		return AsignedExams;
	}

	public void setAsignedExams(List<Exam> asignedExams) {
		AsignedExams = asignedExams;
	}

	public List<Exam> getCreatedExams() {
		return CreatedExams;
	}

	public void setCreatedExams(List<Exam> createdExams) {
		CreatedExams = createdExams;
	}
	
}
