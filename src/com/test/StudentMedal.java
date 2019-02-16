package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentMedal {

	public Map<String,Student> getStudentMedal(final Student student) throws DuplicateStudentIdException{
		
		Map<String,Student> studentList = new HashMap<>();
		
		if(studentList.containsKey(student.getSwtudentId())) {
			throw new DuplicateStudentIdException("student id Alerady exists");
		}
		studentList.put(student.getSwtudentId(), student);
		return studentList;
	}
	public static void main(String[] args) {

		
	}

}
