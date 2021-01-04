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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/search?sxsrf=ALeKk00HC2E0Ex4Kcf_6r8s3V1e8Osn8Cg%3A1609671990046&source=hp&ei=NqXxX65f-5Dj4Q_Yi5LwAw&iflsig=AINFCbYAAAAAX_GzRs7NkEppqO-BcEp0ctSiS-7esZLL&q=calculator&oq=cal&gs_lcp=CgZwc3ktYWIQAxgAMgcIIxDJAxAnMgsIABCxAxCRAhCLAzIICAAQkQIQiwMyCAgAEJECEIsDMggIABCxAxCLAzINCAAQsQMQFBCHAhCLAzIICC4QsQMQiwMyCAgAELEDEIsDMggIABCxAxCLAzIICAAQsQMQiwM6BAgjECc6BQgAEJECOgUIABCxAzoICAAQsQMQgwE6CggAELEDEBQQhwI6AggAOggILhDHARCjAlD6DVi_EWDUGmgAcAB4AIABhgGIAfoCkgEDMC4zmAEAoAEBqgEHZ3dzLXdpergBAQ&sclient=psy-ab')

WebUI.click(findTestObject('Object Repository/Page_calculator -  Google/div_0 (function()var adocument.getElementBy_85a72c'))

WebUI.click(findTestObject('Object Repository/Page_calculator -  Google/div_1'))

WebUI.click(findTestObject('Page_calculator -  Google/div_plus'))

WebUI.click(findTestObject('Object Repository/Page_calculator -  Google/div_2'))

WebUI.click(findTestObject('Page_calculator -  Google/div_equal'))

WebUI.verifyElementText(findTestObject('Page_calculator -  Google/div_output'), '3')

WebUI.closeBrowser()

