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

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (165)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (41)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (42)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (128)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (165)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Penelitian (29)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Pengumpulan data sebar kuesioner_btn_b2f7b5'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Yakin (11)'))

WebUI.closeBrowser()

