import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:41237/')

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Qun L Ti Sn DKC/input_Tn Ngi Dng_UserName'), 'BMT')

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Qun L Ti Sn DKC/input_Mt Khu_Password'), '12345')

WebUI.click(findTestObject('Object Repository/Themnhanvien/Page_Qun L Ti Sn DKC/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/Themnhanvien/Page_Trang Ch/p_Danh Sch Nhn Vin'))

WebUI.click(findTestObject('Object Repository/Themnhanvien/Page_Nhn Vin/a_Thm mi'))

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Thm Nhn Vin/input_UserName_UserName'), Username)

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Thm Nhn Vin/input_Tn y _FullName'), Fullname)

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Thm Nhn Vin/input_Email_Email'), Email)

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Thm Nhn Vin/input_Phone_PhoneNumber'), Phone)

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Thm Nhn Vin/textarea_a Ch_Address'), Address)

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Thm Nhn Vin/input_Phng_Department'), Departmend)

WebUI.setText(findTestObject('Object Repository/Themnhanvien/Page_Thm Nhn Vin/input_V Tr_Position'), Position)

WebUI.click(findTestObject('Object Repository/Themnhanvien/Page_Thm Nhn Vin/button_Lu'))

WebUI.closeBrowser()

