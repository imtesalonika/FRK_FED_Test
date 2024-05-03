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

WebUI.navigateToUrl('http://localhost:8000/')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/body_Login                                 _220830'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (13)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (13)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (13)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (11)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (13)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Tambah Kegiatan (13)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (13)'), 'Koordinator KP')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan (13)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Koordinator KP'), 'Koordinator KP')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (12)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu_1 (12)'), 0)

WebUI.closeBrowser()

