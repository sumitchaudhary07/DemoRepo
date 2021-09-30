package com.com.depends;


public class Dynamicdata {

	

		static String key="webdriver.gecko.driver";
		static String value="C:\\Users\\admin\\Desktop\\Selenium\\geckodriver.exe";
	     static String url="http://www.calculator.net";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
	System.setProperty(key, value);

	//WebDriver driver=new FirefoxDriver();
	//driver.navigate().to(url);
	
		
		

	}

}
