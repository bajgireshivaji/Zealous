package Com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public static XSSFWorkbook wb;
public static void ExcelDataprovider() throws Exception {
	String path="C:\\Users\\LENOVO\\eclipse-workspace\\eclips data\\Zealous\\Testdata1\\spdata.xlsx";
	FileInputStream file=new FileInputStream(path);
	wb=new XSSFWorkbook(file);
		
}
public static String getStringData(String sheetname,int row, int cell) {
	return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
}
	
	
	
	
	
	
}
