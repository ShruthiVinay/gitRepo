package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String getDataFromProperties(String key) throws IOException{
		
		FileInputStream fisObj=new FileInputStream("./config.properties");
		
		Properties pObj=new Properties();
		pObj.load(fisObj);
		
		String value=pObj.getProperty(key);
		return value;
	}
	
	public void getDataFromExcel() throws IOException {
		FileInputStream fisObj=new FileInputStream("./inputdata.xlsx");
		
		Workbook wb=WorkbookFactory.create(fisObj);
		//value=wb.getSheet(arg0)
		
		
	}

}
