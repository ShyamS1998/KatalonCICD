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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tafj-jbbrw-dev.alsalam.com.bh:8843/transact-explorer-wa/#/login')

WebUI.setText(findTestObject('Object Repository/TC_01/Page_Transact Explorer/input_User Id_userId'), 'AUTOMATION.MAKER.02')

WebUI.click(findTestObject('Object Repository/TC_01/Page_Transact Explorer/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/TC_01/Page_Transact Explorer/input_Password_password'), 'lWwuSQKlwQ9v889dR0tr8w==')

WebUI.click(findTestObject('Object Repository/TC_01/Page_Transact Explorer/span_Login'))

WebUI.closeBrowser()

