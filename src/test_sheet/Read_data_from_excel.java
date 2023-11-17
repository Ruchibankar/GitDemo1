package test_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_from_excel {
	void dataread() {
		try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Ruchika\\OneDrive\\Desktop\\TestSheet1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		XSSFRow row=sh.getRow(0);
		XSSFRow row1=sh.getRow(1);
		XSSFRow row2=sh.getRow(2);
		XSSFRow row3=sh.getRow(3);
		//webelement is a interface
		
		//for getting username
		String cell0=row.getCell(0).getStringCellValue();
		//System.out.println(cell0);
		
		//for getting password
		String cell1=row.getCell(1).getStringCellValue();
		//System.out.println(cell1);
		System.out.println(cell0+" "+cell1);
		String r1cell1=row1.getCell(0).getStringCellValue();
		String r1cell2=row1.getCell(1).getStringCellValue();
		System.out.println(r1cell1+" "+r1cell2);
		String r2cell3=row2.getCell(0).getStringCellValue();
		String r2cell4=row2.getCell(1).getStringCellValue();
		System.out.println(r2cell3+" "+r2cell4	);
		String r3cell5=row3.getCell(0).getStringCellValue();
		String r3cell6=row3.getCell(1).getStringCellValue();
		System.out.println(r3cell5+" "+r3cell6);
		
		
		wb.close();
		fis.close();
	}catch(IOException e) {
		System.out.println(e);
		
	}
}
		public static void main(String args[]) {
			Read_data_from_excel p=new Read_data_from_excel ();
			p.dataread();
		}
	}
	


