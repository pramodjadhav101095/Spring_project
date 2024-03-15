package com.prowings;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Company {

	private String comName;
	private String location;
	private List<EmployeeDetails> employeedetails;
	private Map<Integer, String> client;
	private Properties companyprop;
	

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Company(String comName, String location, List<EmployeeDetails> employeedetails, Map<Integer, String> client,
			Properties companyprop) {
		super();
		this.comName = comName;
		this.location = location;
		this.employeedetails = employeedetails;
		this.client = client;
		this.companyprop = companyprop;
	}


	public String getComName() {
		return comName;
	}


	public void setComName(String comName) {
		this.comName = comName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<EmployeeDetails> getEmployeedetails() {
		return employeedetails;
	}


	public void setEmployeedetails(List<EmployeeDetails> employeedetails) {
		this.employeedetails = employeedetails;
	}


	public Map<Integer, String> getClient() {
		return client;
	}


	public void setClient(Map<Integer, String> client) {
		this.client = client;
	}


	public Properties getCompanyprop() {
		return companyprop;
	}


	public void setCompanyprop(Properties companyprop) {
		this.companyprop = companyprop;
	}


	@Override
	public String toString() {
		return "Company [comName=" + comName + ", location=" + location + ", employeedetails=" + employeedetails
				+ ", client=" + client + ", companyprop=" + companyprop + "]";
	}


}
