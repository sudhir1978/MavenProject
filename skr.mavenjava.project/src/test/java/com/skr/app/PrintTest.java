package com.skr.app;

import org.testng.annotations.Test;

public class PrintTest {
	
	@Test (groups = "print")
	public void PrintName(){
		System.out.println("My Name is Sudhir Kumar");
	}
	
	@Test (groups = "print")
	public void PrintCompany(){
		System.out.println("My Company name is DCG Data-Core India Pvt. Ltd.");
	}

}
