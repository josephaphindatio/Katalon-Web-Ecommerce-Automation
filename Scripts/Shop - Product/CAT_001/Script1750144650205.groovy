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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/input_Swag Labs_password'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/button_Add to cart_1_2'))

WebUI.click(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/button_Add to cart_1_2_3'))

WebUI.click(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/button_Add to cart_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/button_Add to cart_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/a_6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/div_Sauce Labs Backpackcarry.allTheThings()_a0841a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/div_Sauce Labs Bike LightA red light isnt t_ab9835'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/div_Sauce Labs Bolt T-ShirtGet your testing_ee3ceb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/div_Sauce Labs Fleece JacketIts not every d_2c6a4b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/div_Sauce Labs OnesieRib snap infant onesie_0ef364'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Cart Test/CAT_001/Page_Swag Labs/div_Test.allTheThings() T-Shirt (Red)This c_f64bbe'), 
    0)

WebUI.closeBrowser()

