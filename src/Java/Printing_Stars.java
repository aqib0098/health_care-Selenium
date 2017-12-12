package Java;

import java.sql.Array;
import java.util.function.Function;

public class Printing_Stars {
	
	// Printing Stars

	public static void main(String[] args) {
		
		int i,j,k;
		for(i=1; i<=5; i++)
		{
		for(j=4; j>=i; j--)
		{
		System.out.print(" ");
		}
		for(k=1; k<=(2*i-1); k++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		}
	String name="General Medicine";
	  String updatedName="General Medicine Symptom";
	  List<WebElement> tdList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
	  for(int i =0 ; i< tdList.size();i++)
	  {
	   if(tdList.get(i).getText().contains("General Medicine"))
	   {
	    driver.findElement(By.id("appointmentschedulingui-edit-"+name)).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("name-field")).clear();
	    driver.findElement(By.id("name-field")).sendKeys(updatedName);
	    driver.findElement(By.id("description-field")).clear();
	    driver.findElement(By.id("description-field")).sendKeys(updatedName);
	    driver.findElement(By.id("save-button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("appointmentschedulingui-edit-"+updatedName)).click();
	     
	   }

}


