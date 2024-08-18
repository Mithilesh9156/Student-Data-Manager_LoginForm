package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.entity.Admin;
import com.project.entity.Student;
import com.project.service.AdminService;
import com.project.service.StudentService;
import jakarta.validation.Valid;

@Controller
public class HomeController {

	@Autowired
	AdminService adminService;

	@Autowired
	StudentService stdService;

	@GetMapping("/")
	public String home() {

		return "loginPage.jsp";
	}

//-----------Admin login controller--------------------------------------------------------------------	

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute Admin admin, BindingResult result, Model model) {

		if (result.hasErrors()) {
			String key = "Enter valid Id and Password";
			model.addAttribute("key", key);
			return "loginPage.jsp";
		}

		Admin existingId = adminService.findAdminById(admin.getId()); // finding id & password out of database

		if (existingId != null && existingId.getPassword().equals(admin.getPassword())) {

			model.addAttribute("admin", adminService.findAdminById(admin.getId())); // getting compared admin id from
																					// database to input
																					// text on webpage

			return "home.jsp";
		} else {
			result.reject("admin.error", "Invalid Id or Password");
			return "loginPage.jsp";
		}
	}
//-------------------------------------------------------------------------------------------------------------------

//	@GetMapping("showStudent")
//	public String showAllData(@ModelAttribute("students") Student student, Model model) {
//
//		List<Student> students = stdService.findAllStudent();
//		
//		model.addAttribute("students", students);
//
//		return "showAllData2.html";
//	}

// -----------calling insert page----------------------------------------------------------------------------------------------

	@GetMapping("/insert")
	public String create() {

		return "insert.jsp";
	}

	// ------------- Handling insert page
	// --------------------------------------------------------------------------------------------

	@PostMapping("/form")
	public String submit(@Valid @ModelAttribute Student student, BindingResult result, Model model) {

		if (result.hasErrors()) {

			String error = "Error! Invalid data";
			model.addAttribute("error", error);

			String instruct = "Fields must not be empty. Enter data correctly";
			model.addAttribute("instruct", instruct);
			
			return "insert.jsp";
		}

		stdService.saveStudent(student);
		String insert = "Inserted Successfully";
		model.addAttribute("insert", insert);
		return "home.jsp";
	}


//--------------calling Update Page-------------------------------------------------------------------------	
	@GetMapping("/update")
	public String updatePage() {

		return "update.jsp";
	}
	

//-------------- Update Data-------------------------------------------------------------------------	
	
	@PostMapping("/updateForm")
	public String updateStudent(@Valid @ModelAttribute Student student, @RequestParam("userId") Integer userId ,BindingResult result ,Model model) {
		
		if(result.hasErrors()) { 
			String error = "Invalid input";
		  model.addAttribute("error", error); 
		  return "update.jsp"; 
		  }
		 
		try {
		  Optional<Student> optStdId = stdService.findStdById(student.getUserId()); //  finds the id in database
		  List<Student> optAll = stdService.findAllStd();
		  
		  
			 if(optStdId.get() == optAll) {
			  stdService.saveStudent(student);
			 }
			 else {
				 result.reject("student.error", "Invalid Input, enter valid data");
			 }
			 
		 }
		 catch (Exception e) {
			e.getMessage();
		}
		  
		  // RUNNING CODE = STARTS HERE
//		  try { 
//			  if(optStdId.get() != null) {
//				  String success = "Updated Successfully";
//				  model.addAttribute("success", success);
//				  return "home.jsp";
//
//		      }
//			  else{
//				  String error = "Invalid input"; 
//				  model.addAttribute("error", error);
//				  result.reject("error", error);
//		           return "update.jsp";
//		       }
//		  
//		  
//		 } 
//		  catch (Exception e) {
//			  e.printStackTrace();
//		  } 
		// ENDS HERE  
      		  
		 // model.addAttribute("id", stdService.findStdById(userId));
		  
		  
		  // if(optStd.isEmpty() == false && optStd.equals(student.getUserId())) {
		  
		  student.setUserId(userId);
		  student.setName(student.getName());
		  student.setEmail(student.getEmail());
		  student.setPhoneNo(student.getPhoneNo());
		  student.setDate(student.getDate());
		  student.setFees(student.getFees());
		  student.setCourse(student.getCourse());
		  
		  
		  model.addAttribute("id", student); 
		  stdService.saveStudent(student);
		  
		  
		  // return "update.jsp"; 
		  // } 
		  // else { String error = "Invalid input";
		  // model.addAttribute("error", optStd);
		  return "home.jsp"; 
		  // }
	}

	
// ----------FOR BACK TO HOME PAGE--------------------------------------------------------------------------------	
	@GetMapping("/back")
	public String back() {
		
		return "home.jsp";
	}
//----------------DELETE PAGE---------------------------------------------------------------------------
	
	@GetMapping("/delete")
	public String delete() {
		
		return "delete.jsp";
	}
//-----------DELETE- ID---------------------------------------------------------------------------------
	
	@GetMapping("/deleteId")
	public String deleteId(@ModelAttribute Student student, @RequestParam("userId") int userId, Model model) {
		
		stdService.deleteId(student.getUserId());
		
		String delete = "Deleted Succesfull ";
		model.addAttribute("delete", delete);
		
		return "home.jsp";
	}
}

