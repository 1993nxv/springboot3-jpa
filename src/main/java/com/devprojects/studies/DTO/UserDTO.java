package com.devprojects.studies.DTO;

import java.io.Serializable;

import com.devprojects.studies.entities.User;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 2269586328383522536L;
	
	private Long id;
	private String name;
	private String email;
	
	public UserDTO() {}

	public UserDTO(User user) {

		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
}
