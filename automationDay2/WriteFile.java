package automationDay2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileOutputStream fi=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		/* for(int i=0;i<=r;i++)
		    {
		    	XSSFRow row=sheet.createRow(i);
		    	 
		    	for(int j=0;j<c;j++)
		    	{
		    		XSSFCell column=row.createCell(j);
		    		column.setCellValue(sc.next());
		    		//System.out.println(column);
		    	}
		    	
		    	System.out.println("");
		    }*/
		
		
		    XSSFRow row= sheet.createRow(0);
			XSSFCell column=row.createCell(0);
    		column.setCellValue("abc");
    		
    		
		 
		   
		    workbook.write(fi);
		    workbook.close();
		    fi.close();

		
		
	}

}
