package com.practice.Employee;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor string= new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, string);
		
	}
	@RequestMapping("/showForm")
	public String employeeRegistration(Model model) {
		Employee employee= new Employee();
		model.addAttribute("employee", employee);
		return "Employee-Form";
	}
	
	@RequestMapping("/processEmployeeForm")
	public String employeeConformation(@Valid @ModelAttribute("employee") Employee employee,BindingResult thebindingResult) {
		
		System.out.println(" Employee Details"+ employee.getEmployeeFirstName()+"\n"+employee.getEmployeeLastName()+"\n"+
		employee.getEmployeeAddress()+"\n"+employee.getEmployeeDistrict()+"\n"+employee.getEmployeePancard()+"\n"+
				employee.getEmployeeId());
		if(thebindingResult.hasErrors()) {
			return "Employee-Form";
		}else {
			return "Employee-Conformation";
		}
	}
}
