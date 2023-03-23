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

Mobile.startApplication('C:\\Users\\ARMASB\\OneDrive - Banco Solidario\\Documentos\\Bryan\\Bryan\\Pruebas\\REQ11 Registro Civil\\01 Vlidaciones microapp\\MicroAppsQA03.apk', 
    true)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Usuario de BankPlus'), 'matad', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Contrasea de BankPlus'), '111111', 
    0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Nuevo PIN - Usa 4 dgitos'), '1234', 
    0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Nmero de cdula del cliente'), '0925312894', 
    0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Alquiler, depsito, Almacenaje'), '32', 
    0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Servicios bsicos'), '15', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Gastos personales'), '22', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Educacin'), '36', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Alimentacin'), '55', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Transporte'), '32', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Otras deudas'), '45', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Total ventas'), '850', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Total compras'), '325', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Otros ingresos'), '50', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Total activos'), '22000', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Total pasivos'), '12000', 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.Button - SIGUIENTE'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.Button - SIGUIENTE (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - FEMENINO'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - Ciencias sociales'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - FORMACION INTERMEDIA'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - ECUATORIANA'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - BOLIVAR'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (9)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - GUARANDA'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (10)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - GUARANDA (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Barrio'), 'EL TEJAR', 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (11)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - URBANO'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.Button - Ok'), 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Calle principal'), 'CALLE A', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Transversal'), 'CALLE B', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Nmero de casa'), '123', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Referencia ubicacin'), 'CANCHAS DE FUTBOL', 
    0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (12)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - Propia no hipotecada'), 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Valor vivienda'), '56000', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Tiempo de residencia'), '20', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Telfono convencional'), '024651897', 
    0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Telfono celular'), '0923476521', 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Email'), 'barmas@solidario.fin.ec', 
    0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (13)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - COMERCIO'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (14)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.CheckedTextView - ABARROTESTIENDAS'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.Button - SI'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.Button - Ok (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.view.View - 7'), 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.Button - OK (2)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - Monto'), '2500', 0)

Mobile.tap(findTestObject('Object Repository/Micro-app/android.widget.LinearLayout (15)'), 0)

Mobile.setText(findTestObject('Object Repository/Micro-app/android.widget.EditText - 2500'), '10000', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

