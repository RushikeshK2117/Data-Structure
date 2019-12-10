package com.rushikeshk.software;

public abstract class Engineer {
	//state
	public final int id;
	
	public Engineer(int id) {
		this.id=id;
	}
	
	
	//behaviour
	public abstract void design();
	
	//this is abstract method
	
	public void develope()
	{
		System.out.println("Devlope Softwares...");
	}
	
	public void test()
	{
		System.out.println("Test Softwares...");
	}
	
	public boolean equals(Object obj) {
		Engineer a = (Engineer)obj;
		return a.id == this.id;
	}
}
