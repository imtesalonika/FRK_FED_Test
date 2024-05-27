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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (151)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (27)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (28)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (115)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (151)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Penelitian (15)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Proposal_btn btn-warning mr-1'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama                                 _c3a99b (18)'), 
    'Kegiatan 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Proposal                            _417a29 (1)'), 
    'Pengumpulan data /sebar kuesioner', true)

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (33)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kegiatan 1 (6)'), 'Kegiatan 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Pengumpulan data sebar kuesioner'), 'Pengumpulan data /sebar kuesioner')

WebUI.closeBrowser()

