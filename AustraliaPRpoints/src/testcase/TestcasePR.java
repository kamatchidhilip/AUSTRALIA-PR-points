package testcase;

import org.apache.bcel.generic.Select;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import commonfile.Common;
import junit.framework.TestCase;
import pageobject.POM;

public class TestcasePR extends Common
{
	
	ExtentTest testcase;
	
	Logger logger = Logger.getLogger(TestCase.class);
	
	public void calculating() {
		
		PageFactory.initElements(driver, POM.class);
		
		POM.visasubclass.click();
		logger.info("visasubclass clicked");

		POM.agedropdown.click();
		logger.info("agedropdown clicked");

		POM.agebandfromdropdown.click();
		logger.info("agebandfromdropdown clicked");

		POM.englangdropdown.click();
		logger.info("englangdropdown clicked");

		POM.proficientfromdropdown.click();
		logger.info("proficientfromdropdown clicked");

		
		POM.skilledoutsidedropdown.click();
		logger.info("skilledoutsidedropdown clicked");

		
		POM.fiveyearsfromdd.click();
		logger.info("fiveyearsfromdd clicked");

		
		POM.skilledinsidedd.click();
		logger.info("skilledinsidedd clicked");

		POM.onetothreeyearfromdd.click();
		logger.info(" onetothreeyearfromdd clicked");

		
		POM.educationaldd.click();
		logger.info(" educationaldd clicked");

		
		POM.bachelorfromdd.click();
		logger.info(" bachelorfromdd clicked");

		POM.auseduradio.click();
		logger.info(" auseduradio clicked");

		POM.specialeduradio.click();
		logger.info(" specialeduradio clicked");

		POM.communitylanguage.click();
		logger.info(" communitylanguage clicked");

		POM.regionalaus.click();
		logger.info(" regionalaus clicked");

		POM.partnerskillsdd.click();
		logger.info(" partnerskillsdd clicked");

		POM.defactofromdd.click();
		logger.info(" defactofromdd clicked");

		POM.proffyear.click();
		logger.info(" proffyear clicked");

		POM.totalpoints.getText();
		String totalpoints = POM.totalpoints.getText();
		System.out.println("Your total point is :"+totalpoints);
		logger.info(" Got the total points");

	}
	
	@Test
	public void PRpoints() {
	testcase = extent.createTest("PRpoints");
	testcase.log(Status.INFO, "passed");
	extent.flush();
	logger.info("started calculating");
		calculating();
	}

}
