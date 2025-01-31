package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataUsingDataFormatter {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/SkillRary.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		
	DataFormatter df = new DataFormatter();
	Map<String, String> map = new HashMap<String,String >();
	
	for(int i = 0; i<=sheet.getLastRowNum(); i++)
	{
		String key = df.formatCellValue(sheet.getRow(i).getCell(0));
		String value = df.formatCellValue(sheet.getRow(i).getCell(i));
		map.put(key, value);
		
	}
		System.out.println(map);
		wb.close();
	}

}
