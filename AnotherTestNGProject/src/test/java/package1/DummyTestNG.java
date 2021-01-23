package package1;

import org.testng.annotations.Test;

public class DummyTestNG {
	
	@Test(groups = "Group1")
	public void dummyMethod() {
		System.out.println("This is a Test method");
	}

}
