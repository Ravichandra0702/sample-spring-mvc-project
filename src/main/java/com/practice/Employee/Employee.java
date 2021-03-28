package com.practice.Employee;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Employee {
	
	@NotNull(message ="is required")
	@Size(min=2,message ="is required")
	private String employeeFirstName;
	
	private String employeeLastName;
	
	@NotNull(message ="is required")
	@Size(min=6,message ="is required")
	private String employeeId;
	
	private String employeeAddress;
	private String employeeDistrict;
	
	@NotNull(message ="is required")
	@Size(min=10, message="it should be 10 alphanumeric")
	private String employeePancard;
	
	private LinkedHashMap<String, String> districtOPtions;
	
	public Employee() {
		districtOPtions= new LinkedHashMap<String, String>();
		districtOPtions.put("ogl", "Ongole");
		districtOPtions.put("chl", "Chirala");
		districtOPtions.put("Vnk", "Vinakonda");
		districtOPtions.put("Gnt", "Guntur");
	}

	public LinkedHashMap<String, String> getDistrictOPtions() {
		return districtOPtions;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeDistrict() {
		return employeeDistrict;
	}

	public void setEmployeeDistrict(String employeeDistrict) {
		this.employeeDistrict = employeeDistrict;
	}

	public String getEmployeePancard() {
		return employeePancard;
	}

	public void setEmployeePancard(String employeePancard) {
		this.employeePancard = employeePancard;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
}
