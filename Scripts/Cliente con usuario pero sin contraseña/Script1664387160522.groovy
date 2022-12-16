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

WebUI.verifyTextPresent('Es obligatorio registrar una nueva clave de ingreso segura', false)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Page_Cambio de clave/span_Continuar'))

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/Page_Cambio de clave/input_Cambio de contrasea_mat-input-2'), 
    'hsPFm2cfhkw=')

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/Page_Cambio de clave/input_Clave actual_mat-input-3'), 
    GlobalVariable.ClaveNuevaBancaWeb)

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/Page_Cambio de clave/input_Clave nueva_mat-input-4'), 
    GlobalVariable.ClaveNuevaBancaWeb)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Page_Cambio de clave/span_Continuar'))

WebUI.verifyTextPresent('Tu clave fue cambiada exitosamente', false)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Page_Cambio de clave/span_Cerrar'))

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Page_Autenticacin/input_Banca por internet_mat-input-5'), 
    GlobalVariable.UsuarioBancaWeb)

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/Page_Autenticacin/input_Usuario_mat-input-6'), 
    GlobalVariable.ClaveNuevaBancaWeb)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Page_Autenticacin/span_Ingresar'))

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/Page_Autenticacin/input_Ingresa el cdigo temporal_mat-input-7'), 
    'uDiLLqyTEVE=')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Page_Autenticacin/span_Continuar'))

