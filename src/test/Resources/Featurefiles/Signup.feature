@LoginProfie 
Feature: SignUp for shopizer application 

Background: User entering URL
	Given I opened the browser
	When i enter the URL of the application
	Then I should see the Login page of the application 
	
	
Scenario: Signup to the application with valid credentials
	When I  navigate to the signup page
	And  I enter valid personal information
	And click on 'create an account' button
	Then I should see the application should logged in.
	
	
#Scenario Outline: Signup to the application using invalid credentails	

# When I  navigate to the signup page 
# And I enter invalid  firname  "<firstaname>"
 #And I enter invalid  lastname "<lastname>"
# And I enter country value
# And I enter state value
 #And I enter Sign-in information
 #And click on 'create an account' button
 #Then Application should give error prompt on firstname,lastname fields.
 #Examples: 
		#|firstaname|lastname|
		#|TestA12|TEstssV|