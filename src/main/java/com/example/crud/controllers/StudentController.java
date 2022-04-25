package com.example.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.crud.models.Student;
import com.example.crud.service.Impl.StudentServiceImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentDaoImpl;
	
	@GetMapping("/")
	public String home(){
		return "redirect:/getStudents";
	}
	
	@GetMapping("/getStudents")
	public String getStudents(Model model){
		List<Student> students = studentDaoImpl.getList();
		model.addAttribute("students", students);
		return "student-page";
	}
	
	@GetMapping("/addForm")
	public String addStudent(Model model){
		model.addAttribute("student", new Student());  
		return "add-student";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student){
		studentDaoImpl.create(student); 
		return "redirect:/getStudents";
	}
	
	@GetMapping("/editForm/{id}")
	public String editForm(@PathVariable("id") Long id, Model model){
		Student student = studentDaoImpl.findByid(id);
		model.addAttribute("student", student);
		return "edit-student";
	}
	
	@PostMapping("/editStudent")
	public String editStudent(@ModelAttribute("student") Student student){
		studentDaoImpl.update(student); 
		return "redirect:/getStudents";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String saveStudent(@PathVariable("id") Long id){
		studentDaoImpl.delete(id); 
		return "redirect:/getStudents";
	}
	
}
