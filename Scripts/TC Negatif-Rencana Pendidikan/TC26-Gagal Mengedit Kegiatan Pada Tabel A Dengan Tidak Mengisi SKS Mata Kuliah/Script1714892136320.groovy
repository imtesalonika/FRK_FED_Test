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

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (86)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (86)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (48)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (56)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (86)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/i_Menunggu_bi bi-pencil-square (15)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama                                 _c3a99b (26)'), 
    'Test Pendidikan B')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah Kelas                         _e17e3a (9)'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah Kelas                         _ee35bd (9)'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_SKS Mata                             _1172d7 (9)'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (32)'))

WebUI.rightClick(findTestObject('Object Repository/Page_FRK  FED/label_SKS Mata                             _952dca (1)'))

WebUI.closeBrowser()

