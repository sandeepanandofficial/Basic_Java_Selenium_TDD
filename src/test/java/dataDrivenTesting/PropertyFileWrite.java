package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileWrite {
	
	public static void main(String[] args) throws IOException {
		
		//Create Object of FileInputStream class
		//Open the file in readable format
		FileInputStream fileInput = new FileInputStream(".\\src\\test\\resources\\PropertyFileWrite.properties");
		
		//Handling the file
		//Create an Object of Properties class
		Properties properties = new Properties();
		
		//Load the file and JVM will understand the Property file
		properties.load(fileInput);
		
		//Enter the data in key value pair
		properties.setProperty("Group", "Birds");
		properties.setProperty("Name", "Eagle");
		properties.setProperty("Number", "500");
		properties.setProperty("Type", "India Eagle");
		
		//Open the file in writable format
		FileOutputStream fileOutput = new FileOutputStream(".\\src\\test\\resources\\PropertyFileWrite.properties");
		
		//Store the writable file
		properties.store(fileOutput, "By Sandeep Anand");
		
		System.out.println("Property File is Updated");
		
		String value1 = properties.getProperty("Group");
		String value2 = properties.getProperty("Name");
		String value3 = properties.getProperty("Number");
		String value4 = properties.getProperty("Type");
		
		System.out.println("Group is " + value1);
		System.out.println("Name is " + value2);
		System.out.println("Number is " + value3);
		System.out.println("Type is " + value4);
	}
}
