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

WebUI.comment('Prerequisites: Navigasi ke url dan Login Akun')

WebUI.click(findTestObject('Navbar/Berlangganan'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.scrollToElement(findTestObject('Pages/Shop/Internet'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Pages/Shop/Internet'))

WebUI.scrollToElement(findTestObject('Pages/Shop/Disney'), GlobalVariable.Timeout)

WebUI.click(findTestObject('Pages/Shop/Lihat Detail'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Pages/Shop/Langganan Sekarang'))

WebUI.waitForElementPresent(findTestObject('Pages/Shop/Konfirmasi'), GlobalVariable.Timeout)

WebUI.verifyElementText(findTestObject('Pages/Shop/Konfirmasi'), 'Konfirmasi')

WebUI.closeBrowser()

