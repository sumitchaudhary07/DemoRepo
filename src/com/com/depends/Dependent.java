package com.com.depends;

import org.testng.annotations.Test;

public class Dependent {
  @Test(dependsOnMethods="openbrowser")
  public void signin() {
	  
	  System.out.println("i am sigin1");
	  System.out.println("i am sigin2");
	  System.out.println("i am sigin3");
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
