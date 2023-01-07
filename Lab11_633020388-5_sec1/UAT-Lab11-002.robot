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

Empty First Name
    Input Text    lastname    ${Last name} 
	Input Text    organization    ${Organization}
	Input Text    email    ${Email} 
	Input Text    phone    ${Phone No.} 
    Click Button    registerButton
	Title Should Be    Event Registration
	page should contain    Please enter your first name!!
	Close Browser
	
Open Event Registration Page
	Open Browser    ${Registration URL}    ${BROWSER}
	Set Selenium Speed    ${DELAY}
	Title Should Be    Event Registration
	
Empty Last Name
	Input Text    firstname    ${First name} 
	Input Text    organization    ${Organization}
	Input Text    email    ${Email} 
	Input Text    phone    ${Phone No.} 
    Click Button    registerButton
	Title Should Be    Event Registration
	page should contain    Please enter your last name!!
	Close Browser

Open Event Registration Page
	Open Browser    ${Registration URL}    ${BROWSER}
	Set Selenium Speed    ${DELAY}
	Title Should Be    Event Registration
	
Empty First Name and Last Name
	Input Text    organization    ${Organization}
	Input Text    email    ${Email} 
	Input Text    phone    ${Phone No.} 
    Click Button    registerButton
	Title Should Be    Event Registration
	page should contain    Please enter your name!!
	Close Browser

Open Event Registration Page
	Open Browser    ${Registration URL}    ${BROWSER}
	Set Selenium Speed    ${DELAY}
	Title Should Be    Event Registration
	
Empty Email
	Input Text    firstname    ${First name}
    Input Text    lastname    ${Last name} 
	Input Text    organization    ${Organization}
	Input Text    phone    ${Phone No.} 
    Click Button    registerButton
	Title Should Be    Event Registration
	page should contain    Please enter your email!!
	Close Browser
	
	
Open Event Registration Page
	Open Browser    ${Registration URL}    ${BROWSER}
	Set Selenium Speed    ${DELAY}
	Title Should Be    Event Registration

Empty Phone Number
	Input Text    firstname    ${First name}
    Input Text    lastname    ${Last name} 
	Input Text    organization    ${Organization}
	Input Text    email    ${Email} 
    Click Button    registerButton
	Title Should Be    Event Registration
	page should contain    Please enter your phone number!!
	Close Browser
	
Open Event Registration Page
	Open Browser    ${Registration URL}    ${BROWSER}
	Set Selenium Speed    ${DELAY}
	Title Should Be    Event Registration
	
Invalid Phone Number
	Input Text    firstname    ${First name}
    Input Text    lastname    ${Last name} 
	Input Text    organization    ${Organization}
	Input Text    email    ${Email} 
	Input Text    phone    1234
    Click Button    registerButton
	Title Should Be    Event Registration
	page should contain    Please enter a valid phone number, e.g., 081-234-5678, 081 234 5678, or 081.234.5678)
	Close Browser