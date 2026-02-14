package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcelFIle {

	public static void main(String[] args) throws Exception {
		File excelFile = new File(System.getProperty("user.dir") + "\\Files\\Test.xlsx");
		FileInputStream excelFis = new FileInputStream(excelFile);

		XSSFWorkbook excelWorkBook = new XSSFWorkbook(excelFis);
		XSSFSheet newSheet = excelWorkBook.createSheet("Dec2025");
		Row firstRow = newSheet.createRow(0);
		Cell firstCell = firstRow.createCell(0);
		firstCell.setCellValue("This is New cell created through code");

		FileOutputStream fos = new FileOutputStream(excelFile);
		excelWorkBook.write(fos);
		fos.close();
		excelFis.close();
	}

}
