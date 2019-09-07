package com.eric.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	private String login;
	private Integer id;

	public User() {}

	public User(String login, Integer id) {
		super();
		this.login = login;
		this.id = id;
	}

	public String getLogin() {
	return login;
	}

	public void setLogin(String login) {
	this.login = login;
	}

	public Integer getId() {
	return id;
	}

	public void setId(Integer id) {
	this.id = id;
	}
	

	
}
