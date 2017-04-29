package info.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupGmail {
	
		    public static void main(String[] args){
				
		    	WebDriver driver = null;
		    	WebDriverWait wdw=new WebDriverWait(driver,10);
		    	
		    	try{
		    		
		    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mazbaul\\Desktop\\BroutForce QC\\Environment Java,SE,Eclipse\\geckodriver.exe");   	
		    	
		    	
		    	driver= new FirefoxDriver();
		    	driver.get("https://accounts.google.com/SignUp?");
		 
		        driver.manage().window().maximize();
		        
		        driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Brute");
		        driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("force");
		        driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys("hwbf9911");
		        driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("bf098765");
		        driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys("bf098765");
		        
		        
		        driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).click();
		        driver.findElement(By.xpath(".//*[@id=':4']")).click();
		        
		        
		        driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("29");
		        driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1980");
		        
		        driver.findElement(By.xpath(".//*[@id='Gender']/div")).click();
		        driver.findElement(By.xpath(".//*[@id=':g']/div")).click();
		        
		        
		        driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys("2126580277");
		        
		        driver.findElement(By.xpath(".//*[@id=':i']")).click();
		        driver.findElement(By.xpath(".//*[@id=':7d']/div")).click();
		        
		        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='submitbutton']"))).click();
		        //driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();      
		        //driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();     
		        //Thread.sleep(5000);
		        
     		    //driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
     		    wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='tos-scroll-button']/div/img"))).click();
     		    
     		    //driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
     		    
		        //Thread.sleep(5000);
     		    wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='cancelbutton']"))).click();


     		    //driver.findElement(By.xpath(".//*[@id='cancelbutton']")).click();
		        //Thread.sleep(5000);
		        
		    	} catch(Exception e){
		    		e.getStackTrace();
		    	}finally{
		            driver.quit();
		    	}
		    }
		
		
		
		
	}


