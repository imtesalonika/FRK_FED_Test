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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (71)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (71)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (71)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (45)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (71)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/b_Tunjangan Lainnya (29)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Tambah Kegiatan (48)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (55)'), 'Pemasaran dan Promosi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Open this select menu               _14b7a3 (1)'), 
    'Anggota Redaksi Jurnal ber-ISSN', true)

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan (48)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Pemasaran dan Promosi'), 'Pemasaran dan Promosi')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Anggota Redaksi Jurnal ber-ISSN'), 'Anggota Redaksi Jurnal ber-ISSN')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (63)'), 0)

WebUI.rightClick(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (63)'))

WebUI.rightClick(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (63)'))

WebUI.closeBrowser()
