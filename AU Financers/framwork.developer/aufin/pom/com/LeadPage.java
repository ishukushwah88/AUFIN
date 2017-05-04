package aufin.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**********************************
 * 
 * @author ISHANT KUSHWAH
 *
 ***********************************/








public class LeadPage extends LoginPage{

	public LeadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[contains(@href, '/sn/app/CRMNextObject/Home/Lead')]")
	public static WebElement nav_LeadModule;
	
	@FindBy(xpath="//a[@id=BTN_NEW]")
	public static WebElement icon_add;
	
	
	@FindBy(linkText="Sales")
	public static WebElement clk_Sales;
	
	@FindBy(xpath="//i[@id='switch-icon-nav']/span")
	public static WebElement click_Menu;
	
	
	@FindBy(xpath="//*[@id='js-vnav']/li[6]/div/ul/li[1]/a/span[2]")
	public static WebElement clk_LeadTab;
	
	@FindBy(linkText="Asset")
	public static WebElement clk_AssetTab;
	
	
	@FindBy(xpath="//a[contains(text(),'Liability')]")
	public static WebElement link_Liability;
	
	@FindBy(xpath="//a[contains(text(),'Asset')]")
	public static WebElement link_asset;
	
	@FindBy(id="Lea_ex5_79")
	public static WebElement drop_entity;
	
	@FindBy(id="ProductCategoryimgpick")
	public static WebElement icon_ProductSearch;
	
	@FindBy(id="TxtSearch")
	public static WebElement icon_txt_searchbox;
	
	@FindBy(xpath="//*[@id=imgsearch]/i")
	public static WebElement icon_txtSearchlink;
	
	@FindBy(linkText="Wheels")
	public static WebElement icon_txt_searchResult;
	
	@FindBy(xpath="//*[@id=ProductCategory]")
	public static WebElement picker_productCategory;
	
	@FindBy(xpath="//*[@id=ui-id-2]")
	public static WebElement picker_list;
	
	@FindBy(id="ProductID")
	public static WebElement drpdwn_productType;
	
	@FindBy(id="Phone")
	public static WebElement txt_mobile;
	
	@FindBy(xpath="//*[@id=7835]/div[1]/span")
	public static WebElement link_NewStage;
	
	@FindBy(xpath="//*[@id=7836]/div[1]/span")
	public static WebElement link_prospect;
	
	@FindBy(xpath="//*[@id=7837]/div[1]/span")
	public static WebElement link_DocCollected;
	
	@FindBy(xpath="//*[@id=7838]/div/span")
	public static WebElement link_process;
	
	@FindBy(xpath="//*[@id=7839]/div/span")
	public static WebElement link_qualify;
	
	@FindBy(id="Lea_ex1_3")
	public static WebElement txt_customerType;
	
	@FindBy(id="LEA_EX5_13")
	public static WebElement txt_applicantType;
	
	@FindBy(id="SalutationID")
	public static WebElement drpdown_Salutation;
	
	@FindBy(xpath="(//img[@alt='Calendar'])[2]")
	public static WebElement clk_calendarpicker;
	
	@FindBy(xpath="//*[contains(@class,'ui-datepicker-year')]")
	public static WebElement dropdwn_yearselection;
	
	@FindBy(xpath="//*[contains(@class, 'ui-datepicker-month')]")
	public static WebElement drpdwn_monthSelection;
	
	@FindBy(id="FirstName")
	public static WebElement txt_firstname;
	
	@FindBy(id="MiddleName")
	public static WebElement txt_middleName;
	
	@FindBy(id="LastName")
	public static WebElement txt_lastName;
	
	@FindBy(id="LEA_EX5_24")
	public static WebElement txt_ShortName;
	
	/*******************************************************
	 * 
	 * @ INDIVIDUAL ENTITY
	 * 	
	 *******************************************************/
	@FindBy(id="RatingID")
	public static WebElement drodpwn_Ratting;
	
	@FindBy(id="Lea_ex1_28")
	public static WebElement dropdown_Gender;
	
	@FindBy(id="Lea_ex1_37")
	public static WebElement txt_AadharNo;
	
	@FindBy(id="LEA_EX4_5")
	public static WebElement txt_voter;
	
	@FindBy(id="Lea_ex1_22")
	public static WebElement drop_form60;
	
	@FindBy(id="Lea_ex4_24")
	public static WebElement txt_pan;
	
	@FindBy(id="Lea_ex3_32")
	public static WebElement drpdown_residance;
	
	@FindBy(id="LEA_EX4_6")
	public static WebElement txt_dl;
	
