package com.groupingpriority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatAccount {
	@Test
	public void verifyByGmail() {
		System.out.println("Creat account via gmail");
		Assert.assertEquals("Monika", "Monika");   //pass
		
	}
	@Test
	public void verifyByYahoo() {
		System.out.println("Creat account via Yahoo");
		Assert.assertEquals("Monika", "Monikabcd");   //fail
	}
	@Test
	public void verifyByrediff() {
		System.out.println("Creat account via rediff");
		Assert.assertEquals("def", "DEF");   //pass
	}
 
	
}
