package automationDay2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
    FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book1.xlsx");
    XSSFWorkbook wb=new XSSFWorkbook(file);
    XSSFSheet sheet=wb.getSheet("sheet1");
    int r=sheet.getLastRowNum();
    int c=sheet.getRow(1).getLastCellNum();
    
    for(int i=0;i<=r;i++)
    {
    	XSSFRow row=sheet.getRow(i);
    	 
    	for(int j=0;j<c;j++)
    	{
    		XSSFCell column=row.getCell(j);
    		System.out.println(column);
    	}
    	
    	System.out.println("");
    }
    
    wb.close();
    file.close();
    
    
	}

}