	@FindBy(id="Lea_ex3_95")
	public static WebElement txt_RationCard;
	
	@FindBy(id="Lea_ex3_41")
	public static WebElement txt_passportno;
	
	@FindBy(id="Lea_ex1_100")
	public static WebElement txt_issueAT;
	
	@FindBy(xpath="//img[@alt='Calendar'][3")
	public static WebElement icon_passportIssueDate;
	
	@FindBy(linkText="date")
	public static WebElement datepicker;
	
	@FindBy(id="xpath=//img[@alt='Calendar'][4]")
	public static WebElement icon_passportExpireDate;
	
	@FindBy(id="Lea_ex2_45")
	public static WebElement txt_emailaddress;
	
	@FindBy(id="Lea_ex4_52")
	public static WebElement drpdown_source;
	
	@FindBy(id="LEA_EX1_62")
	public static WebElement drpdwn_souceoflead;
	
	@FindBy(id="Lea_ex3_32")
	public static WebElement drpdwn_residance;
	
	@FindBy(id="Lea_ex3_45")
	public static WebElement txt_residancePhone;
	
	@FindBy(id="Lea_ex3_10")
	public static WebElement drpdwn_languageSelection;
	
	@FindBy(id="Lea_ex5_3")
	public static WebElement txt_leadAmount;
	
	@FindBy(id="Lea_ex2_49")
	public static WebElement txt_meetingNotes;
	
	@FindBy(id="Lea_ex2_49")
	public static WebElement drpdwn_maker_productDetails;
	
	@FindBy(id="Lea_ex5_98")
	public static WebElement txt_model;
	
	@FindBy(id="Lea_ex5_91")
	public static WebElement txt_variant;
	
	@FindBy(id="Lea_ex2_48")
	public static WebElement drpdwn_RiskClasification;
	
	@FindBy(id="LeadOwnerName")
	public static WebElement txt_ladowner;
	
	
	@FindBy(id="LE_ProfileImage")
	public static WebElement icon_customerphoto;
	
	@FindBy(xpath="//div[@id='collap-on1_8']/div/div/div/div/div/a/i")
	public static WebElement icon_customerphotodele;
	
	@FindBy(id="cust_1060")
	public static WebElement icon_customerSignature;
	
	@FindBy(xpath="//div[@id='collap-on1_8']/div[3]/div/div/div/div/a/i")
	public static WebElement icon_customerSignaturedele;
	
	@FindBy(id="Lea_ex4_34")
	public static WebElement drpdwn_photoproof;
	
	@FindBy(id="Lea_ex3_1")
	public static WebElement drpdwn_photoidpftype;
	
	@FindBy(id="Lea_ex4_91")
	public static WebElement txt_photoidprfName;
	
	@FindBy(id="Lea_ex1_19")
	public static WebElement txt_photoidDocNo;
	
	@FindBy(id="//img[@alt='Calendar'][9]")
	public static WebElement icon_pidIssueCalendar;
	
	@FindBy(id="//img[@alt='Calendar'][10]")
	public static WebElement icon_pidExpireCalendar;
	
	@FindBy(xpath="//a[@id='1636_pickPhoto']/i")
	public static WebElement clk_photoidBrowse;
	
	@FindBy(xpath="//a[@id='1636']/i")
	public static WebElement clk_photoidUpload;
	
	@FindBy(id="1635_pickPhoto")
	public static WebElement addressprf_browse;
	
	@FindBy(xpath="//a[@id='1635']/i")
	public static WebElement addresprf_upload;
	
	@FindBy(id="Lea_ex2_5")
	public static WebElement txt_currentaddresspincde;
	
	
	@FindBy(id="ui-id-29")
	public static WebElement list_currentPincode;
	
	@FindBy(id="Lea_ex1_73")
	public static WebElement txt_currentAddressLine1;
	
	@FindBy(id="Lea_ex5_44")
	public static WebElement chkbox_permanantAddress;
	
	@FindBy(id="Lea_ex5_74")
	public static WebElement txt_permantAddline1;
	
	@FindBy(xpath="//*[@id='profilediv_200178']/div[1]/div/div[2]/div[1]/div[1]/div[2]/h3")
	public static WebElement customerName;
	
	@FindBy(id="Lea_ex5_60")
	public static WebElement txt_permantpincode;
	
	@FindBy(id="ui-id-31")
	public static WebElement drpdwn_permananetAddressPin;
	
	@FindBy(id="Lea_ex2_6imgpick")
	public static WebElement icon_searchPrevertInvestment;
	
