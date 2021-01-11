package com.exampleapi.demoapi.virtualdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.exampleapi.demoapi.model.Employees;

@Component
public class Vrtual {

	private static List <Employees> list = new ArrayList<>();
	
	static {
		
		list.add(new Employees(101,"Lokesh",900));
		list.add(new Employees(1012,"yash",900));
	}
	
	public List<Employees> getallemp()
	{
		return list;
	}
	
	
	
}