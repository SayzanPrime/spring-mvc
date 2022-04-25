package com.example.crud.service;

import java.util.List;

public interface PrimaryService<T> {
	
	List<T> getList();
	
	T findByid(Long id);
	
	void create(T t);
	
	void update(T t);
	
	void delete(Long id);
	
}
