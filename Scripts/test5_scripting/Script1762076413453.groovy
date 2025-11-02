import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl("https://trytestingthis.netlify.app/")

WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_Username_uname'), 'testing')
	
WebUI.setEncryptedText(findTestObject('Page_Try Testing This/input_Password_pwd'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Page_Try Testing This/input_submit'))

WebUI.closeBrowser()