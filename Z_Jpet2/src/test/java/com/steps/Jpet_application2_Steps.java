package com.steps;

import java.io.IOException;

import com.main.Jpet_application_2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jpet_application2_Steps {
	Jpet_application_2 google = new Jpet_application_2();
@Given("to check for signin")
public void LaunchBrowser() throws IOException, InterruptedException {
	google.signin();
}
@When("to check for printbill")
public void applicationhomepage() {
	 google.Printbill();
}

@Then("to check for remove from cart")
public void signin() throws IOException, InterruptedException {
	google.removefromCart();
}
@Then("to take screenshot for remove from cart")
public void screenshot() throws IOException, InterruptedException {
	google.takescreenshot2("C:\\Users\\BLTuser.BLT1224\\git\\project\\Z_Jpet2\\src\\test\\resources\\screenshot\\removefromcart.png");
	
}
@Then("to check for compare name")
public void comparename() throws InterruptedException {
	google.compare_name();
}
@And("To print myorders table")
public void print_myaccount_table () {
	google.print_Myaccount();
}

}