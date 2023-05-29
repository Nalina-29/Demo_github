package assignment;

import org.testng.annotations.Test;

public class Data2 
{
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("bye");
	}
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("tata");
	}
	@Test(groups = {"sanity"})
	public void test3()
	{
		System.out.println("asia");
	}
}
