package rtmediapackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class QAAssignment {

	private static WebDriver driver = null;
			
		public static void main(String[] args) throws IOException, InterruptedException {
			
			// Create a new instance of the Firefox driver
		
			driver = new FirefoxDriver();
 
			driver.manage().window().maximize();
			
			//Put a Implicit wait
 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
			QAAssignment qa = new QAAssignment();   

			qa.registerCaseOne();
			
			qa.registerCaseTwo();
			
			qa.existingCaseOne();
			
			qa.existingCaseTwo();
			
			qa.existingCaseThree();
			
			qa.validLoginCaseOne();
			
			qa.validLoginCaseTwo();
			
			qa.invalidLoginCaseOne();
			
			qa.invalidLoginCaseTwo();
			
			qa.invalidLoginCaseThree();
			
			qa.invalidLoginCaseFour();
			
			qa.invalidLoginCaseFive();
			
			qa.invalidLoginCaseSix();
			
			qa.postMediaCaseOne();
			
			qa.postMediaCaseTwo();
			
			qa.updateProfileCase();
			
			qa.uploadInMediaCaseOne();
			
			qa.uploadInMediaCaseTwo();
			
			qa.uploadInMediaURLCaseOne();
			
			qa.uploadInMediaURLCaseTwo();
			
			
		}
        
//	1. Get register on rtMedia
		
        public void registerCaseOne() {
        
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        
        	// Find the element that's name attribute is 'Register' 
        
        	driver.findElement(By.name("Register")).click();
        	
        	// Find the element that's name attribute is 'Username (required)' 
            
        	driver.findElement(By.name("Username (required)")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's name attribute is 'Email Address (required)' 
            
        	driver.findElement(By.name("Email Address (required)")).sendKeys("snehal.choubal@gmail.com");
        	
        	// Find the element that's name attribute is 'Choose a Password (required)' 
            
        	driver.findElement(By.name("Choose a Password (required)")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's name attribute is 'Confirm Password (required)' 
            
        	driver.findElement(By.name("Confirm Password (required)")).sendKeys("Snehal_Choubal");
        	
        	// Wait for the security question to be answered. Please type in the answer
        	
        	System.out.println("Please fill out the Security Question field...");
        	
        	//Put a Implicit wait, for the answer
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        	
        	
        	// Find the element that's name attribute is 'Name (required)' 
            
        	driver.findElement(By.name("Name (required)")).sendKeys("Snehal Choubal");
        	
        	// Find the element that's name attribute is 'city (required)' 
            
        	driver.findElement(By.name("city (required)")).sendKeys("Pune");
        	
        	
        	// Find the element that's ID attribute is 'field_3' 
            
        	Select gender = new Select(driver.findElement(By.id("field_3")));
        	gender.selectByVisibleText("Female");
        	
        	// Find the element that's ID attribute is 'field_4_day' 
            
        	Select day = new Select(driver.findElement(By.id("field_4_day")));
        	day.selectByVisibleText("6");
        	
        	// Find the element that's ID attribute is 'field_4_month' 
            
        	Select month = new Select(driver.findElement(By.id("field_4_month")));
        	month.selectByVisibleText("May");
        	
        	// Find the element that's ID attribute is 'field_4_year' 
            
        	Select year = new Select(driver.findElement(By.id("field_4_year")));
        	year.selectByVisibleText("1990");  
        	
        	// Find the element that's ID attribute is 'signup_submit' 
            
        	driver.findElement(By.id("signup_submit")).click();
        	
        	//Put a Implicit wait
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Check Your Email To Activate Your Account!' 
            
        	driver.findElement(By.name("Check Your Email To Activate Your Account!"));
        	
        	// Close the driver
        	
        	driver.close();
        }
        
        public void registerCaseTwo() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Security Question' 
            
        	driver.findElement(By.name("Security Question")).sendKeys("");
        	
        	// Wait for the security question to be answered. Please type in the answer
        	
        	System.out.println("Please fill out the Security Question field...");
        	
        	//Put a Implicit wait, for the answer
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
        	
        	// Find the element that's ID attribute is 'signup_submit' 
            
        	driver.findElement(By.id("signup_submit")).click();
        	
        	//Put a Implicit wait
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Please enter a username' 
            
        	driver.findElement(By.name("Please enter a username"));
        	
        	// Find the element that's name attribute is 'Please check your email address.' 
            
        	driver.findElement(By.name("Please check your email address."));
        	
        	// Close the driver
        	
        	driver.close();
        }
        
        
// 2. Check the process of registration with already registered user name or email id
        
        public void existingCaseOne() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        
        	// Find the element that's name attribute is 'Register' 
        
        	driver.findElement(By.name("Register")).click();
        	
        	// Find the element that's name attribute is 'Username (required)' 
        	
        	// Type in existing Username
            
        	driver.findElement(By.name("Username (required)")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's name attribute is 'Email Address (required)' 
        	
        	// Type in existing Email address
            
        	driver.findElement(By.name("Email Address (required)")).sendKeys("snehal.choubal@gmail.com");
        	
        	// Find the element that's name attribute is 'Choose a Password (required)' 
            
        	driver.findElement(By.name("Choose a Password (required)")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's name attribute is 'Confirm Password (required)' 
            
        	driver.findElement(By.name("Confirm Password (required)")).sendKeys("Snehal_Choubal");
        	
        	// Wait for the security question to be answered. Please type in the answer
        	
        	System.out.println("Please fill out the Security Question field...");
        	
        	//Put a Implicit wait, for the answer
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        	
        	
        	// Find the element that's name attribute is 'Name (required)' 
            
        	driver.findElement(By.name("Name (required)")).sendKeys("Snehal Choubal");
        	
        	// Find the element that's name attribute is 'city (required)' 
            
        	driver.findElement(By.name("city (required)")).sendKeys("Pune");
        	
        	
        	// Find the element that's ID attribute is 'field_3' 
            
        	Select gender = new Select(driver.findElement(By.id("field_3")));
        	gender.selectByVisibleText("Female");
        	
        	// Find the element that's ID attribute is 'field_4_day' 
            
        	Select day = new Select(driver.findElement(By.id("field_4_day")));
        	day.selectByVisibleText("6");
        	
        	// Find the element that's ID attribute is 'field_4_month' 
            
        	Select month = new Select(driver.findElement(By.id("field_4_month")));
        	month.selectByVisibleText("May");
        	
        	// Find the element that's ID attribute is 'field_4_year' 
            
        	Select year = new Select(driver.findElement(By.id("field_4_year")));
        	year.selectByVisibleText("1990");  
        	
        	// Find the element that's ID attribute is 'signup_submit' 
            
        	driver.findElement(By.id("signup_submit")).click();
        	
        	//Put a Implicit wait
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Sorry, that username already exists!' 
            
        	driver.findElement(By.name("Sorry, that username already exists!"));
        	
        	// Find the element that's name attribute is 'Sorry, that email address is already used!' 
            
        	driver.findElement(By.name("Sorry, that email address is already used!"));
        	
        	// Close the driver
        	
        	driver.close();
        }
        
        public void existingCaseTwo() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        
        	// Find the element that's name attribute is 'Register' 
        
        	driver.findElement(By.name("Register")).click();
        	
        	// Find the element that's name attribute is 'Username (required)' 
        	
        	// Type in existing Username
            
        	driver.findElement(By.name("Username (required)")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's name attribute is 'Email Address (required)' 
        	
        	// Type in new Email Address
            
        	driver.findElement(By.name("Email Address (required)")).sendKeys("luckysnesha143@gmail.com");
        	
        	// Find the element that's name attribute is 'Choose a Password (required)' 
            
        	driver.findElement(By.name("Choose a Password (required)")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's name attribute is 'Confirm Password (required)' 
            
        	driver.findElement(By.name("Confirm Password (required)")).sendKeys("Snehal_Choubal");
        	
        	// Wait for the security question to be answered. Please type in the answer
        	
        	System.out.println("Please fill out the Security Question field...");
        	
        	//Put a Implicit wait, for the answer
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        	
        	
        	// Find the element that's name attribute is 'Name (required)' 
            
        	driver.findElement(By.name("Name (required)")).sendKeys("Snehal Choubal");
        	
        	// Find the element that's name attribute is 'city (required)' 
            
        	driver.findElement(By.name("city (required)")).sendKeys("Pune");
        	
        	
        	// Find the element that's ID attribute is 'field_3' 
            
        	Select gender = new Select(driver.findElement(By.id("field_3")));
        	gender.selectByVisibleText("Female");
        	
        	// Find the element that's ID attribute is 'field_4_day' 
            
        	Select day = new Select(driver.findElement(By.id("field_4_day")));
        	day.selectByVisibleText("6");
        	
        	// Find the element that's ID attribute is 'field_4_month' 
            
        	Select month = new Select(driver.findElement(By.id("field_4_month")));
        	month.selectByVisibleText("May");
        	
        	// Find the element that's ID attribute is 'field_4_year' 
            
        	Select year = new Select(driver.findElement(By.id("field_4_year")));
        	year.selectByVisibleText("1990");  
        	
        	// Find the element that's ID attribute is 'signup_submit' 
            
        	driver.findElement(By.id("signup_submit")).click();
        	
        	//Put a Implicit wait
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Sorry, that username already exists!' 
            
        	driver.findElement(By.name("Sorry, that username already exists!"));
        	
        	// Close the driver
        	
        	driver.close();
        }
        
        public void existingCaseThree() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        
        	// Find the element that's name attribute is 'Register' 
        
        	driver.findElement(By.name("Register")).click();
        	
        	// Find the element that's name attribute is 'Username (required)' 
        	
        	// Type in new Username
            
        	driver.findElement(By.name("Username (required)")).sendKeys("ChoubalSnehal");
        	
        	// Find the element that's name attribute is 'Email Address (required)' 
        	
        	// Type in existing Email Addres
            
        	driver.findElement(By.name("Email Address (required)")).sendKeys("snehal.choubal@gmail.com");
        	
        	// Find the element that's name attribute is 'Choose a Password (required)' 
            
        	driver.findElement(By.name("Choose a Password (required)")).sendKeys("ChoubalSnehal");
        	
        	// Find the element that's name attribute is 'Confirm Password (required)' 
            
        	driver.findElement(By.name("Confirm Password (required)")).sendKeys("ChoubalSnehal");
        	
        	// Wait for the security question to be answered. Please type in the answer
        	
        	System.out.println("Please fill out the Security Question field...");
        	
        	//Put a Implicit wait, for the answer
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        	
        	
        	// Find the element that's name attribute is 'Name (required)' 
            
        	driver.findElement(By.name("Name (required)")).sendKeys("Snehal Choubal");
        	
        	// Find the element that's name attribute is 'city (required)' 
            
        	driver.findElement(By.name("city (required)")).sendKeys("Pune");
        	
        	
        	// Find the element that's ID attribute is 'field_3' 
            
        	Select gender = new Select(driver.findElement(By.id("field_3")));
        	gender.selectByVisibleText("Female");
        	
        	// Find the element that's ID attribute is 'field_4_day' 
            
        	Select day = new Select(driver.findElement(By.id("field_4_day")));
        	day.selectByVisibleText("6");
        	
        	// Find the element that's ID attribute is 'field_4_month' 
            
        	Select month = new Select(driver.findElement(By.id("field_4_month")));
        	month.selectByVisibleText("May");
        	
        	// Find the element that's ID attribute is 'field_4_year' 
            
        	Select year = new Select(driver.findElement(By.id("field_4_year")));
        	year.selectByVisibleText("1990");  
        	
        	// Find the element that's ID attribute is 'signup_submit' 
            
        	driver.findElement(By.id("signup_submit")).click();
        	
        	//Put a Implicit wait
        	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Sorry, that email address is already used!' 
            
        	driver.findElement(By.name("Sorry, that email address is already used!"));
        	
        	// Close the driver
        	
        	driver.close();
        }
        
// 3. Login with valid user name and password       
        
        public void validLoginCaseOne() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        	
        	// Find the element that's name attribute is 'log' 
            
        	driver.findElement(By.name("log")).sendKeys("snehal.choubal@gmail.com");
        	
        	// Find the element that's name attribute is 'pwd' 
            
        	driver.findElement(By.name("pwd")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's name attribute is 'wp-submit' 
            
        	driver.findElement(By.name("wp-submit")).click();
        	
        	//Put a Implicit wait
       	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Close the driver
        	
        	driver.close();	
        }
        
        public void validLoginCaseTwo() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        	
        	// Find the element that's name attribute is 'Register' 
            
        	driver.findElement(By.name("Register")).click();
        
        	// Find the element that's xpath attribute is '//img[contains(@src,'facebook')]' 
        
        	driver.findElement(By.xpath("//img[contains(@src,'facebook')]")).click();
        	
        	// Find the element that's id attribute is 'email' 
            
        	driver.findElement(By.name("email")).sendKeys("snehal.choubal@gmail.com");
        	
        	// Find the element that's id attribute is 'pass' 
            
        	driver.findElement(By.name("pass")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's id attribute is 'u_0_1' 
            
        	driver.findElement(By.name("u_0_1")).click();
        	
        	//Put a Implicit wait
       	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Close the driver
        	
        	driver.close();	
        }
        	
// 4. Login with invalid user name and password      
        
        public void invalidLoginCaseOne() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        	
        	// Find the element that's name attribute is 'log' 
            
        	driver.findElement(By.name("log")).sendKeys("luckysnesha143@gmail.com");
        	
        	// Find the element that's name attribute is 'pwd' 
            
        	driver.findElement(By.name("pwd")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's name attribute is 'wp-submit' 
            
        	driver.findElement(By.name("wp-submit")).click();
        	
        	//Put a Implicit wait
       	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Close the driver
        	
        	driver.close();	
        }
        
        public void invalidLoginCaseTwo() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        	
        	// Find the element that's name attribute is 'log' 
            
        	driver.findElement(By.name("log")).sendKeys("luckysnesha143@gmail.comm");
        	
        	// Find the element that's name attribute is 'pwd' 
            
        	driver.findElement(By.name("pwd")).sendKeys("snehalchoubal");
        	
        	// Find the element that's name attribute is 'wp-submit' 
            
        	driver.findElement(By.name("wp-submit")).click();
        	
        	//Put a Implicit wait
       	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Close the driver
        	
        	driver.close();	
        }

        public void invalidLoginCaseThree() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
            
        	driver.findElement(By.name("Login")).click();
        	
        	// Find the element that's name attribute is 'log' 
            
        	driver.findElement(By.name("log")).sendKeys("snehal.choubal@gmail.comm");
        	
        	// Find the element that's name attribute is 'pwd' 
            
        	driver.findElement(By.name("pwd")).sendKeys("snehalchoubal");
        	
        	// Find the element that's name attribute is 'wp-submit' 
            
        	driver.findElement(By.name("wp-submit")).click();
        	
        	//Put a Implicit wait
       	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Close the driver
        	
        	driver.close();
        } 
        
        public void invalidLoginCaseFour() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        	
        	// Find the element that's name attribute is 'Register' 
            
        	driver.findElement(By.name("Register")).click();
        
        	// Find the element that's xpath attribute is '//img[contains(@src,'facebook')]' 
        
        	driver.findElement(By.xpath("//img[contains(@src,'facebook')]")).click();
        	
        	// Find the element that's id attribute is 'email' 
            
        	driver.findElement(By.name("email")).sendKeys("luckysnesha143@gmail.com");
        	
        	// Find the element that's id attribute is 'pass' 
            
        	driver.findElement(By.name("pass")).sendKeys("Snehal_Choubal");
        	
        	// Find the element that's id attribute is 'u_0_1' 
            
        	driver.findElement(By.name("u_0_1")).click();
        	
        	//Put a Implicit wait
       	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Close the driver
        	
        	driver.close();	
        } 
        	
        public void invalidLoginCaseFive() {
            
        	//Launch the website
        	 
        	driver.get("http://demo.rtcamp.com/rtmedia/");  
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Find the element that's name attribute is 'Login'
        
        	driver.findElement(By.name("Login")).click();
        	
        	// Find the element that's name attribute is 'Register' 
            
        	driver.findElement(By.name("Register")).click();
        
        	// Find the element that's xpath attribute is '//img[contains(@src,'facebook')]' 
        
        	driver.findElement(By.xpath("//img[contains(@src,'facebook')]")).click();
        	
        	// Find the element that's id attribute is 'email' 
            
        	driver.findElement(By.name("email")).sendKeys("luckysnesha143@gmail.com");
        	
        	// Find the element that's id attribute is 'pass' 
            
        	driver.findElement(By.name("pass")).sendKeys("snehalchoubal");
        	
        	// Find the element that's id attribute is 'u_0_1' 
            
        	driver.findElement(By.name("u_0_1")).click();
        	
        	//Put a Implicit wait
       	 
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	// Close the driver
        	
        	driver.close();	
        } 

	public void invalidLoginCaseSix() {
    
		//Launch the website
		 
    	driver.get("http://demo.rtcamp.com/rtmedia/");  
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	// Find the element that's name attribute is 'Login'

		driver.findElement(By.name("Login")).click();
	
		// Find the element that's name attribute is 'Register' 
    
		driver.findElement(By.name("Register")).click();

		// Find the element that's xpath attribute is '//img[contains(@src,'facebook')]' 

		driver.findElement(By.xpath("//img[contains(@src,'facebook')]")).click();
	
		// Find the element that's id attribute is 'email' 
    
		driver.findElement(By.name("email")).sendKeys("snehal.choubal@gmail.com");
	
		// Find the element that's id attribute is 'pass' 
    
		driver.findElement(By.name("pass")).sendKeys("snehalchoubal");
	
		// Find the element that's id attribute is 'u_0_1' 
    
		driver.findElement(By.name("u_0_1")).click();
	
		//Put a Implicit wait
	 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Close the driver
	
		driver.close();	
	} 
        	
