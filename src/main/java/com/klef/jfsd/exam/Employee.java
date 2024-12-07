package com.klef.jfsd.exam;

import java.util.List;

public class Employee {
	
	   

		private int id; // primitive data type
	    private String name;// non primitive data type
	    private double salary; // primitive data type
	    private boolean department; // primitive data type
	    private List<String> skills;// non primitive data type
		
	    
	    public Employee(int id, String name, double salary, boolean department, List<String> skills) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.department = department;
			this.skills = skills;
		    }
	    
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
					+ ", skills=" + skills + "]";
		}

}
