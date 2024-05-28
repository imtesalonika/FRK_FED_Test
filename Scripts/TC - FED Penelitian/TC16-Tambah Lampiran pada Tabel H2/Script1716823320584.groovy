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

WebUI.click(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED - LOGIN/input_Username_username (1)'))

WebUI.setText(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED - LOGIN/input_Username_username (1)'), 
    'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (1)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.sendKeys(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED/span_Evaluasi Diri (1)'))

WebUI.click(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED/a_Rekap Kegiatan (1)'))

WebUI.click(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED/b_Evaluasi Penelitian (1)'))

WebUI.click(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED/button_Tambah                              _e565e0 (1)'))

WebUI.uploadFile(findTestObject('Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED/Upload'), 'C:\\\\Users\\\\ASUS\\\\Downloads\\\\Documents\\\\mpdf.pdf')

WebUI.click(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED/button_Upload                              _8f5048 (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED/div_Lampiran sudah diupload (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Test Add Lampiran FED Penelitian - TC Positif/Tabel H2/Page_FRK  FED/button_Tambah                              _e565e0 (1)'))

WebUI.closeBrowser()

