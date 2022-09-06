package TestCases;

import org.testng.annotations.Test;

import PageObjects.SearchfromHomePage;
import TestBase.Base;

public class HomePageTest extends Base {

	
@Test

public void searchBox_enterValidItemTest() {
	
	SearchfromHomePage searchhp= new SearchfromHomePage(driver);
	searchhp.SearchAnItem();
}
}
