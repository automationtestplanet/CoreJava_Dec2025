package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws Exception {
//		String filePath = "D:\\Trainings\\Selenium-Java-RestAssured\\Dec2025\\eclipse\\CoreJava_Dec2025\\Files\\TestProperties.properties";
//		System.out.println(filePath);	
//		System.out.println(System.getProperty("user.dir"));	

		String filePath = System.getProperty("user.dir") + "\\Files\\TestProperties.properties";
		System.out.println(filePath);

		File testPropertiesFile = new File(filePath);
		Properties testProperties = new Properties();
		testProperties.load(new FileInputStream(testPropertiesFile));

		System.out.println(testProperties.getProperty("name"));
		System.out.println(testProperties.getProperty("roll.no"));
		System.out.println(testProperties.getProperty("location"));

		System.out.println(testProperties.getProperty("qualification"));

		testProperties.setProperty("qualification", "BTech");

		System.out.println(testProperties.getProperty("qualification"));

		FileOutputStream fos = new FileOutputStream(testPropertiesFile);
		testProperties.store(fos, "Updated By Raju");
		fos.close();

	}

}
