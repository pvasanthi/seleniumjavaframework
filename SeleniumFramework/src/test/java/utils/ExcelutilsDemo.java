package utils;

public class ExcelutilsDemo {
	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		Excelutils ex=new Excelutils(projectpath+"\\excel\\data.xlsx","Sheet1");
		ex.getRowCount();
		ex.getcelldatanumber(0, 0);
		ex.getcelldata(1, 1);
	}

}
