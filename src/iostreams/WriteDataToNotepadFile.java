package iostreams;

import java.io.File;
import java.io.FileOutputStream;

public class WriteDataToNotepadFile {

	public static void main(String[] args) throws Exception {

		String ouputData = "Hi this is Java FileOutputStream program";
		byte[] outputArr = ouputData.getBytes();

		String filePath = "D:\\Trainings\\Selenium-Java-RestAssured\\Dec2025\\eclipse\\CoreJava_Dec2025\\Files\\OutputData.txt";
		File outputFile = new File(filePath);

		FileOutputStream fos = new FileOutputStream(outputFile);
		fos.write(outputArr);
		fos.flush();
		fos.close();
	}

}
