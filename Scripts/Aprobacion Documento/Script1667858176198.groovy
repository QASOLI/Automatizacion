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

WebUI.navigateToUrl(GlobalVariable.URLAPROBACION)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/input_Login_usuario'), 
    'TACOA')

WebUI.setEncryptedText(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/input_Login_contrasenia'), 
    'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/button_INGRESAR'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/input_Gestin de Solicitud_dx-texteditor-input'), 
    GlobalVariable.IdentificacionNoCliente)

WebUI.sendKeys(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/input_Gestin de Solicitud_dx-texteditor-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/input_Opciones_chb144316'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/button_Ver Documento'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/button_CERRAR'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/strong_Aprobar'))

WebUI.verifyTextPresent('Se aprobó el documento correctamente', false)

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/input_Documento Aprobado_btn btn-Solidario'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Aprobacion/Page_CRDITO WEB NO CLIENTES/a_TACOA   SALIR'))

WebUI.closeBrowser()

