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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (116)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (116)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (116)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (80)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (116)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/b_Tunjangan Lainnya (69)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Menunggu_btn btn-warning mr-1 (27)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama                                 _42d808 (7)'), 
    'Anggota Jurnal Redaksi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Ketua Redaksi Jurnal ber-ISSN       _d2fb4d (1)'), 
    'Anggota Redaksi Jurnal ber-ISSN', true)

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan                              _304aaa (7)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Anggota Jurnal Redaksi'), 'Anggota Jurnal Redaksi')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Anggota Redaksi Jurnal ber-ISSN (2)'), 'Anggota Redaksi Jurnal ber-ISSN')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (108)'), 0)

WebUI.rightClick(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (108)'))

WebUI.closeBrowser()

