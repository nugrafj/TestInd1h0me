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

WebUI.click(findTestObject('Navbar/Profile'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Pages/Profile/Ubah Profil Saya'))

WebUI.waitForElementPresent(findTestObject('Pages/Profile/Text Ubah Profil'), GlobalVariable.Timeout)

WebUI.setText(findTestObject('Pages/Profile/Input Nama'), 'Miss QA')

WebUI.click(findTestObject('Pages/Profile/Kalender'))

WebUI.selectOptionByValue(findTestObject('Pages/Profile/Pilih Tahun'), '1990', true)

WebUI.click(findTestObject('Pages/Profile/Tanggal 17'))

WebUI.click(findTestObject('Pages/Profile/Perempuan'))

WebUI.click(findTestObject('Pages/Profile/Simpan'))

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.verifyElementText(findTestObject('Pages/Profile/Text Nama'), 'Miss QA')

WebUI.closeBrowser()

