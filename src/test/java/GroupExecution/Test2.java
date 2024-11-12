package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(groups = "regresion")
	public void demo1()
	{
		Reporter.log("Test2 -demo1-regresion",true);
	}
	
	
	@Test(groups = "somke")
	public void demo2()
	{
		Reporter.log("Test2 -demo2-smoke",true);
	}
	
	
	@Test(groups = {"smoke","regresion"})
	public void demo3()
	{
		Reporter.log("Test2 -demo1-smoke and regresion",true);
	}

}
