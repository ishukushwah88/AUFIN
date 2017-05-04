package TestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import aufin.appmethods.com.LeadMethods;
import aufin.common.com.SendMail;
import aufin.pom.com.LeadPage;
import aufin.reposrity.com.LeadData;
import aufin.utility.com.Log;

public class IndividualLead extends LeadMethods {

	String CustomerName;
	String Leadid;
	String LeadStatus;
	String LeadOwner;
	

	/***********************************************************************************************
	 * 
	 * @author Ishant Kushwah
	 * 
	 * @TestCase : Logged in System with CSE user for asset Lead
	 * 
	 * @serialData : April 24, 2017
	 * 
	 ************************************************************************************************/
	@Test
	public void NavigatetoLead() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("APPLICANT LEAD");
		
		common.WelComeNote();
	

		Log.info("Enter Username");
		Enter_txtName(LeadData.cseusername);

		Log.info("Enter Password");
		Enter_txtPassword(LeadData.csepassword);

		Log.info("Click on Login Button");
		click_LoginButton();

		Log.info("POT taken for success logged in");
		common.TakeScreenshots();
		
	
	}

	/**************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Create a New Asset lead for individual Customer
	 * 
	 * @serialData : April 24, 2017
	 * 
	 ***************************************************************/

	@Test(dependsOnMethods = "NavigatetoLead", enabled = true)

	public void createApplicantLeadOnNewStage() throws Exception {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("APPLICANT LEAD");

		Log.info("Navigate to Asset");
		navigate_to_asset();

		common.ImplicityWait(10);

		Log.info("Select Entity Type");
		select_Entity(LeadData.entity);

		Log.info("Select Product Category");
		select_ProductCategory("Wheels");

		Log.info("Select Product");
		select_ProductType("CV Loading (New)");

		Log.info("Enter Mobile Number");
		enter_MobileNo(LeadData.mobile_number);

		Log.info("Select Salution");
		Select_Salution(LeadData.salutration);

		Log.info("Enter FirstName");
		enter_FirstName(LeadData.Fname);

		Log.info("Enter Middle Name");
		enter_MiddleName(LeadData.MName);

		Log.info("Enter Last Name");
		enter_LastName(LeadData.LName);

		Log.info("Enter ShortName");
		enter_shortName(LeadData.ShortName);

		common.downscroll();

		Log.info("Select Date of Birth");
		selectDate(LeadData.Date, LeadData.month, LeadData.Year);

		Log.info("Enter AadharCard No");
		enter_AadharCard(LeadData.aadhar);

		Log.info("Select Form Type");
		select_form60("Form60");

		Log.info("Select Gender Type");
		selectGender(LeadData.Gender);

		Log.info("Select Residance Type");
		selectResidance(1);

		Log.info("Enter Current Address Details");
		enterCurrentAddressLine1(LeadData.CurrentAddress);

		Log.info("Select Current AddressPincode");
		selectcurrentPincode("201005");

		common.downscroll();

		Log.info("Click Save&Processd");
		clickSaveProcessedButton();

	}

	/***********************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Move a lead From New Stage to Doc collected.
	 * 
	 * @serialData : April 25,2017
	 * 
	 ***********************************************************/

	@Test(dependsOnMethods = "NavigatetoLead", enabled = true)
	public void moveLeadToDocCollected() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("VIEW AND Open a lead");

		navigateToLeadHomeScreen();

		common.ImplicityWait(10);

		Log.info("Select lead view");
		selectcustommodule("Asset ");
		selectLeadCustomview("New Lead *");

		Log.info("Click and open lead");
		leadDetailsingrid();

		common.ImplicityWait(10);
		//
		Log.info("Click On Edit button");
		clickEditButton();

		Log.info("click on Doc collected stage");
		click_docCollectedStage();

		Log.info("Select RiskClassification");
		selectRiskClassification(2);

		Log.info("Enter Loan Amount");
		enterLoanAmount(LeadData.LoanAmount);

		Log.info("Select Industry");
		selectIndutryd("Food");

		Log.info("Select SubInd");
		selectSubIndus("FISH");

		Log.info("Upload Customer Photo");
		uploadCustomerPhoto(LeadData.CustomerPhoto);

		Log.info("Upload Customer Signature");
		uploadCustomerSign(LeadData.CustomerSignature);

		Log.info("Fill PhotoID Name");
		fillPhotoIdKYCDetails("Aadhar Card", "Aadhar123", "Aadga", "C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");

		common.ImplicityWait(10);
		Log.info("Select permananet address");
		enterPermananetAddressLine1("Permanant");

		selectPermanenetPincode("201005");

		Log.info("Click Save Button");
		clickSaveProcessedButton();

		Log.info("Lead Status found as" + "  " + LeadStatus);
		LeadStatus = LeadPage.getLeadStatus.getText();
		Assert.assertEquals(LeadStatus, "Pending BM Recommendation");
		System.out.println(LeadStatus);

