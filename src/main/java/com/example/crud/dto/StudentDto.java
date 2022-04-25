package com.example.crud.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

	private Long id;
	
	private String fullName;
	
	private String address;
	
	private Date birth_date;
	
	private Long group_id;
}
