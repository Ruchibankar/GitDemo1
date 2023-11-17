package testNG;

import org.testng.annotations.Test;

public class Test_testNG {
	@Test(priority=2,invocationCount=3)
	public void test1() {  //test cases not method
		System.out.println("test 1");
	}
	@Test(priority=0)
	public void test2() {
		System.out.println("test 2");
	}
	@Test(priority=-1,enabled=false)
	public void test3() {
		System.out.println("test 3");
	}
	@Test(priority=1)
	public void test4() {
		System.out.println("test 4");
	}
	//invocationCount=executing tescases multiple times
	//for skip the particular testcase we can use invocationCount=0 or enabled=false




















































}

