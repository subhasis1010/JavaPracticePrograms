package samplePrograms;

import java.text.DateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Rough {

	public static void main(String[] args) 
	{
		
		ExtentReports report = new ExtentReports("./Reports/Index.html", true);
		ExtentTest logger = report.startTest("API Validations");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		Date today = new Date();
		String strDate = dateFormat.format(today).split(",")[0];
		System.out.println(strDate);
		
		report.endTest(logger);
		report.flush();
		
		for(int i=0;i<listEle.size();i++)
		{
			if(listEle.get(i).isSelected() == false)
			{
				listEle.get(i).click();
			}
			
		}

	}

}