// 5. Check the process of post updating with media   
	
	public void postMediaCaseOne() throws IOException, InterruptedException {
	    
		//Launch the website
		 
    	driver.get("http://demo.rtcamp.com/rtmedia/members/snehal-choubal/");  
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	// Find the element that's ID attribute is 'whats-new'

		driver.findElement(By.id("whats-new")).sendKeys("Updating post with media");
	
		Thread.sleep(5000);
		
		// Find the element that's ID attribute is 'html5_19a84359m19smoi61l9v1a55b2r3' 
		
		driver.findElement(By.id("html5_19a84359m19smoi61l9v1a55b2r3")).click();
		
		// AutoIt script
    	
    	// WinWaitActive("File Upload")
    	// Send("E:\Learning\Automation\file1.doc")
    	// Send("{ENTER}")
    	
    	// Call the AutoIt script 
    	
    	Runtime.getRuntime().exec("E:\\Learning\\Automation\\updatepost.exe");    

		// Find the element that's ID attribute is 'aw-whats-new-submit' 

		driver.findElement(By.id("aw-whats-new-submit")).click();

		//Put a Implicit wait
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Close the driver
	
		driver.close();		
	}
	
	public void postMediaCaseTwo() throws IOException {
		
		//Launch the website
		 
    	driver.get("http://demo.rtcamp.com/rtmedia/members/snehal-choubal/");  
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Find the element that's ID attribute is 'html5_19a84359m19smoi61l9v1a55b2r3' 
		
		driver.findElement(By.id("html5_19a84359m19smoi61l9v1a55b2r3")).click();
		
		// AutoIt script
    	
    	// WinWaitActive("File Upload")
    	// Send("E:\Learning\Automation\file1.doc")
    	// Send("{ENTER}")
    	
    	// Call the AutoIt script 
    	
    	Runtime.getRuntime().exec("E:\\Learning\\Automation\\updatepost.exe");    	
    	
    	// Find the element that's ID attribute is 'aw-whats-new-submit' 

    	driver.findElement(By.id("aw-whats-new-submit")).click();

		//Put a Implicit wait
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Close the driver
	
		driver.close();	
	}
	
 // 6. Update the profile
	
	public void updateProfileCase() {
		
		//Launch the website
		 
    	driver.get("http://demo.rtcamp.com/rtmedia/members/snehal-choubal/profile/edit/group/1/");  
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Find the element that's ID attribute is 'field_2' 
		
		// Clear existing text
		
		driver.findElement(By.id("field_2")).sendKeys("");
		
		// Enter city
		
		driver.findElement(By.id("field_2")).sendKeys("Mumbai");

		// Find the element that's ID attribute is 'profile-group-edit-submit' 

		driver.findElement(By.id("profile-group-edit-submit")).click();

		//Put a Implicit wait
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Close the driver
	
		driver.close();	
	}
	 
