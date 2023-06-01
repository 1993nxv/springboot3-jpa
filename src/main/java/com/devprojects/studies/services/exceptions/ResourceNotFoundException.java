package com.devprojects.studies.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4553890247783204998L;

	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id: " + id);
	}
	
}
