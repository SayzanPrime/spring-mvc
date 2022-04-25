package com.example.crud.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private Long id;
	
	private String full_name;
	
	private String address;
	
	private String group_name;
}
