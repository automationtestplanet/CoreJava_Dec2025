package iostreams;

import java.io.File;
import java.io.FileInputStream;

public class ReadDataFromNotepadFile {

	public static void main(String[] args) throws Exception {
String filePath = "D:\\Trainings\\Selenium-Java-RestAssured\\Dec2025\\eclipse\\CoreJava_Dec2025\\Files\\InputData.txt";
		
		File inputFile = new File(filePath);
		
		FileInputStream fis = new FileInputStream(inputFile);
		
		System.out.println(fis.available());
		byte[] byteArr = new byte[fis.available()];
		fis.read(byteArr);
		
		String fileContent = new String(byteArr);
		
		System.out.println(fileContent);
		
		fis.close();

	}

}
