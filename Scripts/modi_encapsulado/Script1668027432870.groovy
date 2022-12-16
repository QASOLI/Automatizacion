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

WebUI.navigateToUrl('http://172.19.19.94:8091/SimuladorEnPunta/')

WebUI.setText(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Login/input_Login_UserName'), 'chavezt')

WebUI.setEncryptedText(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Login/input_Oficina_Password'), 
    'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Login/input_Oficina_btn btn-primary'))

WebUI.callTestCase(findTestCase('ofertar_documento'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.click(findTestObject('Simulador_Punta/Page_Simulador/button_Ofertar'))) {
    WebUI.callTestCase(findTestCase('ofertar'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (WebUI.click(findTestObject('Simulador_Punta/Page_Simulador/button_Ofertar (1)'))) {
    WebUI.click(findTestObject('Simulador_Punta/Page_Simulador/button_Ofertar (1)'))

    WebUI.click(findTestObject('Simulador_Punta/ofertar_div generar oferta documento/Page_Simulador/button_Generar Campaa'))
} else {
    WebUI.click(findTestObject('Simulador_Punta/Page_Simulador/button_Ofertar (2)'))

    WebUI.click(findTestObject('Simulador_Punta/ofertar_div generar oferta documento/Page_Simulador/button_Generar Campaa'))
}

WebUI.closeBrowser()

