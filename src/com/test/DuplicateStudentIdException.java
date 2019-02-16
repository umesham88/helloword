package com.test;

@SuppressWarnings("serial")
public class DuplicateStudentIdException extends Exception{

	public DuplicateStudentIdException() {
		super();
	}

	public DuplicateStudentIdException(String message) {
		super(message);
		System.out.println(message);
	}

}
