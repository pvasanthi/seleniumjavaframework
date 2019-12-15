package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public Excelutils(String Excelpath,String sheetname){
		try{
			projectpath=System.getProperty("user.dir");
			workbook=new XSSFWorkbook("Excelpath");
			sheet=workbook.getSheet("sheetname");
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static int getRowCount(){
		int rowcount=0;
		try
		{

			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowcount;
	}
	public static int getcolCount(){
		int colcount=0;
		try
		{

			int colCount=sheet.getPhysicalNumberOfRows();
			System.out.println(colcount);
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colcount;
	}
	
	public  static void getcelldata(int rowNum,int colNum){
		try{
			String celldata=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(celldata);
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public  static void getcelldatanumber(int rownum,int colnum){
		try{
			double celldatanumber=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			System.out.println(celldatanumber);
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		getRowCount();
		getcelldata(0,0);
		getcelldatanumber(1,1);
	}

}