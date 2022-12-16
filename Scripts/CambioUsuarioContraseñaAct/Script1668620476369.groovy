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

WebUI.navigateToUrl('http://172.19.19.94:8091/bancaweb3.0/login')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Autenticacin/input_Banca por internet_mat-input-0'), 
    '0703112698')

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Autenticacin/input_Usuario_mat-input-1'), 
    'hsPFm2cfhkw=')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Autenticacin/button_Ingresar'))

WebUI.verifyTextPresent('El tiempo de la clave provisional ha caducado', false)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Autenticacin/button_Cerrar'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Autenticacin/button_Ingresar'))

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Ingreso nuevo usuario/input_Cambio de usuario y contrasea_mat-input-2'), 
    '0703112698B')

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Ingreso nuevo usuario/input_Usuario_mat-input-3'), 
    'hsPFm2cfhkw=')

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Ingreso nuevo usuario/input_Clave anterior_mat-input-4'), 
    'GYDmRgS5yd5vvbvKzxSMZQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Ingreso nuevo usuario/input_Clave nueva_mat-input-5'), 
    'GYDmRgS5yd5vvbvKzxSMZQ==')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Ingreso nuevo usuario/button_Continuar'))

WebUI.verifyTextPresent('Tu usuario y clave han sido registrados exitosamente', false)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Ingreso nuevo usuario/button_Cerrar'))

WebUI.verifyTextPresent('Es obligatorio registrar las preguntas de seguridad', false)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Registro de pregunta de seguridad/button_Cerrar'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Registro de pregunta de seguridad/div_Sugerida del sistema_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Registro de pregunta de seguridad/span_Cul es mi deporte favorito'))

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Registro de pregunta de seguridad/input_Respuesta_mat-input-6'), 
    '11111111B')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Registro de pregunta de seguridad/button_Continuar'))

WebUI.verifyTextPresent('Pregunta de seguridad registrada exitosamente', false)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/CambioUsuarioContraseñaOK/Page_Registro de pregunta de seguridad/button_Cerrar'))

