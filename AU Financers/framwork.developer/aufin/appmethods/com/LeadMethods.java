package aufin.appmethods.com;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import aufin.pom.com.LeadPage;
import aufin.reposrity.com.Properties;

public abstract class LeadMethods extends LoginMethod {

	public void navigate_to_asset() {

		driver.navigate().to(Properties.Asset_URL);

	}

	public void navigate_to_LiabilityLayout() {
		driver.navigate().to(Properties.Liability_URL);
	}

	public void select_Entity(String entity) {

		new Select(LeadPage.drop_entity).selectByVisibleText(entity);

	}

	public void select_ProductCategory(String productCat) {
		common.ImplicityWait(10);
		LeadPage.icon_ProductSearch.click();
		LeadPage.icon_txt_searchbox.sendKeys(productCat);
		LeadPage.icon_txt_searchbox.sendKeys(Keys.ENTER);
		LeadPage.icon_txt_searchResult.click();
	}

	public void select_ProductType(String product) {
		new Select(LeadPage.drpdwn_productType).selectByVisibleText(product);
	}

	public void enter_MobileNo(String mobile) {
		LeadPage.txt_mobile.sendKeys(mobile);
	}

	public void Select_Salution(String sal) {
		new Select(LeadPage.drpdown_Salutation).selectByVisibleText(sal);
	}

	public void enter_FirstName(String fname) {
		LeadPage.txt_firstname.sendKeys(fname);
	}

	public void enter_LastName(String lastname) {
		LeadPage.txt_lastName.sendKeys(lastname);
	}

	public void enter_MiddleName(String middleName) {
		LeadPage.txt_middleName.sendKeys(middleName);
	}

	public void enter_shortName(String shortName) {
		LeadPage.txt_ShortName.sendKeys(shortName);
	}

	public void selectGender(String gender) {
		new Select(LeadPage.dropdown_Gender).selectByVisibleText(gender);
	}

	public void selectResidance(int residance) {
		new Select(LeadPage.drpdown_residance).selectByIndex(residance);
	}

	public void enter_AadharCard(String aadhar) {
		LeadPage.txt_AadharNo.sendKeys(aadhar);
	}

	public void enter_panno(String pan) {
		LeadPage.txt_pan.sendKeys(pan);
	}

	public void select_form60(String formtype) {
		new Select(LeadPage.drop_form60).selectByVisibleText(formtype);
	}

	public void changeMonths(String month) {
		new Select(LeadPage.drpdwn_monthSelection).selectByVisibleText(month);
	}

	public void changeYear(String year) {
		new Select(LeadPage.dropdwn_yearselection).selectByVisibleText(year);
	}

	public void selectDate(String date, String month, String year) {
		LeadPage.clk_calendarpicker.click();
		changeMonths(month);
		changeYear(year);
		driver.findElement(By.linkText(date)).click();
	}

	public void uploadCustomerPhoto(String path) {

		LeadPage.icon_customerphoto.sendKeys(path);

	}

	public void uploadCustomerSign(String path) {
		LeadPage.icon_customerSignature.sendKeys(path);
	}

	public void enterPassportNo(String passNo) {
		LeadPage.txt_passportno.sendKeys(passNo);
	}

	public void enterPassportIssueDate(String issueDate, String Month, String Year) {
		LeadPage.icon_passportIssueDate.click();
		changeYear(Year);
		changeMonths(Month);
		driver.findElement(By.linkText(issueDate)).click();

	}

	public void enterPassportExpireDate(String expireDate, String Month, String Year) {
		LeadPage.icon_passportIssueDate.click();
		changeYear(Year);
		changeMonths(Month);
		driver.findElement(By.linkText(expireDate)).click();

	}

	public void enterEmailAddress(String email) {
		LeadPage.txt_emailaddress.sendKeys(email);
	}

	public void selectResidanceStatus(int index) {
		new Select(LeadPage.drpdown_residance).selectByIndex(index);
	}

	public void enterLoanAmount(String amount) {
		LeadPage.txt_leadAmount.sendKeys(amount);
	}

	public void enterMeetingNotes(String meetingNotes) {
		LeadPage.txt_meetingNotes.sendKeys(meetingNotes);
	}

	public void click_identifyStage() {
		LeadPage.link_prospect.click();
	}

	public void click_newStage() {
		LeadPage.link_NewStage.click();
	}

	public void click_docCollectedStage() {
		LeadPage.link_DocCollected.click();
	}

	public void SelectProductMaker(int index) {
		new Select(LeadPage.drpdwn_maker_productDetails).selectByIndex(index);

	}

	public void Selectmonthforproduct(int index) {
		new Select(LeadPage.drpdwn_monthSelection).selectByIndex(index);
	}

	public void SelectOccupation(String occupation) {
		new Select(LeadPage.drpdwn_Occupation).selectByVisibleText(occupation);
	}

	public void selectPhotoIdProof(String Photoidproof) {
		new Select(LeadPage.drpdwn_photoproof).selectByVisibleText(Photoidproof);
	}

