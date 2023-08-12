package com.groupingpriority;

import org.testng.annotations.Test;

public class GroupingPriority {

	@Test(groups = {"sanity"}, priority = 2)
	public void test1()
	{
		System.out.println("Atest1");
	}
	@Test(groups = {"sanity"}, priority = 1)
	public void test2()
	{
		System.out.println("Btest2");
	}
	@Test(groups = {"regression"}, priority = 4)
	public void test3()
	{
		System.out.println("Ctest3");
	}
	@Test(dependsOnMethods = {"test5"})
	public void test4()
	{
		System.out.println("Dtest4");
	}
	@Test(groups = {"sanity" , "regression"}, priority = 5)
	public void test5()
	{
		System.out.println("Etest5");
	}
}
