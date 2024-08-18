package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.entity.Student;
import com.project.repository.StudentRepository;


@Service
public class StudentService {

	@Autowired(required = true)
	StudentRepository stdRepo;
	
	public void saveStudent(Student student) {
		 stdRepo.save(student);
	}
	
	
	public Optional<Student> findStdById(int id) {
		return stdRepo.findById(id);
	}
	
	
	public List<Student> findAllStd() {
		return stdRepo.findAll();
	}
	
	
	public void deleteId(int id) {
		 stdRepo.deleteById(id);
		
	}
	
}