	public void selectPhotoIdProofType(String photoIdType) {
		new Select(LeadPage.drpdwn_photoidpftype).selectByVisibleText(photoIdType);
	}

	public void selectResidanceType(int index) {
		new Select(LeadPage.drpdown_residance).selectByIndex(index);
	}

	public void selectPhotoIdIssuedate(String Date, String month, String year) {
		LeadPage.icon_passportIssueDate.click();
		changeMonths(month);
		changeYear(year);
		//driver.findElement(By.linkText(issueDate)).click();

	}

	public void clickSaveProcessedButton() {
		LeadPage.btn_SaveProcessed.click();
	}

	public void selectcustommodule(String viewModule) {
		new Select(LeadPage.drpdwn_selectModule).selectByVisibleText(viewModule);

	}

	public void selectLeadCustomview(String view) {

		new Select(LeadPage.drpdwn_Customizeview).selectByVisibleText(view);
		LeadPage.iconclk_customizeArrow.click();
	}

	public void leadDetailsingrid() {

		String finalpath = "//*[@id='row0jqxgrid']/div[4]/div/a";

		// String pathfirst ="//a[contains(text(),";
		// String last = ")]";
		// String finalpath = pathfirst+LeadName+last;

		driver.findElement(By.xpath(finalpath)).click();

	}
	
	public void switchtoCoapplicant(){
		LeadPage.clk_switchBtn.click();
	}

	public void selectCoapplicantLayout() throws InterruptedException {

		LeadPage.clk_switchBtn.click();

		driver.findElement(By.cssSelector("p[title=\"Co- applicant / Guarantor Details\"]")).click();
		Thread.sleep(2000);
		LeadPage.clk_newCoapplicant.click();
		LeadPage.clk_newCoapplicant.sendKeys(Keys.ENTER);

		// LeadPage.clk_newCoapplicant.click();
	}

	public void navigateToLeadHomeScreen() {
		driver.navigate().to("http://10.57.15.4/sn/app/CRMNextObject/Home/Lead");
	}

	public void LeadSearchonHOmeScreen(String parameter, String value) {
		if (parameter.equalsIgnoreCase("Lead No")) {
			LeadPage.leadSearch_leadNo.sendKeys(value);
			LeadPage.leadSearch_leadNo.sendKeys(Keys.ENTER);
		} else {
			if (parameter.equalsIgnoreCase("PAN")) {
				LeadPage.leadSearch_PAN.sendKeys(value);
				LeadPage.leadSearch_PAN.sendKeys(Keys.ENTER);
			}
		}
	}

	public void getLeadid() {

		String leadid = LeadPage.get_Leadid.getText();
	}

	public void clickEditButton() {
		LeadPage.clck_CustoizeBtn.click();
		LeadPage.click_EditBtn.click();
	}

	public void enterCurrentAddressLine1(String currentaddress) {
		LeadPage.txt_currentAddressLine1.sendKeys(currentaddress);

	}

	public void enterPermananetAddressLine1(String Permananetaddress) {
		LeadPage.txt_permantAddline1.sendKeys(Permananetaddress);

	}

	public void selectPermanenetPincode(String pinode) {
		LeadPage.txt_permantpincode.sendKeys(pinode);
		LeadPage.drpdwn_permananetAddressPin.click();
	}

	public void selectcurrentPincode(String pinode) {
		LeadPage.txt_currentaddresspincde.sendKeys(pinode);
		LeadPage.list_currentPincode.click();
	}

	public void fillPhotoIdKYCDetails(String photoIdtype, String DocNumber, String DocumenName, String path) {
		selectPhotoIdProof("Yes");
		selectPhotoIdProofType(photoIdtype);
		LeadPage.txt_photoidDocNo.sendKeys(DocNumber);
		LeadPage.txt_photoidprfName.sendKeys(DocumenName);
		LeadPage.photoidUploadedfile.sendKeys(path);
		common.ImplicityWait(10);
		LeadPage.clk_photoidUpload.click();

	}

	public void selectRiskClassification(int index) {
		new Select(LeadPage.drpdwn_RiskClasification).selectByIndex(2);
	}

	public void selectIndutryd(String ind) {
		LeadPage.txt_CompanyIndustry.sendKeys(ind);
		LeadPage.list_IndustryType.click();
	}

	public void selectSubIndus(String subind) {
		LeadPage.txt_CompanySubIndustry.sendKeys(subind);
		LeadPage.list_subIndustryType.click();
	}

	public void selectPermanentAddress() {
		LeadPage.chkbox_permanantAddress.click();
	}

	public String getCustomerName() {
		// *[contains(text(),'Aditya A Kulkarni')]

		String Fname = LeadPage.txt_firstname.getText();
		String Middle = LeadPage.txt_middleName.getText();
		String LastName = LeadPage.txt_lastName.getText();
		String fullName = Fname + Middle + LastName;
		String getCustomerName = fullName;
		return getCustomerName;
	}

	public void openLeadbyBM(String Name) {

		String path = "//a[contains(text()," + Name + ")]";

		driver.findElement(By.xpath(path)).click();
	}

