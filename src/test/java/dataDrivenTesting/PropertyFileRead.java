package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {
	
	public static void main(String[] args) throws IOException {
		
		//Open the file in java readable
		//Create Object of FileInputStream class
		FileInputStream fileInput = new FileInputStream(".\\src\\test\\resources\\PropertyFileRead.properties");
		
		//Create Object of Properties class
		//Handling the file
		Properties properties = new Properties();
		
		//Load the file and JVM will understand the Property file
		properties.load(fileInput);
		
		String value1 = properties.getProperty("group");
		String value2 = properties.getProperty("name");
		String value3 = properties.getProperty("number");
		String value4 = properties.getProperty("type");
		
		System.out.println("Group is " + value1);
		System.out.println("Name is " + value2);
		System.out.println("Number is " + value3);
		System.out.println("Type is " + value4);
	}
}
