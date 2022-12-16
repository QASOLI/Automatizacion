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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_LandingPage - Banco Solidario/img_meses_Continuar'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_Vamos a empezar, ingresa los siguient_6b91ac'), 
    'Bryan')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_Vamos a empezar, ingresa los siguient_002277'), 
    'Armas')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_Vamos a empezar, ingresa los siguient_c53a2e'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_Vamos a empezar, ingresa los siguient_c53a2e'), 
    GlobalVariable.IdentificacionNoCliente)

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_Fecha Nacimiento no pertenece al cedu_1a96b4'), 
    GlobalVariable.FechaNacimientoNoCliente)

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_No es una fecha vlida_TelefonoCelular'), 
    '96903086')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_No es una fecha vlida_CorreoElectronico'), 
    'barmas@solidario.fin.ec')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_El Correo no es vlido_Autorizacion'))

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_/input_VER TUTORIAL_btnContinuar'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/button_CONTINUAR'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Lo que tienes y lo que debes_TotalIngresos'), 
    '5600')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Lo que tienes y lo que debes_TotalDeudas'), 
    '200')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus ingresos mensuales_Salario'), 
    '1230')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus ingresos mensuales_TotalIngresosV_9b2277'), 
    '120')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus ingresos mensuales_RadioFondos'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasAlimentacion'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasAlquilerviv'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasServiciobasico'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_Gasvestimenta'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasEducacion'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasSalud'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Tus gastos mensuales_GasTransporte'), 
    '10')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/button_CONTINUAR_1'))

WebUI.waitForElementPresent(findTestObject('Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/strong_CONTINUAR'), 0)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/strong_CONTINUAR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/select_ProvinciaAZUAYBOLIVARCAARCARCHICHIMB_dad393'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/select_CantnCAYAMBEMEJIAPEDRO MONCAYOPEDRO _aade4a'), 
    '1701', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/select_ParroquiaALANGASAMAGUAAATAHUALPABELI_e750cb'), 
    '170188', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/select_BarrioCDLA UNION CARCHENCE COOP LUCH_77d9b5'), 
    '170188001', true)

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos de tu domicilio_DatosDomicilio._311e47'), 
    'CALLE A')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos de tu domicilio_DatosDomicilio._cd9c25'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos de tu domicilio_DatosDomicilio._270291'), 
    'CALLE B')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos de tu domicilio_DatosDomicilio._e5a471'), 
    '023456789')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos Laborales_DatosLaborales.NombreEmpresa'), 
    'CONDUIT')

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/select_ProvinciaAZUAYBOLIVARCAARCARCHICHIMB_dad393_1'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/select_CantnCAYAMBEMEJIAPEDRO MONCAYOPEDRO _aade4a_1'), 
    '1701', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/select_ParroquiaALANGASAMAGUAAATAHUALPABELI_e750cb_1'), 
    '170159', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/select_BarrioAGLLABARRIOS NO DEFINIDOSCENTR_7e6b40'), 
    '170159015', true)

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos Laborales_DatosLaborales.CalleP_e3fd09'), 
    'CALLE L')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos Laborales_DatosLaborales.NumeroCasa'), 
    '456')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos Laborales_DatosLaborales.CalleT_7e0291'), 
    'CALLE O')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Datos Laborales_DatosLaborales.Telefono'), 
    '034567654')

WebUI.delay(20)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/button_LO ENTIENDO'))

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Referencia Personal_ReferenciaPersona_ebf4ce'), 
    'JUAN')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Referencia Personal_ReferenciaPersona_fcc3c8'), 
    'PEREZ')

WebUI.setText(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Referencia Personal_ReferenciaPersona_eacfcd'), 
    '023498765')

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/input_Este seguro es opcional y se cobrar a_32f06c'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/button_CONTINUAR_1'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/img_TABLA DE AMORTIZACIN_img-check'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/button_CONTINUAR_1'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Rapidito No Cliente/Page_CRDITO WEB NO CLIENTES/Page_CRDITO WEB NO CLIENTES/input_ESTAS MS CERCA DE OBTENER TU CRDITO_btn btn-Solidario'))

