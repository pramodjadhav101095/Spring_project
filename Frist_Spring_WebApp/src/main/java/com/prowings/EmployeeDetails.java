package com.prowings;

import java.util.Set;

public class EmployeeDetails {
	
    private	int eid;
    private String Name;
    private Double salary;
    private String designtion;
    private Set<String> accessories;
    
    
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int eid, String name, Double salary, String designtion, Set<String> accessories) {
		super();
		this.eid = eid;
		Name = name;
		this.salary = salary;
		this.designtion = designtion;
		this.accessories = accessories;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesigntion() {
		return designtion;
	}

	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}

	public Set<String> getAccessories() {
		return accessories;
	}

	public void setAccessories(Set<String> accessories) {
		this.accessories = accessories;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [eid=" + eid + ", Name=" + Name + ", salary=" + salary + ", designtion=" + designtion
				+ ", accessories=" + accessories + "]";
	}
	

}
