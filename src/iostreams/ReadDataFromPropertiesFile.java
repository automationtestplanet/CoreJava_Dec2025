package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\Trainings\\Selenium-Java-RestAssured\\Dec2025\\eclipse\\CoreJava_Dec2025\\Files\\TestProperties.properties";
		File propFile = new File(filePath);
		FileInputStream fis  = new FileInputStream(propFile);
		
		Properties testProperties = new Properties();
		testProperties.load(fis);
		
		System.out.println(testProperties.getProperty("name"));
		System.out.println(testProperties.getProperty("roll.no"));
		System.out.println(testProperties.getProperty("location"));
		
		System.out.println(testProperties.getProperty("qualification"));
		
		testProperties.setProperty("qualification", "BTech");
		
		System.out.println(testProperties.getProperty("qualification"));
		
		fis.close();
	}

}
