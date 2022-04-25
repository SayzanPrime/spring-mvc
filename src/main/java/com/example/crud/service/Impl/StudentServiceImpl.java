package com.example.crud.service.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.crud.constants.StudentQueries;
import com.example.crud.models.Student;
import com.example.crud.service.PrimaryService;

public class StudentServiceImpl implements PrimaryService<Student>{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;    
	}
	
	@Override
	public List<Student> getList() {
		return jdbcTemplate.query(StudentQueries.GET_STUDENTS, new RowMapper<Student>(){    
	        public Student mapRow(ResultSet rs, int row) throws SQLException {    
	        	Student student = new Student();    
	        	student.setId(rs.getLong(1));    
	        	student.setFull_name(rs.getString(2));    
	        	student.setAddress(rs.getString(3)); 
	        	student.setGroup_name(rs.getString(4)); 
	            return student;    
	        }  	
		});
	}
	
	// TODO: finding a better way
	@SuppressWarnings("deprecation")
	@Override
	public Student findByid(Long id) {
		
		return jdbcTemplate.queryForObject(StudentQueries.GET_STUDENT_BY_ID, new Object[]{id},
				new BeanPropertyRowMapper<Student>(Student.class));
	}

	@Override
	public void create(Student student) {
		jdbcTemplate.update(StudentQueries.SAVE_STUDENT, student.getFull_name(), 
				student.getAddress(), student.getGroup_name());
	}


	@Override
	public void update(Student student) {
		jdbcTemplate.update(StudentQueries.UPDATE_STUDENT, student.getFull_name(), 
				student.getAddress(), student.getGroup_name(), student.getId());
	}

	@Override
	public void delete(Long id) {
		jdbcTemplate.update(StudentQueries.DELETE_STUDENT, id);
	}

}
