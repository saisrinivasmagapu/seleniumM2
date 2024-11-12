package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1:convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/SkillRary.xlsx");
		
		//Step 2: Open WorkBook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3: Get Control Over Particular Sheet
		Sheet sheet = wb.getSheet("Sheet1");
		
		//Step 4: Get Control Over Particular Row
		Row row = sheet.getRow(3);
		
		// step 5 : Get Control over Particular Cell
		 Cell cell = row.getCell(1);
		 
		 
		
		
		
		
	}

}