//		Log.info("Lead Owner found as" + " " + LeadOwner);
		LeadOwner = LeadPage.getLeadOwner.getText();
//		Assert.assertEquals(LeadOwner, "Mangamuri");
//		System.out.println("LeadOwner");

	}

	/*****************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Move a lead on doc collected .
	 * 
	 * @serialData: April 26, 2017
	 ******************************************************************/

	@Test(dependsOnMethods = "moveLeadToDocCollected", enabled = true)
	public void logOutwithCSE() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Logged out");

		Log.info("Logged out from System");
		click_LoginOutButton();

	}

	/*****************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Login with Branch Manager .
	 * 
	 * @serialData: April 26, 2017
	 ******************************************************************/

	@Test(dependsOnMethods = "logOutwithCSE", enabled = true)
	public void loginwithbranch() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Logged in with Branch Manager");

		Log.info("enter Branch Manager Username");
		Enter_txtName(LeadOwner);

		Log.info("Enter Branch Manager Password");
		Enter_txtPassword("acid_qa");

		Log.info("Click Login Button");
		click_LoginButton();

		Log.info("Navigate to Lead Hoem Screen");
		navigateToLeadHomeScreen();

	}

	/*****************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Recommended or reject a lead.
	 * 
	 * @serialData: April 26, 2017
	 ******************************************************************/

	@Test(dependsOnMethods = "loginwithbranch", enabled = true)
	public void takeactionByBM() {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Logged in with Branch Manager");

		common.ImplicityWait(10);

		Log.info("Select lead view");
		selectcustommodule("Asset ");
		selectLeadCustomview("Pending BM Recommendation *");

		Log.info("Click and open lead");
		leadDetailsingrid();

		Log.info("Click On Edit button");
		clickEditButton();

		common.ImplicityWait(10);

		Log.info("Recommended Asset Lead");
		actionsonBM("Rejected");

		Log.info("Click Save Button");
		clickSaveProcessedButton();
	}

	/*****************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Lead Search
	 * 
	 * @serialData: April 27, 2017
	 ******************************************************************/

	@Test(enabled = false)
	public void LeadSearchonHome() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Lead Search from Home Screen");
		common.ImplicityWait(10);
		navigateToLeadHomeScreen();
		LeadSearchonHOmeScreen("Lead No", "dfghjk");
	}

	@Test(dependsOnMethods = "NavigatetoLead", enabled = false)
	public void LeadtoLeadDedupe() throws Exception {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Lead to Lead Dedupe");
		Assert.assertTrue(LeadPage.alert_leadtolead.isDisplayed(), "Fail: Lead to lead dedupe screen not found");
		takeDedupeaction("ignore");
		String LeadStatusonDedupe = LeadPage.getLeadStatus.getText();
		Assert.assertEquals(LeadStatusonDedupe, "Duplicate Lead Confirmation");
	}

	@Test(enabled = false)
	public void LeadtoCustomerDedupe() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("APPLICANT LEAD");

		Log.info("Navigate to Asset");
		navigate_to_asset();

		common.ImplicityWait(10);

		Log.info("Select Entity Type");
		select_Entity("INDIVIDUAL - FULL KYC");

		Log.info("Select Product Category");
		select_ProductCategory("Wheels");

		Log.info("Select Product");
		select_ProductType("CV Loading (New)");

		Log.info("Enter Mobile Number");
		enter_MobileNo("8843523698");

		Log.info("Select Salution");
		Select_Salution("MRS.");

		Log.info("Enter FirstName");
		enter_FirstName("Megha");

		Log.info("Enter Middle Name");
		enter_MiddleName("Singh");

		Log.info("Enter Last Name");
		enter_LastName("Sharma");

		Log.info("Enter ShortName");
		enter_shortName("SS");

		common.downscroll();

		Log.info("Select Date of Birth");
		selectDate("18", "May", "1950");

		Log.info("Enter AadharCard No");
		enter_AadharCard("745886256565 ");

		Log.info("Enter PAN NUMBER");
		enter_panno("CDFSE2884S");

		Log.info("Select Form Type");
		select_form60("Form60");

		Log.info("Click Save&Processd");
		clickSaveProcessedButton();

		Assert.assertTrue(LeadPage.alert_leadtolead.isDisplayed(), "Failed: Lead to customer dedupe not found");
		tackeCustomerDedupeaction();

	}

	/*************************************************************
	 * @author Ishant Kushwaha Here we logged element related to corporate
	 *         customer
	 * 
	 * 
	 **************************************************************/

	@Test(dependsOnMethods = "moveLeadToDocCollected", enabled = true)
	public void FillCOApplicantLayout() throws InterruptedException {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("APPLICANT LEAD");

//		navigateToLeadHomeScreen();
//
//		common.ImplicityWait(10);
//
//		Log.info("Select lead view");
//		selectcustommodule("Asset ");
//		selectLeadCustomview("New Lead *");
//
//		Log.info("Click and open lead");
//		leadDetailsingrid();

		Log.info("Select Co-applicantLayout");
		selectCoapplicantLayout();

		Log.info("Select Entity");
		select_Entity(LeadData.CoapplicantEntity);

		Log.info("Select Salutraion");
		Select_Salution("M/S.");

		Log.info("Fill FirstName");
		enter_FirstName(LeadData.CoapplicantFname);

		Log.info("Enter Middle Name");
		enter_MiddleName(LeadData.CoapplicantMname);

		Log.info("Enter Last Name");
		enter_LastName(LeadData.CoapplicantLname);

		Log.info("Enter Short Name");
		enter_shortName(LeadData.CoapplicantShortName);

		Log.info("enter Mobile Number");
		enter_MobileNo(LeadData.CoappliantMobileNo);

		Log.info("select Corporate KYC1");
		selectcmpnykyc1doc();
		selectcmyKYC1Issuedate("10", "2015", "Jan");

		Log.info("Enter KYC Doc1 Number");
		entercmpnyKYC1DocNo("1569");

		Log.info("Upload KYC1 Attachement");
		uploadCompanyKYC1Document("C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");

		// Log.info("Insert KYC 1 Expire Date");
		// selectcmyKYC1Expiredate("20", "2018", "Mar");

		Log.info("Select Corporate KYC2");
		selectKYC2DocType();

		Log.info("Select KYC 2 DocumentName");
		entercmpyKYC2DocumentName("dfg");

		Log.info("Enter KYC2 Doc Number");
		entercmpnyKYC2DocNo("4545");

		Log.info("Upload KYC 2 Doc");
		uploadCompanyKYC2Document("C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");

		// Log.info("Select KYC Issue Date");
		// selectcmyKYC2Issuedate("20", "2018", "Jun");

		// Log.info("Select KYC2 Expire Date");
		// selectcmyKYC2Expiredate("23","2020", "Jan");

		Log.info("Enter Corporate Company Address");
		entercorpCurrentAddress("dfg");

		Log.info("Select Corporate Company Pin");
		selectComapnyPincode("201005");

		Log.info("Enter Company Name/Entity Name");
		enterCompanyNameEntityName("Sphonx");

		Log.info("Select DOI");
		selectDOI("20", "May", "2015");

		Log.info("Click Save Button");
		corporateSaveBtn();

	}
	@Test(dependsOnMethods="takeactionByBM")
	public void coapplicantLeadHandoff() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("APPLICANT LEAD");
		
		switchtoCoapplicant();
		clickEditButton();
		changeCoapplicantLeadStatus("BM Recommended");
		corporateSaveBtn();
		
		
		

	}
	
	public void createETBCustomer(){
		navigateToLeadHomeScreen();
		
	}
}
