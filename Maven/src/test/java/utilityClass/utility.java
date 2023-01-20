package utilityClass;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility {
	
	public static String getTD(int rowIndex , int cellIndex) throws Throwable { //static method ..this we call in result class
		
		File f = new File("C:\\Users\\PRAFULLA\\Desktop\\POM\\Book1.xlsx");
		FileInputStream fil = new FileInputStream(f);
		 Sheet sh = WorkbookFactory.create(fil).getSheet("Sheet1");
		String data =sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data; // common func
		
	}

	

}