// 7. Upload image/audio/video/doc in media. Ref.http://demo.rtcamp.com/rtmedia/members/snehal-choubal/media/
	
	public void uploadInMediaCaseOne() throws IOException {
		
		//Launch the website
		 
    	driver.get("http://demo.rtcamp.com/rtmedia/members/snehal-choubal/media/");  
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Find the element that's ID attribute is 'rtm_show_upload_ui' 
    	
    	driver.findElement(By.id("rtm_show_upload_ui")).click();

    	// Find the element that's name attribute is 'album' 
		
    	Select album = new Select(driver.findElement(By.name("album")));
    	
    	album.selectByVisibleText("Profile Pictures");
    	
    	// Find the element that's ID attribute is 'rtSelectPrivacy' 
		
    	Select privacy = new Select(driver.findElement(By.id("rtSelectPrivacy")));
    	
    	privacy.selectByVisibleText("Private");
    	
    	// Find the element that's ID attribute is 'rtMedia-upload-button' 
    	
    	driver.findElement(By.id("rtMedia-upload-button")).click();
    	
    	// AutoIt script
    	
    	// WinWaitActive("File Upload")
    	// Send("E:\Learning\Automation\file2.doc")
    	// Send("{ENTER}")
    	
    	// Call the AutoIt script 
    	
    	Runtime.getRuntime().exec("E:\\Learning\\Automation\\upload.exe");    	
    	
    	// Find the element that's ID attribute is 'rtmedia_upload_terms_conditions' 
		
    	driver.findElement(By.id("rtmedia_upload_terms_conditions")).click();
    	
		// Find the element that's ID attribute is 'profile-group-edit-submit' 

		driver.findElement(By.id("profile-group-edit-submit")).click();

		//Put a Implicit wait
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Close the driver
	
		driver.close();	
	}
	
	public void uploadInMediaCaseTwo() throws IOException {
		
		//Launch the website
		 
    	driver.get("http://demo.rtcamp.com/rtmedia/members/snehal-choubal/media/");  
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Find the element that's ID attribute is 'rtm_show_upload_ui' 
    	
    	driver.findElement(By.id("rtm_show_upload_ui")).click();

    	// Find the element that's name attribute is 'album' 
		
    	Select album = new Select(driver.findElement(By.name("album")));
    	
    	album.selectByVisibleText("Wall Posts");
    	
    	// Find the element that's ID attribute is 'rtSelectPrivacy' 
		
    	Select privacy = new Select(driver.findElement(By.id("rtSelectPrivacy")));
    	
    	privacy.selectByVisibleText("Public");
    	
    	// Find the element that's ID attribute is 'rtMedia-upload-button' 
    	
    	driver.findElement(By.id("rtMedia-upload-button")).click();
    	
    	// AutoIt script
    	
    	// WinWaitActive("File Upload")
    	// Send("E:\Learning\Automation\file2.doc")
    	// Send("{ENTER}")
    	
    	// Call the AutoIt script 
    	
    	Runtime.getRuntime().exec("E:\\Learning\\Automation\\upload.exe");    	
    	
		// Find the element that's ID attribute is 'profile-group-edit-submit' 

		driver.findElement(By.id("profile-group-edit-submit")).click();

		//Put a Implicit wait
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Close the driver
	
		driver.close();	
	}
	
