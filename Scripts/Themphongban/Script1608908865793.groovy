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

WebUI.setText(findTestObject('Object Repository/Themphongban1/Page_Qun L Ti Sn DKC/input_Tn Ngi Dng_UserName'), Username)

WebUI.setText(findTestObject('Object Repository/Themphongban1/Page_Qun L Ti Sn DKC/input_Mt Khu_Password'), Password)

WebUI.click(findTestObject('Object Repository/Themphongban1/Page_Qun L Ti Sn DKC/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/Themphongban1/Page_Trang Ch/p_Phng Ban'))

WebUI.click(findTestObject('Object Repository/Themphongban1/Page_Danh sch phng ban/a_Thm'))

WebUI.setText(findTestObject('Object Repository/Themphongban1/Page_Thm phng mi/input__ProjectSymbol'), Maphong)

WebUI.setText(findTestObject('Object Repository/Themphongban1/Page_Thm phng mi/input__ProjectName'), Tenphong)

WebUI.setText(findTestObject('Object Repository/Themphongban1/Page_Thm phng mi/textarea_a ch_Address'), Diachi)

WebUI.click(findTestObject('Object Repository/Themphongban1/Page_Thm phng mi/button_Lu phng'))

WebUI.closeBrowser()

