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

WebUI.navigateToUrl(GlobalVariable.URLSIMULADOR)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Simulador_Punta/Page_Login/input_Login_UserName (1)'), GlobalVariable.UserSimulador)

WebUI.setEncryptedText(findTestObject('Object Repository/Simulador_Punta/Page_Login/input_Oficina_Password (1)'), GlobalVariable.PasswordSimulador)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Login/input_Oficina_btn btn-primary (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Index/a_SIMULADOR (1)'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Index/a_SIMULADOR_1'))

WebUI.setText(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/input_Identificacin_inputIdentificacion (1)'), 
    GlobalVariable.identificacionSimulador)

WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/button_Buscar (1)'))

if (WebUI.verifyTextPresent('Cliente con oferta en proceso', false)) {
    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Index/a_SIMULADOR'))

    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Index/a_MODIFICAR OFERTA'))

    WebUI.setText(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/input_Identificacin_inputIdentificacion'), 
        GlobalVariable.identificacionSimulador)

    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/button_Buscar'))

    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/button_Generar Oferta'))

    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/button_Ofertar'))

    //WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/div_EmpaquetadoMonto (0 meses) 0.00Alia 0.00'))
    //WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/div_UniCrdito InmediatoMonto (0 meses) 0.00'))
    //WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/div_Alia Inmediato 700.00Ofertar'))
    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/button_Generar Campaa'))
} else if (WebUI.verifyTextPresent('Cliente ya cuenta con los productos ALIA y UC', false)) {
    WebUI.closeBrowser()
} else {
    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/button_Generar Oferta (1)'))

    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/button_Ofertar (1)'))

    WebUI.click(findTestObject('Object Repository/Simulador_Punta/Page_Simulador/button_Generar Campaa (1)'))
}

WebUI.closeBrowser()

