package com.sample.tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.pages.LoginPage;

public class LoginTest {


	@Test
	public void cal_add() throws MalformedURLException
	{

		LoginPage pd;
		try {
			pd = new LoginPage();

			pd.digit9.click();
			pd.add.click();
			pd.digit1.click();
			pd.btneql.click();
			String sumOfNumbers = pd.result.getText();
			System.out.println(sumOfNumbers);

			//verify if result is 10
			Assert.assertTrue(sumOfNumbers.endsWith("10"));
			System.out.println("The test is sucessfull");


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}