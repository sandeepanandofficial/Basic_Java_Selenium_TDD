package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 {
	
	@Test(dataProvider = "getData")
	public void dataProvider(String name, int price)
	{
		System.out.println("Mobile name is : " + name + " and price is : " + price);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Samsung";
		data[0][1] = 15999;
		
		data[1][0] = "Vivo";
		data[1][1] = 18999;
		
		data[2][0] = "Realmi";
		data[2][1] = 16999;
		
		return data;
	}
}
