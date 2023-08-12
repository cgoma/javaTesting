package com.TCS;

import org.testng.annotations.Test;



public class Grouping {

	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("validate Test1");
	}
	@Test(groups = {"sanity"})
	public void test2()
	{
		System.out.println("validate Test2");
	}
	@Test(groups = {"sanity"})
	public void test3()
	{
		System.out.println("validate Test3");
	}
	@Test(groups = {"regression"})
	public void test4()
	{
		System.out.println("validate Test4");
	}
	@Test(groups = {"regression"})
	public void test5()
	{
		System.out.println("validate Test5");
	}
}
