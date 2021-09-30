package com.com.depends;

import org.testng.annotations.Test;

public class Dependent {
  @Test(dependsOnMethods="openbrowser")
  public void signin() {
	  
	  System.out.println("i am sigin");
  }
  @Test
 public void openbrowser() {
	  
	  System.out.println("i am opening browser");
  }
  @Test(dependsOnMethods="signin")
 public void logout() {
	  
	  System.out.println("i am logout");
 }
  
}
