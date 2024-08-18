package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Admin;
import com.project.entity.Student;
import com.project.repository.AdminRepository;


@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepo;
	
	public Admin save(Admin admin) {
		return adminRepo.save(admin);
	}
	
	public Admin findAdminById(int id) {
		return adminRepo.findById(id);
	}
	

}