	public void actionsonBM(String action) {

		if (action.equalsIgnoreCase("Approved")) {
			LeadPage.link_bmrecommedned.click();
		} else {
			if (action.equalsIgnoreCase("Reject")) {
				LeadPage.txt_bmrejectedbox.sendKeys("Rejected Resons");
			} else {
				if (action.equalsIgnoreCase("CSE Rework")) {
					LeadPage.link_cseRework.click();
				}
			}
		}
	}

	public void dynamciGrid(String Name) {
		// div[3]/div[4]/div/a
		int i = 1;
		String p = "//div[";
		String p1 = "]/div[4]/div/a";
		String finalp = p + i + p1;

		List<WebElement> list = driver.findElements(By.xpath(finalp));

		for (WebElement get : list) {
			if (get.getText().equalsIgnoreCase(Name)) {
				get.click();
			}
		}
	}

	public void takeDedupeaction(String action) {
		if (action.equalsIgnoreCase("ignore")) {
			LeadPage.dedupe_clkIgnoreCreate.click();

		} else {
			if (action.equalsIgnoreCase("Edit")) {
				LeadPage.dedupe_clk_EditexistingLead.click();
			}
		}
	}

	public void tackeCustomerDedupeaction() {
		LeadPage.dedupe_chkRecords.click();
		LeadPage.dedupe_UpdateRecord.click();

	}

	public String getCutomerFullname() {
		String fname = LeadPage.txt_firstname.getText();
		String lname = LeadPage.txt_lastName.getText();
		String mname = LeadPage.txt_middleName.getText();

		String fullName = "'" + fname + mname + lname + "'";
		return fullName;
	}
/************************************************************************
 * 
 * Corporate Methods
 * 
 **************************************************************************/
	public void selectcmpnykyc1doc() {

		new Select(LeadPage.drpdwn_cmpnykyc1type).selectByIndex(2);

	}
	
	public void entercmpnyKYC1DocNo(String docNo){
		LeadPage.txt_cmpnykyc1number.sendKeys(docNo);
	}
	
	public void selectcmyKYC1Issuedate(String issuedate,String year,String month){
		
		LeadPage.txt_cmpnyKYC1IssueDate.click();
		changeYear(year);
		changeMonths(month);
		driver.findElement(By.linkText(issuedate)).click();
	}
	
	public void selectDOI(String date, String Month, String year){
		LeadPage.codate_CompanyDOI.click();
		changeYear(year);
		changeMonths(Month);
		driver.findElement(By.linkText(date)).click();
	}
	
	public void uploadCompanyKYC1Document(String path){
		LeadPage.attachedcmpnykyc1.sendKeys(path);
	LeadPage.pick_cmpyKYC1image.click();
	}
	
	public void selectcmyKYC1Expiredate(String expire,String year,String month){
		
		LeadPage.txt_cmpnyKYC1IssueDate.click();
		changeYear(year);
		changeMonths(month);
		driver.findElement(By.linkText(expire)).click();
	}
	
	public void changeCoapplicantLeadStatus(String status){
	
		new Select(	LeadPage.drpdown_CoapplicantLeadStatus).selectByVisibleText(status);
	}

	
	public void selectKYC2DocType(){
		new Select(LeadPage.drpdwn_cmpnykyc2type).selectByIndex(2);
	}
	
	
	public void entercmpnyKYC2DocNo(String docNo){
		LeadPage.txt_cmpnykyc2No.sendKeys(docNo);
	}
	
	public void selectcmyKYC2Issuedate(String issuedate,String year,String month){
		
		LeadPage.txt_cmpnyKYC2IssueDate.click();
		changeYear(year);
		changeMonths(month);
		driver.findElement(By.linkText(issuedate)).click();
	}
	
	public void entercmpyKYC2DocumentName(String Doc2){
		LeadPage.txt_cmpnyKYC2Name.sendKeys(Doc2);
	}
	
	public void uploadCompanyKYC2Document(String path){
		LeadPage.attachedcmpnykyc2.sendKeys(path);
	LeadPage.pick_cmpyKYC2image.click();
	}
	
	public void selectcmyKYC2Expiredate(String expire,String year,String month){
		
		LeadPage.txt_cmpnyKYC2ExpireDate.click();
		changeYear(year);
		changeMonths(month);
		driver.findElement(By.linkText(expire)).click();
	}
	
	public void corporateSaveBtn(){
		
		LeadPage.btn_corporateSave.click();
	}
	
	public void entercorpCurrentAddress(String add1){
		LeadPage.txt_CompanyAddressLine1.sendKeys(add1);
	}
	
	public void enterCompanyNameEntityName(String CompanyName){
	LeadPage.txt_CoapplicantCompanyEnityName.sendKeys(CompanyName);
	}
	
	
	public void selectComapnyPincode(String pinode) {
		LeadPage.txt_companyPincode.sendKeys(pinode);
		LeadPage.list_cropCompanyPin.click();
	}
	
	

}
