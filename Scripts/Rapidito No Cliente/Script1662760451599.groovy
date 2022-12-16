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

WebUI.navigateToUrl(GlobalVariable.URLNOCLIENTE)

WebUI.click(findTestObject('Object Repository/BS/Page_LandingPage - Banco Solidario/img_meses_Continuar'))

WebUI.setText(findTestObject('Object Repository/BS/Page_/input_Vamos a empezar, ingresa los siguient_6b91ac'), 'Bryan')

WebUI.setText(findTestObject('Object Repository/BS/Page_/input_Vamos a empezar, ingresa los siguient_002277'), 'Armas')

WebUI.setText(findTestObject('Object Repository/BS/Page_/input_Vamos a empezar, ingresa los siguient_c53a2e'), identificacion)

WebUI.setText(findTestObject('Object Repository/BS/Page_/input_Fecha Nacimiento no pertenece al cedu_1a96b4'), fechanacimiento)

WebUI.setText(findTestObject('Object Repository/BS/Page_/input_No es una fecha vlida_TelefonoCelular'), '96903086')

WebUI.setText(findTestObject('Object Repository/BS/Page_/input_No es una fecha vlida_CorreoElectronico'), 'barmas@solidario.fin.ec')

WebUI.click(findTestObject('Object Repository/BS/Page_/input_El Correo no es vlido_Autorizacion'))

WebUI.click(findTestObject('Object Repository/BS/Page_/input_VER TUTORIAL_btnContinuar'))

WebUI.verifyTextPresent('AL PARECER NO TENEMOS UNA OFERTA PARA TI', false, FailureHandling.STOP_ON_FAILURE)