	@FindBy(xpath="//*[@id='jqxWidget680a1c92']/div[1]/div")
	public static WebElement chkbx_prefreedInvestment_other;
	
	@FindBy(id="btnSelect")
	public static WebElement btn_PrefredInvestmentSelect;
	
	@FindBy(id="Lea_ex1_9")
	public static WebElement drpdwn_Occupation;
	
	@FindBy(id="Lea_ex2_4")
	public static WebElement txt_OccupationOther;
	
	@FindBy(id="Lea_ex3_28")
	public static WebElement drpdown_Regions;
	
	@FindBy(id="Lea_ex2_90")
	public static WebElement txt_RegionsOther;
	
	@FindBy(xpath="//div[3]/div/ul/li[2]/a/span")
	public static WebElement btn_SaveProcessed;
	
	@FindBy(xpath="//div[3]/div/div/div/ul/li/div/input")
	public static WebElement photoidUploadedfile;
	
	
	
/***********************************************************************
 * 
 * @ Corporate Entities related fields
 * 
 ***********************************************************************/

	@FindBy(id="Lea_ex5_99")
	public static WebElement txt_CoapplicantCompanyName;
	
	@FindBy(id="Lea_ex5_92")
	public static WebElement txt_CompanyTelephone;
	
	@FindBy(id="Lea_ex3_51")
	public static WebElement txt_CompanyTurnover;
	
	@FindBy(id="Lea_ex3_52")
	public static WebElement txt_CompanyExpirance;
	
	@FindBy(id="Lea_ex5_82")
	public static WebElement txt_CompanyWebSite;
	@FindBy(id="Lea_ex3_55")
	public static WebElement txt_CompanyBranch;
	
	@FindBy(id="Lea_ex6_26")
	public static WebElement txt_CompanySubIndustry;
	
	@FindBy(id="ui-id-30")
	public static WebElement list_subIndustryType;
	
	@FindBy(id="Lea_ex6_25")
	public static WebElement txt_CompanyIndustry;
	
	@FindBy(id="ui-id-28")
	public static WebElement list_IndustryType;
	
	@FindBy(id="Lea_ex5_99")
	public static WebElement txt_CoapplicantCompanyEnityName;
	
	@FindBy(id="Lea_ex3_35")
	public static WebElement drpdwn_CompanyBusinessType;
	
	@FindBy(xpath="(//img[@alt='Calendar'])[9]")
	public static WebElement codate_CompanyDOI;
	
	@FindBy(id="Lea_ex2_53")
	public static WebElement txt_CompanyTeleNo;
	
	@FindBy(id="Lea_ex5_96")
	public static WebElement txt_CompanyAddressLine1;
	
	@FindBy(id="Lea_ex3_85")
	public static WebElement txt_companyPincode;
	
	@FindBy(xpath="//*[@id='ui-id-38']/li/a")
	public static WebElement list_companypin;
	
	@FindBy(id="Lea_ex2_66")
	public static WebElement drpdwn_cmpnykyc1type;
	
	@FindBy(id="Lea_ex1_70")
	public static WebElement txt_cmpnykyc1name;
	
	@FindBy(id="Lea_ex1_27")
	public static WebElement txt_cmpnykyc1number;
	
	@FindBy(xpath="(//img[@alt='Calendar'])[5]")
	public static WebElement txt_cmpnyKYC1IssueDate;
	
	@FindBy(xpath="((//img[@alt='Calendar'])[6]")
	public static WebElement txt_cmpnyKYC1ExpireDate;
	
	@FindBy(xpath="//div[2]/div/div/div/ul/li/div/input")
	public static WebElement attachedcmpnykyc1;
	
	@FindBy(xpath="//*[@id='1669']/i")
	public static WebElement pick_cmpyKYC1image;
	
	@FindBy(id="Lea_ex3_6")
	public static WebElement drpdwn_cmpnykyc2type;
	
	@FindBy(id="Lea_ex1_63")
	public static WebElement txt_cmpnykyc2No;
	
	@FindBy(id="Lea_ex1_26")
	public static WebElement txt_cmpnyKYC2Name;
	
	@FindBy(xpath="(//img[@alt='Calendar'])[7]")
	public static WebElement txt_cmpnyKYC2IssueDate;
	
	@FindBy(xpath="(//img[@alt='Calendar'])[8]")
	public static WebElement txt_cmpnyKYC2ExpireDate;
	
	@FindBy(xpath="//div[5]/div[2]/div/div/ul/li/div/input")
	public static WebElement attachedcmpnykyc2;
	
