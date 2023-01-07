*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${SERVER}    localhost:7272
${BROWSER}    chrome
${Registration URL}    http://${SERVER}/Lab11/Registration.html
${DELAY}    0
${First name}    Somsri
${Last name}    Sodsai
${Organization}    CS KKU
${Email}    somsri@kkumail.com
${Phone No.}    081-001-1234


*** Test Cases ***
Open Event Registration Page
	Open Browser    ${Registration URL}    ${BROWSER}
	Set Selenium Speed    ${DELAY}
	Title Should Be    Event Registration

Register Success
    Input Text    firstname    ${First name}
    Input Text    lastname    ${Last name} 
	Input Text    organization    ${Organization}
	Input Text    email    ${Email} 
	Input Text    phone    ${Phone No.} 
    Click Button    registerButton
	Title Should Be    Success
	page should contain    Thank you for participating in our event
	Close Browser
	
Open Event Registration Page
	Open Browser    ${Registration URL}    ${BROWSER}
	Set Selenium Speed    ${DELAY}
	Title Should Be    Event Registration
	
Register Success No Organization Info
	Input Text    firstname    ${First name}
    Input Text    lastname    ${Last name} 
	Input Text    email    ${Email} 
	Input Text    phone    ${Phone No.} 
    Click Button    registerButton
	Title Should Be    Success
	page should contain    Thank you for participating in our event
	Close Browser