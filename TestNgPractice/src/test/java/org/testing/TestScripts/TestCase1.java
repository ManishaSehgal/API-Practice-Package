package org.testing.TestScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
  @BeforeSuite	
   public void beforeSuite() {
	   System.out.println("Before Suite");
   }
   
  @AfterSuite
   public void afterSuite() {
	   System.out.println("After Suite");
   }
   
  @BeforeTest
   public void beforeTest() {
	   System.out.println("Before Test");
   }
   
  @AfterTest 
  public void afterTest() {
	   System.out.println("After Test");
   }
   
  @BeforeClass
   public void beforeClass()
   {
	   System.out.println("Before Class");
   }
   
  @AfterClass
   public void afterClass()
   {
	   System.out.println("After Class");
   }
   
  @BeforeMethod
	public void beforeMethod() {
		System.out.println("I am Before Method");
	}
  
 
	
	
	@Test (groups = "Group1")
	public void testCase1() {
		System.out.println("I am Test Case 1");
	}

	
	@Test(dependsOnGroups = "Group1")
	public void testCase2() {
		System.out.println("I am Test Case 2");
	}
	
	@Test(groups = "Group1" )
	public void testCase3() {
		System.out.println("I am test case 3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after method");
	}
}
