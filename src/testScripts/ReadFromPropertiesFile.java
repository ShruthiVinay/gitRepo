package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// Step1: Get the javaObject of the physical file
		FileInputStream fisObj=new FileInputStream("./config.properties");
		
		//Step2: Using properties class load all the key
		Properties pObj=new Properties();
		
		pObj.load(fisObj);
		
		//Step3: read the value using getProperty(key) like HashMap
		String URL=pObj.getProperty("url");
		String USERNAME=pObj.getProperty("username");
		String PASSWORD=pObj.getProperty("password");
		String BROWSER=pObj.getProperty("browser");
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);
	}
}
