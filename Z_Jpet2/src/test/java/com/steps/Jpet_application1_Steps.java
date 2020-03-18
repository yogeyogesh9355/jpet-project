package com.steps;

import java.io.IOException;

import com.main.Jpet_application_1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_application1_Steps {
	Jpet_application_1 google = new Jpet_application_1 ();

	@Given("To check for registeration")
	public void register() throws InterruptedException, IOException  {
		google.register();
	}
	@When("To check for add to cart")
	public void addtocart() {
		google.addtocart();
	}
	@Then("To take screenshot for add to cart")
	public void takescreenshotforcart() throws IOException, InterruptedException {
		google.takescreenshot1("C:\\Users\\BLTuser.BLT1224\\git\\project\\Z_Jpet2\\src\\test\\resources\\screenshot\\addtocart.png");
	}
	@Then ("To check for print table")
	public void printtable() {
		google.printtable();
	}
	@Then("To check for search")
	public void search() {
		google.search();
	}
	@Then("To take screenshot for search")
	public void takescreenshotforsearch() throws IOException, InterruptedException {
		google.takescreenshot6("C:\\Users\\BLTuser.BLT1224\\git\\project\\Z_Jpet2\\src\\test\\resources\\screenshot\\search.png");
	}
	@And("To check for link")
	public void checkforlink() {
		google.Checkforlink();
	}
	
}