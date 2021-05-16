package com.mySB.myController;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mySB.model.Emp1;
import com.mySB.service.IEmpService;

@Controller
public class MyControlleorll {

	@Autowired
	private IEmpService service;
	
@GetMapping("/")	
	public String myCManish() {
	return "welcome";
}//
@GetMapping("/getEmp")	
public String myCManish1(Model m) {
	List <Emp1> e=service.getEmp();
	m.addAttribute("data", e);
	return "EmaployeeDetails";
}//
@GetMapping("/insertEmp")	
public String myCManish2(@ModelAttribute Emp1 e1,Model m) {
	return "EmaployeeForm";
}//
@PostMapping("/insertEmp")	
public String myCManish3(@ModelAttribute Emp1 e1,RedirectAttributes m) {
	Emp1 ee=service.insertEmp(e1);
	m.addFlashAttribute("message","employee inserted");
	return "redirect:/getEmp";
}//
	@GetMapping("/delete")	
	public String mydelete(@RequestParam("empno") Integer empno,RedirectAttributes m) {
		service.deleteEmp(empno);
		m.addFlashAttribute("message","employee deleted");
		return "redirect:/getEmp";
}//
	@GetMapping("/edit")	
	public String myedit(@RequestParam("empno") Integer empno, @ModelAttribute Emp1 e1) {
		Emp1 e= service.getEmpByID(empno);
		BeanUtils.copyProperties(e, e1);
		return "EmaployeeForm";
	}//
	@PostMapping("/edit")	
	public String myeditSubmitt(@ModelAttribute Emp1 e1) {
		service.insertEmp(e1);
		return "redirect:/getEmp";
	}//
}//class 
