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

WebUI.navigateToUrl('https://inventory-test.allec.io/login')

WebUI.setText(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input_Email_email'), 
    'system.admin@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input_Password_password'), 
    'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/button_Login'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/ul_Super System  Admin system.admintest.com_7d7112'))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/span_Purchase Orders'))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/a_Create'))

WebUI.navigateToUrl('https://inventory-test.allec.io/orders/create')

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/div_Supplier SupplierSelect one'))

WebUI.setText(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input_Cancel_select2-search__field'), 
    'Supplier')

WebUI.sendKeys(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input__req_delivery_date'))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/span_4'))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/div_Item ExampleSelect one'))

WebUI.setText(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input_Cancel_select2-search__field'), 
    'Example')

WebUI.sendKeys(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/div_Packing Unit Of MeasureCSSelect one'))

WebUI.setText(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input_Cancel_select2-search__field'), 
    'CS')

WebUI.sendKeys(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input_Cancel_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input__product'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/input__product_1'), 
    '20.0000000000002')

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/button_Add Item'))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/button_Submit'))

WebUI.navigateToUrl('https://inventory-test.allec.io/orders/summary')

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/button_Submit_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Allec - Inventory Management System/Page_Allec - Inventory Management System/button_Not Now'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://inventory-test.allec.io/receiving')

WebUI.closeBrowser()


