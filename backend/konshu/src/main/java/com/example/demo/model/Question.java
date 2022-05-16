package com.example.demo.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Questions")

public class Question {

	@Id
	private int id;
	private String Subject;
	private String Autor;
	private Map<String, String> SelectionOptions;
	private String Answer;
	private String Sustentation;
	
	public Question() {
		
	}
	
	public Question(int id, String subject, String autor, Map<String, String> selectionOptions, String answer,
			String sustentation) {
		super();
		this.id = id;
		Subject = subject;
		Autor = autor;
		SelectionOptions = selectionOptions;
		Answer = answer;
		Sustentation = sustentation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public Map<String, String> getSelectionOptions() {
		return SelectionOptions;
	}

	public void setSelectionOptions(Map<String, String> selectionOptions) {
		SelectionOptions = selectionOptions;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public String getSustentation() {
		return Sustentation;
	}

	public void setSustentation(String sustentation) {
		Sustentation = sustentation;
	}
	
	

	

}
