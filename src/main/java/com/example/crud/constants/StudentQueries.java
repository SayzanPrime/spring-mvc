package com.example.crud.constants;

public class StudentQueries {
	
	public static final String GET_STUDENTS = "SELECT * FROM STUDENT";
	
	public static final String GET_STUDENT_BY_ID = "SELECT * FROM STUDENT WHERE ID = ?";
	
	public static final String SAVE_STUDENT = "INSERT INTO STUDENT(FULL_NAME, ADDRESS, GROUP_NAME) "
											+ "VALUES(?, ?, ?)";
	
	public static final String UPDATE_STUDENT = "UPDATE STUDENT SET FULL_NAME = ?, ADDRESS = ?, GROUP_NAME = ? "
											+ "WHERE ID = ?";
	
	public static final String DELETE_STUDENT = "DELETE FROM STUDENT WHERE ID = ?";
}
