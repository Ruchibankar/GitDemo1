package testNG;

import org.testng.annotations.Test;

public class Data_provider {
	@Test(groups= {"smoke"})
	public void test() {
		System.out.println("This is test");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void test1() {
		System.out.println("This is test1");
	}
	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("This is test2");
	}
	@Test(groups= {"smoke"})
	public void test3() {
		System.out.println("This is test3");
	}
	@Test
	public void test4() {
		System.out.println("This is test4");
	}
}
