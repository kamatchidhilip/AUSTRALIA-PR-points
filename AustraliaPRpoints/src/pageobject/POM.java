package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class POM {

	@FindBy(xpath = "//*[contains(text(),'Skilled Independent visa (subclass 189)')]")
	public static WebElement visasubclass;
	
	
	@FindBy(xpath ="//*[@name = 'Age189']/div")
	public static WebElement agedropdown;
	
	@FindBy(id = "ui-select-choices-row-0-2")
	public static WebElement agebandfromdropdown;
	
	@FindBy(xpath ="//*[@name = 'EnglishLang189']/div")
	public static WebElement englangdropdown;
	
	@FindBy(id = "ui-select-choices-row-1-1")
	public static WebElement proficientfromdropdown;
	
	@FindBy(xpath = "//*[@id= 'SkilledEmployment189']/div")
	public static WebElement skilledoutsidedropdown;
	
	@FindBy(id= "ui-select-choices-row-2-2")
	public static WebElement fiveyearsfromdd;
	
	@FindBy(xpath ="//*[@id= 'SkilledEmployentInAus189']/div/span")
	public static WebElement skilledinsidedd;
	
	@FindBy(id = "ui-select-choices-row-3-2")
	public static WebElement onetothreeyearfromdd;
	
	@FindBy(xpath = "//*[@id= 'Qualifications189']/div/span")
	public static WebElement educationaldd;
	
	@FindBy(id = "ui-select-choices-row-4-1")
	public static WebElement bachelorfromdd;
	
	@FindBy(id = "AusStudy189-0")
	public static WebElement auseduradio;
	
	
	@FindBy(id = "Specialisteducationqualification189-0")
	public static WebElement  specialeduradio;
	
	@FindBy(id = "Comunitylanguage189-0")
	public static WebElement communitylanguage;
	
	@FindBy(id = "RegionalAustralia189-0")
	public static WebElement regionalaus;
	
	@FindBy(xpath ="//*[@id= 'Partnerskills189']/div/span")
	public static WebElement partnerskillsdd;
	
	@FindBy(id = "ui-select-choices-row-5-1")
	public static WebElement defactofromdd;
	
	@FindBy(id="Professionalyear189-0")
	public static WebElement proffyear;
	
	@FindBy(id ="totalPointsPanelColumns3Total")
	public static WebElement totalpoints;
	
	
	
	
}