	@FindBy(xpath="//*[@id='1670']/i")
	public static WebElement pick_cmpyKYC2image;
	
	
	@FindBy(xpath="//a[@id='btnSave102202']/span")
	public static WebElement btn_corporateSave;
	
	
	@FindBy(id="ui-id-29")
	public static WebElement list_cropCompanyPin;
	
	@FindBy(id="StatusCodeID")
	public static WebElement drpdown_CoapplicantLeadStatus;
	
	
	/********************************************
	 * Lead Module Home Page
	 * 
	 * 
	 * 
	 ********************************************/
	
	@FindBy(id="CategoryWithViewdd")
	public static WebElement drpdwn_Customizeview;
	
	@FindBy(id="drpCategory")
	public static WebElement drpdwn_selectModule;
	
	@FindBy(xpath="//li[2]/div/div[3]/a/i")
	public static WebElement iconclk_customizeArrow;
	
	@FindBy(xpath="//*[@id='divContents']/div[1]/div[3]/div[1]/span")
	public static WebElement get_Leadid;
	
	@FindBy(xpath="//*[@id='divContents']/div[1]/div[3]/div[2]/span")
	public static WebElement getLeadStatus;
	
	@FindBy(xpath="//*[@id='divContents']/div[1]/div[3]/div[4]/span")
	public static WebElement getLeadProduct;
	
	@FindBy(xpath="//*[@id='divContents']/div[1]/div[3]/div[5]/span")
	public static WebElement getLeadOwner;
	
	@FindBy(xpath="//div[@id='divmaterialButton']/a/i")
	public static WebElement clck_CustoizeBtn;
	
	@FindBy(xpath="//*[@id='BTN_EDIT_0']/i")
	public static WebElement click_EditBtn;
	
	
	/**************************************************
	 * 
	 * Lead Search Paramters on Lead Home Page
	 * 
	 **************************************************/
	
	@FindBy(xpath="//*[@id='widget_42_M_LeadNo']")
	public static WebElement leadSearch_leadNo;
	
	@FindBy(id="widget_42_M_Phone")
	public static WebElement leadSearch_Mobile;
	
	@FindBy(id="widget_42_M_Lea_ex4_24")
	public static WebElement leadSearch_PAN;
	
	@FindBy(id="widget_42_M_Lea_ex1_37")
	public static WebElement leadSearch_AadharCard;
	
	@FindBy(id="widget_42_M_LEA_EX4_6")
	public static WebElement leadSearch_DL;
	
	@FindBy(id="widget_42_M_LEA_EX4_6")
	public static WebElement leadSearch_passport;
	
	@FindBy(id="widget_42_M_LEA_EX4_5")
	public static WebElement leadSearch_voterID;
	
//	@FindBy(id="widget_42_M_LeadNo")
//	public static WebElement leadSearch_leadNo;
//	
//	@FindBy(id="widget_42_M_LeadNo")
//	public static WebElement leadSearch_leadNo;
	
	
	@FindBy(id="ptc")
	public static WebElement alert_leadtolead;
	
	@FindBy(xpath="//input[@value='Ignore & create Lead ']")
	public static WebElement dedupe_clkIgnoreCreate;
	
	@FindBy(xpath="//input[@value='Edit Existing Lead ']")
	public static WebElement dedupe_clk_EditexistingLead;
	
	@FindBy(xpath="//input[@name='chkList']")
	public static WebElement dedupe_chkRecords;
	
	@FindBy(xpath="//input[@value='Update/Create ']")
	public static WebElement dedupe_UpdateRecord;
	
	
	
	
	
/***********************************************************
 * @author Ishant Kushwaha 
 * BRANCH MANAGER ELEMENTS 
 * Date : 26 April 2017
 * 
 *
 **********************************************************/
	
	@FindBy(xpath="//span[@id='100375']")
	public static WebElement link_bmrecommedned;
	
	@FindBy(xpath="//span[@id='100374']")
	public static WebElement link_bmRejected;
	
	@FindBy(id="Lea_ex5_62")
	public static WebElement txt_bmrejectedbox;

	@FindBy(id="100163")
	public static WebElement link_cseRework;
	
	
	
	/***************************************
	 * @author Ishant Kushwaha
	 * CO-Applicant Layout
	 * 
	 **************************************/
	
	@FindBy(xpath="//*[@id='headerlink_102214']")
	public static WebElement link_newCoapplicant;
	
	@FindBy(xpath="//body/div[2]/ul/li/a/i")
	public static WebElement clk_switchBtn;
	
	@FindBy(xpath="//a[@id='LINK_NEW_LEAD']")
	public static WebElement clk_newCoapplicant;

	
	
	
	
	
}
