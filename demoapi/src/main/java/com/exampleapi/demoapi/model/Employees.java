package com.exampleapi.demoapi.model;

import org.springframework.stereotype.Component;

@Component
public class Employees {

	private int Eid;
	private String Ename;
	private int Esalary;
	
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employees(int eid, String ename, int esalary) {
		super();
		Eid = eid;
		Ename = ename;
		Esalary = esalary;
	}


	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEsalary() {
		return Esalary;
	}
	public void setEsalary(int esalary) {
		Esalary = esalary;
	}


	@Override
	public String toString() {
		return "Employees [Eid=" + Eid + ", Ename=" + Ename + ", Esalary=" + Esalary + "]";
	}
	
	
	
}
