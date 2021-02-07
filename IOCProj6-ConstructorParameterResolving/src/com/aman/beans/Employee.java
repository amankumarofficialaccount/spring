package com.aman.beans;

public class Employee {
	
	private int eno;
	private String ename;
	private String eadd;
	private String desg;
	private float sal;
	
	public Employee(int eno, String ename, String eadd, String desg, float sal) {
		System.out.println("Employee:5-ParamConstructor");
		this.eno = eno;
		this.ename = ename;
		this.eadd = eadd;
		this.desg = desg;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", eadd=" + eadd + ", desg=" + desg + ", sal=" + sal + "]";
	}
	
	

}
