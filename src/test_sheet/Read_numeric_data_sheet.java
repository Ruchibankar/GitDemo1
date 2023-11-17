package test_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_numeric_data_sheet {
	void numericdata() {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Ruchika\\OneDrive\\Desktop\\TestSheet2.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook (fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			
			int rowCount=sh.getLastRowNum();
			System.out.println("Total Row Count:"+rowCount);
			for(int r=0;r<=rowCount;r++) {
				XSSFRow row=sh.getRow(r);
				int col=sh.getRow(r).getLastCellNum();
				
			for(int c=0;c<col;c++) {
				XSSFCell cell=row.getCell(c);
				
			switch(cell.getCellType()) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			}
		
			}
			System.out.println();
			}
			
		}catch(IOException e) {
			System.out.println(e);
			
		}
	}
				
		public static void main(String[]args) {
			Read_numeric_data_sheet f=new Read_numeric_data_sheet();
			f.numericdata();
		}
		
	}


