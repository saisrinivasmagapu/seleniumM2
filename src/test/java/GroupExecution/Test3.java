package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test(groups = "system")
	public void demo1()
	{
		Reporter.log("Test3 -demo1-system",true);
	}
	
	
	@Test(groups = "regresion")
	public void demo2()
	{
		Reporter.log("Test3 -demo2-regresion",true);
	}
	
	
	@Test(groups = {"system","regresion"})
	public void demo3()
	{
		Reporter.log("Test3 -demo1-system and regresion",true);
	}

}
