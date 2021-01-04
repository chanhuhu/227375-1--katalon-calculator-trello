import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	@Keyword
	def successfully_logged_in() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://trello.com/login')

		WebUI.setText(findTestObject('Object Repository/Page_Log in to Trello/input_Log in to Trello_user'), 'luroman6@gmail.com')

		WebUI.click(findTestObject('Object Repository/Page_Log in to Trello/input_concat(Don, , t ask for codes when I _e2894b'))

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to continue - Log in with Atlas_6762ee/input_luroman6gmail.com_password'),
				'lwc0lKEDdCqit3EpNDupqQ==')

		WebUI.click(findTestObject('Object Repository/Page_Log in to continue - Log in with Atlas_6762ee/span_Log in'))
	}
}
