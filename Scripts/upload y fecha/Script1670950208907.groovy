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

WebUI.navigateToUrl('https://bpservicepos.com/Rapidito')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_LandingPage - Banco Solidario/img_meses_Continuar'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_Vamos a empezar, ingresa los siguient_6b91ac'), 
    'Bryan')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_Vamos a empezar, ingresa los siguient_002277'), 
    'Armas')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_Vamos a empezar, ingresa los siguient_c53a2e'), 
    '1803893476')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_Fecha Nacimiento no pertenece al cedu_1a96b4'), 
    '12/01/1984')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_No es una fecha vlida_TelefonoCelular'), 
    '96903086')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_No es una fecha vlida_CorreoElectronico'), 
    'barmas@solidario.fin.ec')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_El Correo no es vlido_Autorizacion'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_VER TUTORIAL_btnContinuar'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/img'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_/input_VER TUTORIAL_btnContinuar'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/button_CONTINUAR'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Lo que tienes y lo que debes_TotalIngresos'), 
    '8500')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Lo que tienes y lo que debes_TotalDeudas'), 
    '200')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus ingresos mensuales_Salario'), 
    '2500')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus ingresos mensuales_TotalIngresosV_9b2277'), 
    '200')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus ingresos mensuales_RadioFondos'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasAlimentacion'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasAlquilerviv'), 
    '20')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasServiciobasico'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_Gasvestimenta'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasEducacion'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasSalud'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasTransporte'), 
    '10')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/select_Da de pago.111213141516171819202122232425'), 
    '17/12/2022 12:00:00 a. m.', true)

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/strong_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/li_DATOS PERSONALES Y LABORALES_personal'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Referencia Personal_ReferenciaPersona_ebf4ce'), 
    'pepe')

WebUI.rightClick(findTestObject('Object Repository/Rapidito No Cliente/upload file_fecha/Page_CRDITO WEB NO CLIENTES/input_Subir_InputCertificadoLaboral'))