// 8. Upload image/audio/video/doc in media by URL

	public void uploadInMediaURLCaseOne() {
		
		//Launch the website
		 
    	driver.get("http://demo.rtcamp.com/rtmedia/members/snehal-choubal/media/");  
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Find the element that's ID attribute is 'rtm_show_upload_ui' 
		
    	driver.findElement(By.id("rtm_show_upload_ui")).click();
    	
    	// Find the element that's name attribute is 'album' 
		
    	Select album = new Select(driver.findElement(By.name("album")));
    	
    	album.selectByVisibleText("Cover Photos");
    	
    	// Find the element that's ID attribute is 'rtSelectPrivacy' 
		
    	Select privacy = new Select(driver.findElement(By.id("rtSelectPrivacy")));
    	
    	privacy.selectByVisibleText("Friends");
    	
    	// Enter URL
		
    	driver.findElement(By.id("rtmedia_url_upload_input")).sendKeys("https://s.yimg.com/dh/ap/fp/flag-in.png");
    	
    	// Find the element that's ID attribute is 'rtmedia_upload_terms_conditions' 
		
    	driver.findElement(By.id("rtmedia_upload_terms_conditions")).click();
    	
    	// Find the element that's class attribute is 'start-media-upload' 
		
    	driver.findElement(By.className("start-media-upload")).click();

		//Put a Implicit wait
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Close the driver
	
		driver.close();	
	}
        
	public void uploadInMediaURLCaseTwo() {
		
		//Launch the website
		 
    	driver.get("http://demo.rtcamp.com/rtmedia/members/snehal-choubal/media/");  
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Find the element that's ID attribute is 'rtm_show_upload_ui' 
		
    	driver.findElement(By.id("rtm_show_upload_ui")).click();
    	
    	// Find the element that's name attribute is 'album' 
		
    	Select album = new Select(driver.findElement(By.name("album")));
    	
    	album.selectByVisibleText("Cover Photos");
    	
    	// Find the element that's ID attribute is 'rtSelectPrivacy' 
		
    	Select privacy = new Select(driver.findElement(By.id("rtSelectPrivacy")));
    	
    	privacy.selectByVisibleText("Private");
    	
    	// Enter URL
		
    	driver.findElement(By.id("rtmedia_url_upload_input")).sendKeys("https://s.yimg.com/dh/ap/fp/flag-in.png");
    	
    	// Find the element that's ID attribute is 'rtmedia_upload_terms_conditions' 
		
    	driver.findElement(By.id("rtmedia_upload_terms_conditions")).click();
    	
    	// Find the element that's class attribute is 'start-media-upload' 
		
    	driver.findElement(By.className("start-media-upload")).click();

		//Put a Implicit wait
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// Close the driver
	
		driver.close();	
	}
	
}      
        
      
