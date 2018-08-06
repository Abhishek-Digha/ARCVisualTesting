package com.arc.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.arc.ReusableMethods.ReusableMethodLandingPage;
import com.arc.driver.BaseClass;

public class ARCLandingPageTest extends BaseClass {
	
	@Test
	public void ARCLandingPage()throws IOException {
		
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		ReusableMethodLandingPage reuse = new ReusableMethodLandingPage();

		try {
			
			reuse.LandingPageARC();
			
		} catch (Throwable t) {
			System.out.println(t.getLocalizedMessage());
			Error e1 = new Error(t.getMessage());
			e1.setStackTrace(t.getStackTrace());
			throw e1;
		}
	}

}
