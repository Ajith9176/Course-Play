@CoursePlay
Feature: End to End scenario For CoursePlay Application  

@Url
Scenario: User verify the Login Name
Given User launch the application


@TC-001_logindashboardAdmin
Scenario: User Verify the Login Name
Given User enter the emailID and Password
And User click on the login button
Then user verify the username is displayed in header

@Categories
Scenario Outline: User Create Category
Given User Click Categories module to Create Category 
And User Click action button 
And User Click Create Category button 
And User Enter Category Code "<RowNo>" 
And User Enter Category Title "<RowNo>"
And User Select Category Type and Select Category Designation "<RowNo>"
And User Select Category Description "<RowNo>"
And User Select Parent Category "<RowNo>"
And User Select Save button 
And User Click Users button to Add
And User Enter Learner in search Box "<RowNo>"
And User Click Search button to Search Leaner
And User Click Select role checkbox and Click Action Button  
And User Click Bulk Add button To add  
And User Click Courses Button 
And User Click Select Courses Checkbox "<RowNo>" and Click Action button 
And User Click Bulk Add to Courses
And User Verify the Category added 


Examples: 
|RowNo|
|1|
|2|



@Skills
Scenario Outline: User Create Multiple Skills 
Given User click Skills Button 
And User Click Action Skills button
And User Click create Skills button 
And User Enter the Skill Code "<Skills>"
And User Enter the Skill Name "<Skills>"
And User Enter the Skill description "<Skills>"
And User Enter the Skill color "<Skills>"
And User Select the Skill type "<Skills>"
And User Select the Method "<Skills>"
And User Click on The Save button 
And User Click Skill levels 
And User Click add Skills
And User Enter Level Name "<Skills>"
And User Enter Level Description "<Skills>"
And User Enter Level Magnitude "<Skills>"
And User Click Save skills
And User Click Publish Button  


Examples:
|Skills|
|1|


@Assignment
Scenario Outline: User to Add Multiple Assignment Module 
Given User Click the Module Authoring Module and Create Module Button
And User Select Assignment Module
And User Enter Module Code "<Assignment>"
And User Enter Module Name "<Assignment>"
And User Enter Module Thumbnail "<Assignment>"
And User Select Skills Button and select skills "<Assignment>" in basic details
And User Enter Module Short Description "<Assignment>"
And User Enter Module Long Description "<Assignment>"
And User Select Prompt in Question "<Assignment>"
And User Enter Instructions For Learner "<Assignment>"
And User Select Prompt in Answer "<Assignment>"
And User User Enter the Preparation Time in Answer "<Assignment>"
And User Enter Maximum User Enrollments "<Assignment>"
And User Enter Expiration Date "<Assignment>"
And User Enter Maximum Number of Attempts "<Assignment>"
And User Click Completion on Submit "<Assignment>"
And User Click Save button using assignment
And User Click Publish button "<Assignment>"


Examples:
|Assignment|
|1|
|2|
|3|



@Event
Scenario Outline: User To add new Event Module
Given Click on the module authoring and select the Create Module
And User Click Event button
And User Enter the module Code "<Event>"
And User Enter Module Title "<Event>"
And User Enter the Module thumbnail "<Event>" and Downloadable Media "<Event>"
And User Enter Module Short Description "<Event>" and Long Description "<Event>" 
And User Search Skills and search Skills "<Event>"
And User Enter Maximum user enrollments "<Event>"
And User Enter Expiration Date "<Event>" and select no scorable module "<Event>"
And User Enter Maximum number of attempts "<Event>"
And User Click Save button to add Event 
And User Click Sessions Module and Add Event Session button 
And User Enter Session Code "<Event>"
And User Enter Session Title "<Event>"
And User Enter Session Start Date "<Event>"
And User Enter Session End Date "<Event>"
And User Enter From time "<Event>"
And User Enter To time "<Event>"
And User Enter Google Map URL "<Event>"
And User Enter Maximum User Capacity "<Event>"
And User Select Upload Support Sheet "<Event>" and upload attendance
And User Select Instructor and click Instructor "<Event>"
And User Enter Event Location "<Event>"
And User Click Save Button to Add Session
And User click on the publish Button 
And User Click on Attendance and Upload attendance sheet   
And User click on save Button to add Attendance sheet 
And User click on save and Load "<Event>"
And User Publish the module "<Event>"

Examples:
|Event|
|1|


@SlideShow
Scenario Outline: User To Add new Slideshow Multiple
Given User Click Module Authoring module and Create Module Button 
And User Click Slideshow module Button
And User Enter Module code "<SlideShow>" 
And User Enter Module name "<SlideShow>"
And User Upload Module thumbnail "<SlideShow>"
And User Enter Downloadable Media "<SlideShow>"
And User Select transition type "<SlideShow>"
And User Select page orientation mode "<SlideShow>"
And User click on Choose a file and upload "<SlideShow>"
And User Enter Module Short description "<SlideShow>"
And User Enter Module Long description "<SlideShow>"
And User Select Skills Button and select Skills "<SlideShow>"
And User Enter Maximum User enrollments "<SlideShow>"
And User Enter Expiration date "<SlideShow>"
And User Enter the Timer Setting "<SlideShow>"
And User Enter Maximum Number of attempts "<SlideShow>"
And User Click save button for slideShow
And User Click Save and Publish button "<SlideShow>"

Examples:
|SlideShow|
|1|


@Scrom
Scenario Outline: User Add new Module SCROM
Given User Click on the Module Authoring and click Create Button 
And User Select Scorm Module 
And User Enter the Module Code "<Scorm>"
And User Enter the Module Title "<Scorm>"
And User Select Module Thumbnail and upload "<Scorm>"
And User Click Upload SCROM and Upload "<Scorm>"
And User Enter the Module Short description "<Scorm>"
And User Enter the Module Long description "<Scorm>"
And User Select Skills and select skill "<Scorm>"
And User Enter the Maximum User enrollments "<Scorm>"
And User Enter the Expiration date "<Scorm>"
And User Enter the Maximum Number of Attempts "<Scorm>" 
And User Click save button and verify Scorm
And User Click Save and Publish "<Scorm>"


Examples:
|Scorm|
|1|



@Text
Scenario Outline: User Add new module text
Given user Click on module Authoring module and Click create module button
And user select Text Module
And user Enter Module Code"<Text>" And Module Title "<Text>" in Basic details
And user Select Module Thumbnail "<Text>" and upload for module text "<Text>" in Basic details
And user Enter Module Short Description "<Text>" and Module Long Description "<Text>" in Basic details
And user Select Audio "<Text>" in Basic details
And user Enter Module Content "<Text>" and Click Skills to select Skill "<Text>" in Basic details 
And user Enter Maximum User Enrollments "<Text>" and Expiration Date "<Text>" for Advance settings in Basic details
And user Enter Maximum Number of Attempts "<Text>" and Minimum Time Limit "<Text>" for Advance settings in Basic details
And user click Save button and verify the module
And user click Save and Publish button "<Text>" and accept the popup

Examples:
|Text|
|1|


@Video
Scenario Outline:  User Create new module video
Given user click on module Authoring and create module button to create video Module
And user select video
And user Enter Module Code "<Video>" And  Module Title "<Video>" in basic details for Video module
And user Select Module Thumbnail "<Video>" and upload for module text "<Video>" in basic details for video module
And user Select video content "<Video>" in basic details
And user Enter Module Short Description "<Video>" and Long Description "<Video>" in basic details for video module
And user Click Skills to Select Skill "<Video>" in Basic Details 
And user Enter Maximum User Enrollments "<Video>" and Expiration Date "<Video>" for Advance settings in basic details for video module
And user Enter Maximum Number of Attempts "<Video>" and Time Limit "<Video>" for Advance settings in basic details for video module
And user select Allow Offline Access on Mobile and Enter Number of days "<Video>"
And user click Save button for video module
And user click Save and publish Button "<Video>"

Examples:
|Video|
|1|


@WebContent
Scenario Outline: User Create new module Webcontent
Given User click on module Authoring and create module button to create Webcontent
And User select Web content
And User Enter Module Code "<WebContent>" And Module Title "<WebContent>" in basic details for Webcontent module
And User Select Module Thumbnail "<WebContent>" and upload "<WebContent>" in basic details for Webcontent module
And User Enter Module Short Description "<WebContent>" and Module Long Description "<WebContent>" in basic details for Webcontent module
And User enter webcontent "<WebContent>" in basic details 
And User Click Skills to select Skill "<WebContent>" for Webcontent module 
And User Enter Maximum User Enrollments "<WebContent>" and Expiration Date "<WebContent>" in Advance settings for Webcontent module
And User Enter Maximum Number of Attempts "<WebContent>" and  Minimum Time Limit "<WebContent>" in Advance settings for Webcontent module
And User click Save button for Webcontent module
And User click Save and Publish button "<WebContent>" for Webcontent module

Examples:
|WebContent|
|1|

@Image
Scenario Outline: User Create new module for image
Given user click on module Authoring and create module button to create image module
And user select image
And user Enter Module Code "<Image>" And Module Title "<Image>" in basic details for Image module
And user Select Module Thumbnail "<Image>" and upload "<Image>" for module text in basic details for Image module
And user Enter Module Short Description "<Image>" and Module Long Description "<Image>" in basic details for Image module
And user Select image "<Image>" in basic details 
And user Click Skills to select Skill "<Image>" in basic details for Image module
And user Enter Maximum User Enrollments "<Image>" and Expiration Date "<Image>" for Advance settings in basic details for Image module
And user Enter Maximum Number of Attempts "<Image>" and Minimum Time Limit "<Image>" for Advance settings in basic details for Image module
And user click Save button for Image module
And user click Save and Publish button "<Image>" for Image module

Examples:
|Image|
|1|

@Webinar
Scenario Outline: User Create new module Webinar and new session
Given User click on Module Authoring and create module button to create Webinar
And User select webinar
And User enter Module Code "<Webinar>" And Module Title "<Webinar>" in basic details for Webinar module
And user select Module Thumbnail "<Webinar>" and upload media "<Webinar>"  in basic details for Webinar module
And user enter Module Short Description "<Webinar>" and Long Description "<Webinar>" in basic details for Webinar module
And user click Skills to select Skill "<Webinar>" for Webinar module 
And user enter Maximum User Enrollments "<Webinar>" and Expiration Date "<Webinar>" in Advance settings for Webinar module
And user enter Maximum Number of Attempts "<Webinar>" and click on non scorable module "<Webinar>" for Webinar module
And User click Save Button for Webinar module
And user click session tab button
And user click Add webinar button
And user Enter Session code "<Webinar>" And Session title "<Webinar>" in Session details 
And user enter Start date "<Webinar>" and end date "<Webinar>" in Session details 
And user enter from "<Webinar>" and To "<Webinar>" in session details
And user enter webinar url "<Webinar>" in session details
And user enter maximum user "<Webinar>" and webinar guidelines
And user enter instructor "<Webinar>" in session details
And user click on save button in session details
And User click Save and Publish button for session module "<Webinar>"


Examples:
|Webinar|
|1|



@TC-001_Categories
Scenario: User Create Category using Designation type
Given User Click Categories Module using Designation
And User Click Action button using Designation
And User Click Create Category button using Designation
And User Enter Category Code using Designation
And User Enter Category Title using Designation
And User Select Category Type and Select Category Designation
And User Select Category Description using Designation
And User Select Parent Category using Designation
And User Select Save button using Designation
And User Click Users button using Designation
And User Enter Learner in search Box using Designation
And User Click Search button using Designation
And User Click Select role checkbox and Click Action button using Designation
And User Click Bulk Add button using Designation 
And User Click Courses button using Designation
And User Click Select Courses checkbox and Click Action button using Designation
And User Click Bulk Add using Designation
And User Verify the Category using Designation

@TC-002_Categories
Scenario: User Create Category using Batch Type
Given User click Categories Module using Batch
And User click Action button using Batch
And User click Create Category button using Batch
And User enter Category Code using Batch
And User enter Category Title using Batch
And User select Category Type and Select Category Batch
And User select Category Description using Batch
And User select Parent Category using Batch
And User select Save button using Batch
And User click Users button using Batch
And User enter Learner in search Box using Batch
And User click Search button using Batch
And User click Select role checkbox and Click Action button
And User click Bulk Add button using Batch
And User click Courses button using Batch
And User click Select Courses checkbox and Click Action button using Batch
And User click Bulk Add using Batch
And User verify the Category using Batch

@TC-003_Categories
Scenario: User Create Category Using Others Type
Given User click Categories Module using Others
And User click Action button using Others 
And User click Create Category button using Others 
And User enter Category Code using Others 
And User enter Category Title using Others
And User select Category Type and Select Category Others
And User select Category Description using Others
And User select Parent Category using Others
And User select Save button using Others
And User click Users button using Others
And User enter Learner in search Box using Others
And User click Search button using Others
And User click Select role checkbox and Click Action button using Others
And User click Bulk Add button using Others
And User click Courses button using Others
And User click Select Courses checkbox and Click Action button using Others
And User click Bulk Add using Others
And User Verify the Category using Others

@TC-004_Categories
Scenario: User Create Category Using Level Type
Given User click Categories Module using Level
And User click Action button using Level 
And User click Create Category button using Level 
And User enter Category Code using Level 
And User enter Category Title using Level
And User select Category Type and Select Category Level
And User select Category Description using Level
And User select Parent Category using Level
And User select Save button using Level
And User click Users button using Level
And User enter Learner in search Box using Level
And User click Search button using Level
And User click Select role checkbox and Click Action button using Level
And User click Bulk Add button using Level
And User click Courses button using Level
And User click Select Courses checkbox and Click Action button using Level
And User click Bulk Add using Level
And User Verify the Category using Level

@TC-005_Categories
Scenario: User Create Category Using Division Type
Given User click Categories Module using Division
And User click Action button using Division 
And User click Create Category button using Division 
And User enter Category Code using Division 
And User enter Category Title using Division
And User select Category Type and Select Category Division
And User select Category Description using Division
And User select Parent Category using Division
And User select Save button using Division
And User click Users button using Division
And User enter Learner in search Box using Division
And User click Search button using Division
And User click Select role checkbox and Click Action button using Division
And User click Bulk Add button using Division
And User click Courses button using Division
And User click Select Courses checkbox and Click Action button using Division
And User click Bulk Add using Division
And User Verify the Category using Division

@TC-006_Categories
Scenario: User Create Category Using Department Type
Given User click Categories Module using Department
And User click Action button using Department 
And User click Create Category button using Department 
And User enter Category Code using Department 
And User enter Category Title using Department
And User select Category Type and Select Category Department
And User select Category Description using Department
And User select Parent Category using Department
And User select Save button using Department
And User click Users button using Department
And User enter Learner in search Box using Department
And User click Search button using Department
And User click Select role checkbox and Click Action button using Department
And User click Bulk Add button using Department
And User click Courses button using Department
And User click Select Courses checkbox and Click Action button using Department
And User click Bulk Add using Department
And User Verify the Category using Department

@TC-007_Categories
Scenario: User Create Category Using Location Type
Given User click Categories Module using Location
And User click Action button using Location 
And User click Create Category button using Location 
And User enter Category Code using Location 
And User enter Category Title using Location
And User select Category Type and Select Category Location
And User select Category Description using Location
And User select Parent Category using Location
And User select Save button using Location
And User click Users button using Location
And User enter Learner in search Box using Location
And User click Search button using Location
And User click Select role checkbox and Click Action button using Location
And User click Bulk Add button using Location
And User click Courses button using Location
And User click Select Courses checkbox and Click Action button using Location
And User click Bulk Add using Location
And User Verify the Category using Location


@TC-008_Categories
Scenario: User Create Category using Import
Given User Click Categories Module 
And User Click Action button
And User Click Import button
And User Click Choose a file 
And User Select File
And User Click Submit button
And User Click Close 
And User Click Course edit 
And User Click Users button
And User Enter Learner in search Box
And User Click Search button
And User Click Select role checkbox and Click Action button
And User Click Bulk Add button  
And User Click Courses button
And User Click Select Courses checkbox and Click Action button
And User Click Bulk Add 
And User Verify the Category

@TC-009_Categories
Scenario: User Check if already exisiting Category Name is Accepting or not
Given User Click Categories module
And User Click Action Button
And User Click Create Category 
And User Enter Category Code Already exisiting one
And User Enter Category Name Already existing one 
And User Select Designation
And User Verify Category Name already exists 

@TC-010_Categories 
Scenario: User Delete the Maths Categories
Given User click Categories Module
And User Enter Maths in Search box
And User Delete the category 
And User wait for the Page load


@TC-011_Categories
Scenario: User check the reset button
Given User click categories 
And User click select categories
And User select Business studies 
And User click go button
And User click the Reset button

  

@TC-001_Users
Scenario: User Create a New User
Given User click on the Users Module
And User verify the User role and Status
And User Click on the Action button 
And User Click on the Create User button
And User Enter the Basic details
And User Enter the First Name
And User Enter the Last Name Mandatory
And User Enter the Email Mandatory
And User Enter the Contact No
And User Enter the Address line one
And User Enter the Address line two
And User Enter the City 
And User Enter the State
And User Select the Country India
And User Enter the Pincode
And User Select the Date of Birth
And User Enter the User Code
And User Select the Country Code
And User Enter the Mobile Number
And User Select the Role click on select role 
And User Enter the Biography 
And User Enter the Joining Date
And User Enter the User Settings
And User Select Allow to Edit profile
And User Select Allow to Change Password
And User Force User to Change Password
And User Select Suspend User
And User Select the Send Emails
And User Select the Language
And User Enter the User Advanced Settings
And User Enter the User expiration Date or Number of Days 
And User Click Save button
And User Added Successfully

@TC-002_Users
Scenario: User Check if already existing Email is accepted or not while creating new user
Given User Click on the Action Button in User 
And User Click on the Create User button in User
And User Click Enter the Basic Details 
And User Enter the First name in Create user
And User Enter the Last name in Create user
And User Enter the Email Id already Existing 
And User select the role and select role
And User Click save button in create user
And User Verify the Email is already using by other user in the Application




@TC-014_Users
Scenario: User to Add Learner and Course Author using Import
Given User click on the Action Button 
And User Select Import option
And User import the file 
And User Enter the Password 
And User Submit Import
And User verify the Added users
And User Search the Learner in Search Box
And User Edit the Profile 
And User Enter the Address line one and Two
And User Enter the City,State and Pincode
And User Enter the DOB
And User Enter the Biography
And User Click the Save button 
And User verify User Edited Successfully
And User Click Settings button
And User Select Designation in Categories Settings
And User Select Learner in Categories Settings
And User Click save button in Settings
And User Verify User Edited Successfully
And User click Goals
And User Select Automation and general in goals
And User click action goals
And User click Bulk Assign goals
And User Verify Goal assigned to courses successfully


@TC-015_Users
Scenario: User to Check if  already existing Email Id Import	
Given User Click on the User Module 
And User Click on Action Button
And User select the Import 
And User Enter the Import File
And User Enter the Admin Password
And User Click Submit button
And User verify No Users were Added 
And User Close the Import Option




@TC-001_Skills
Scenario: User Create new Skills using Behavioural Type 
Given User Click Skills button using Behavioural 
And User Click Action Skills button using Behavioural
And User Click Create Skills button using Behavioural
And User Enter the Skill Code using Behavioural
And User Enter the Skill Name using Behavioural
And User Enter the Skill Description using Behavioural
And User Enter the Skill Color using Behavioural
And User Select the Skill Type using Behavioural
And User Select the Behavioural
And User Click Save using Behavioural
And User Click Skill Levels using Behavioural
And User Click Add Skills using Behavioural
And User Enter Level Name using Behavioural 
And User Enter Level Description using Behavioural
And User Enter Level Magnitude using Behavioural
And User Click Save Skills
And User Click Publish using Behavioural
And User Click PopUp using Behavioural

@TC-002_Skills
Scenario: User Create New Skills using Functional
Given User Click Skills button using Functional 
And User Click Action Skills button using Functional
And User Click Create Skills button using Functional
And User Enter the Skill Code using Functional
And User Enter the Skill Name using Functional
And User Enter the Skill Description using Functional
And User Enter the Skill Color using Functional
And User Select the Skill Type using Functional
And User Select the type using Functional
And User Click Save using Functional
And User Click Skill Levels using Functional
And User Click Add Skills using Functional
And User Enter Level Name using Functional 
And User Enter Level Description using Functional
And User Enter Level Magnitude using Functional
And User Click Save using Skills
And User Click Publish using Functional
And User Click PopUp using Functional

@TC-003_Skills
Scenario: User Create New Skills using Process 
Given User Click Skills button using Process 
And User Click Action Skills button using Process
And User Click Create Skills button using Process
And User Enter the Skill Code using Process
And User Enter the Skill Name using Process
And User Enter the Skill Description using Process
And User Enter the Skill Color using Process
And User Select the Skill Type using Process
And User Select the type as process
And User Click Save using Process
And User Click Skill Levels using Process
And User Click Add Skills using Process
And User Enter Level Name using Process 
And User Enter Level Description using Process
And User Enter Level Magnitude using Process
And User Click Save using skills
And User Click Publish using Process
And User Click PopUp using Process

@TC-004_Skills
Scenario: User Create New Skills using Technical
Given User Click Skills button using Technical 
And User Click Action Skills button using Technical
And User Click Create Skills button using Technical
And User Enter the Skill Code using Technical
And User Enter the Skill Name using Technical
And User Enter the Skill Description using Technical
And User Enter the Skill Color using Technical
And User Select the Skill Type using Technical
And User Select the Technical using Technical
And User Click Save using Technical
And User Click Skill Levels using Technical
And User Click Add Skills using Technical
And User Enter Level Name using Technical 
And User Enter Level Description using Technical
And User Enter Level Magnitude using Technical
And User Click Save using in Skills
And User Click Publish using Technical
And User Click PopUp using Technical

@TC-005_Skills
Scenario: User Verify the already existing code and name is accepting or not
Given User Click Skills button 
And User Click Action button Skills
And User Click Create Skills button
And User Enter the Skill Code already exisiting Credentials
And User Enter the Skill Name already exisiting Credentials 
And User Enter the Skill Description
And User Enter the Skill Color
And User Select the Skill Type
And User Select the Behavioual
And User Click Save using Exisitng Credentials
And User Verify Skill Code and Skill name Already exists

@TC-006_Skills
Scenario: User Create New Skills using Import
Given User Click Skills Module
And User Click Action button to Import
And User Click Import button Skills
And User Click Choose a file Using Import skills
And User Select File in folder
And User Click Submit button to add skills
And User Click Close and Add
And User Select Skill Edit 
And User Click Skill Levels
And User Click Add Skills
And User  Enter Level Name
And User  Enter Level Description
And User  Enter Level Magnitude
And User Click Save
And User Click Publish
And User Click PopUp


@TC-007_Skills
Scenario: User to Add Competency Group
And User Click Skills button using Competency Group
And User Click Manage Competency Groups
And User Click Action Button using Competency 
And User Click Create Competency Groups
And User Enter Competency Group Code
And User Enter Competency Group Name
And User Enter Competency Group Description
And User Click Save button using competency
And User Click Skill List

@TC-008_Skills
Scenario: User Clone Skills
Given Click Skills button
And User Click Search Skills
And User Click Clone Button
And User Verify Clone added Successfully

@TC-009_Skills
Scenario: User Make Competency Groups
Given User Click Skills button using competency
And User Click Entries
And User Select Twenty Entries 
And User Click Competency Groups
And User Select Competency Groups Checkbox
And User Click Go






@TC-001_Assignment
Scenario: User to Add new Assignment Module 
Given User Click the Module Authoring Module
And User Click the Create Module Button
And User Click Assignment Button
And User Enter Module Code using Assignment
And User Enter Module Name using Assignment
And User Enter Module Thumbnail using Assignment
And User Select Skills Button and select skills in basic details
And User Enter Module Short Description using Assignment
And User Enter Module Long Description using Assignment
And User Select Prompt in Question
And User Enter Instructions For Learner 
And User Select Prompt in Answer
And User Enter Maximum User Enrollments using Assignment
And User Enter Expiration Date 
And User Enter Maximum Number of Attempts 
And User Click Completion on Submit 
And User Click Save button using Assignment
And User Click Publish button 


@TC-002_Assignment
Scenario: Create new module Assignment without filling basic details
Given User Click on create module button
And User Click assignment button
And Click Save button
And Verify the Module code and Module Title can not be empty
And Verify the Module short and Module Long Description can not be empty 


@TC-003_Assignment
Scenario: Create new module Assignment with special Characters
Given Click on module authoring
And Click on create module button
And Click assignment button
And Enter special character values in Module Code field in basic details 
And Enter special character values in Module Title field as blank in basic details
And Select Skills Button and select skills in basic details 
And Add more than Hundered character values in Module Short Description field
And Add more than Thousand character values Module Long Description field 
And Select Prompt in Question
And Select Learner Will Upload Media in Answer
And Enter the Preparation Time in Answer 
And Enter special character values in Maximum User Enrollments in Advance Settings 
And Enter Expiration Date in Advance settings 
And Enter special character values in Maximum Number of Attempts in Advance settings 
And Click Completion on Submit in Advance settings 
And Click Save button and showing Error
And Verify the Module code and Module Title as special character
And Verify the Special Character displayed in the fields

@TC-004_Assignment
Scenario: Create new module Assignment without Publish
Given Click on Module authoring
And User Click on Create module button
And User Click Assignment button
And User Enter Module Code and Module Name
And User Enter the Module Thumbnail
And User Select Skills Button and select skills 
And User Enter Module Short Description
And User Enter Module Long Description
And User Select Prompt in question
And User Enter Instructions For learner 
And User Select Prompt in answer  
And User Enter Maximum User Enrollments in advance Settings 
And User Enter Expiration date in Advance settings 
And User Enter Maximum Number of attempts in Advance settings 
And User Click Completion on Submit in Advance settings 
And User Click Save button without publish
And User No Click on Save & Publish button

@TC-005_Assignment
Scenario: Create new module Assignment with Invalid Module Thumbnail
Given User Click on module authoring
And User Click on Create module
And User Enter Module Code with SPACE in basic details 
And User Enter values in Module Name in basic details 
And User Select and upload Module Thumbnail in basic details  
And User Verify the Module Thumbnail is invalid


@TC-006_Assignment
Scenario: User Verify the Preview Button
Given User Click on Module Authoring and Click Search Box
And User Enter the Assignment Module Code in search Box
And User Click on preview button to view module details
And User Click Back to Module


@TC-007_Assignment
Scenario: User Verify the Edit Button
Given User Click on Module Authoring and Click search Box
And User Enter the Assignment Module Code in Search Box
And User Click on Edit button to view module details
And User Click Grading Button


@TC-008_Assignment
Scenario: User delete the Unpublished module
Given Click on Module Authoring
And Enter the Assignment Module Code in search Box
And Click on Delete button to view module details
And Click pop to Delete the Module 

@TC-009_Assignment
Scenario: User delete the published module
Given Click on Module authoring button
And Enter the Assignment Module Code in searchBox
And Click on Delete button 
And Click delete the module
And Click to Unpublish the Module 
And Click on Edit button
And Click on Unpublish Button 
And Click on Module Button
And Search the Module and Click the Delete button
And Click popup to delete the Module


@TC-001_Event 
Scenario: User To add new Event Module
Given Click on the module Authoring and select the Create Module
And User Click Event Button
And User Enter Module Code in Event module
And User Enter Module Title in Event Module
And User Enter the Module thumbnail and Downloadable Media
And User Enter Module Short Description and Long Description in Event module
And User Search Skills and select Skills
And User Enter Maximum User Enrollments
And User Enter Expiration Date and select no scorable module 
And User Enter Maximum Number of attempts 
And User Click Save button to add event 
And User Click Sessions Module
And User Click Add Event Session button
And User Enter  Session Code in Add event session
And User Enter Session Title in Add event session
And User Enter Session Start Date 
And User Enter Session End Date
And User Enter From time in Add event session
And User Enter To time in Add event session
And User Enter Google Map URL
And User Enter Maximum User Capacity
And User Select Upload Support Sheet and upload attendance
And User Select Instructor and click Instructor
And User Enter Event Location
And User Click Save Button to add session
And User click on the publish button 
And User Click on Attendance 
And User Select the Upload attendance sheet
And User Upload the attendance sheet
And User click on save Button to add attendance sheet 
And User click on save and load
And User Publish the module

 @TC-002_Event
Scenario: User To Add new Event Module without adding basic details
Given User Click Module authoring and click Create Module button
And User Click Event Module 
And User Click Save button without filling Event Module
And User Verify the Module Code and Name is required in Event Module
And User the Short and Long Description is required in Event Module


 @TC-003_Event
Scenario: User to add Special characters in Event Module
Given Click on the module Authoring and select Create Module
And User Click Event Button in Module
And User Enter Module Code as Special Character
And User Enter Module Title as Special Character
And User Enter Module Short Description and Long Description
And User Enter Maximum User Enrollments and Maximum number of attempts as special character 
And User Click Save button and verify the Module
And User verify Module code and title cannot have symbols
And User verify maximum user enrollment and max no of attempts should have always Numeric value

 @TC-004_Event
Scenario: User add Event module with empty Session Details
Given Click on the Module Authoring and select the Create Module
And User Click Event Button and add basic details
And User Enter Module Code and Module Title 
And User Enter the Module thumbnail and Downloadable Media in Event Module
And User Enter Module Short Description and Long description in Event module
And User Search Skills and select skills
And User Enter Maximum User Enrollments and Expiration Date
And User Enter Maximum Number of attempts and select no scorable module   
And User Click Save button to add basic details 
And User Click Sessions Module and click add event session
And User click on save button without adding session details
And User Verify the session code and session title cannot be empty
And User Verify the Google Url and Instructor as enter the value

@TC-005_Event
Scenario: User add Event module with Special characters in session Details
Given Click on the Module Authoring and Select the Create Module
And User Click Event Button and add basic Details
And User Enter Module Code and module Title 
And User Enter the Module thumbnail and downloadable Media in Event Module
And User Enter Module Short Description and Long Description in Event Module
And User Search Skills and select skills to add
And User Enter Maximum User Enrollments and expiration Date
And User Enter Maximum Number of attempts and Select no scorable module   
And User Click Save button to Add basic details 
And User Click Sessions Module and click add event Session
And User Enter session code and Session title as Special characters
And User Enter Google Url as Special Characters 
And User click on save button without Adding session details
And User Verify the session code and session title as only have alphabets numbers and hyphens
And User Verify the Google Url as invalid url 

@TC-006_Event
Scenario: User To add new session in Pubilshed module 
Given User Click on Module Authoring 
And User Search the Event module in search box
And User Click on the Edit Button 
And User Click Session tab 
And User Click on Add event session
And User Enter the Session Code and session title 
And User Enter the Session Start Date and End Date
And User Enter the From and To time
And User Enter the Google Url 
And User Enter the Maximum User Capacity
And User Upload the Upload Support sheet
And User Select the instructor and Search the instructor to add
And User Enter the Event location 
And User Click on Save button 
And User Click on Save and publish button 
And User Click on Attendance tab
And User Click on Upload Attendance Tab and download the template 
And User Upload the Attendance sheet 
And User Click on save button 
And User Click on Save and lock Button  
 
 
@TC-007_Event 
Scenario: User Adding Different Instructor in the Session Module
Given User Click on Module authoring 
And User Search the Event Module in search box
And User Click on the edit Button 
And User Click Session tab in Event Module
And User Click on Add event session to add
And User Enter the Session Code and session title in basic details
And User Enter the Session Start Date and End Date in basic details
And User Enter the From and To time in basic details 
And User Enter the Google Url in basic details
And User Enter the Maximum User Capacity in basic details
And User Upload the Upload Support Sheet 
And User Select the instructor  and Search the Instructor to add different Instructor
And User Enter the Event location in basic details 
And User Click on Save button and verify the session 
And User Verify User are not authorized to access the session  


@TC-008_Event
Scenario: To verify the Already session Module is locked and loaded
Given User Click on module Authoring 
And User Search the Event module in search box and edit 
And User Click Session Tab 
And User Search the Session and click on Edit button 
And User Click on Unpublish the Module
And User Click on the save button
And User Verify the Locked and loaded! The session has been saved
And User Click on Save and publish button to publish 

@TC-009_Event
Scenario: Enter the inValid Session date
Given User click on Module Authoring 
And User Search the Event module in search box and click edit
And User Click Session tab and click add event session
And User Enter the Session Code and session title basic details
And User Enter the Session Start Date as old date and End Date basic details
And User Enter the From and To time basic details
And User Enter the Google Url basic details
And User Enter the Maximum User Capacity basic details
And User Upload the Upload Support sheet basic details
And User Select the instructor  and Search the Instructor basic details
And User Enter the Event location basic details
And User Click on Save button basic details
And User Verify the date is invalid 

@TC-010_Event
Scenario: User Delete the Published Session
Given user click on module Authoring 
And User Search the event module in search box
And User Click On the Edit Button 
And User Click session tab  
And User search the Session in Search box
And User Click on the Unpublished button 
And User Search the session and Click on the Delete Button
And User click on the pop up to delete the Session

@TC-011_Event
Scenario: User Delete the UnPublished Session
Given user Click On Module Authoring 
And User search the event module in search box
And User click on the Edit Button 
And User click Session tab  
And User Search the Session in Search box
And User Click on the delete Button
And User click on the Pop up to delete the Session

@TC-012_Event
Scenario: Upload the wrong format in Attendance Tab
Given click On module authoring 
And User search the Event module in search box
And User click on the Edit button 
And User click session tab 
And User Click on add event session
And User Enter the Session Code and Session title 
And User Enter the Session Start Date and end Date
And User Enter the From and To Time
And User Enter the Google url 
And User Enter the Maximum User capacity
And User Upload the Upload support sheet
And User Select the instructor and Search the Instructor to add
And User Enter the event location 
And User Click on Save button and Save and Publish 
And User Click on attendance tab
And User Click on Upload Attendance Tab 
And User Upload the Attendance sheet as different format
And User No Users were added

@TC-013_Event
Scenario: Upload the Empty Excel in Attendance Tab
Given Click on Module Authoring and Search the event
And User Click on the edit button 
And user click session Tab 
And User Click On Add event session
And User Enter the session Code and session title
And User Enter the session Start Date and End Date
And User Enter the from and To time
And User Enter the google Url 
And User Enter the maximum User Capacity
And User upload the Upload Support sheet
And User select the instructor  and Search the Instructor to add
And User enter the Event location 
And User click on Save button and Click save and publish  
And User Click on Attendance tab and Upload Attendance Tab  
And User Upload the Attendance sheet as Empty Sheet
And User No Users were added in the sheet

@TC-014_Event
Scenario: User Preview the  Event Module
Given User click on the Module Authoring
And User Enter the event Module Code in search Box
And User Click on preview button to view Module details
And User Click back to Module

@TC-015_Event
Scenario: Delete the Unpublished Event Module
Given User Click on the module Authoring
And User Enter the Event Module Code in search Box
And User Click on Delete button to view module details
And User Click pop to Delete the Module


@TC-001_Quiz
Scenario: User To Add new Module Quiz using One word
Given User Click Module Authoring and Quiz Button
And User Enter Module Code
And User Enter Module Title
And USer Enter module thumbnail and downloadable media
And User Enter Module short description and long description
And User Enter How many Questions to Ask in basic details
And User Enter Pass Percentage in basic details
And User Enter Quiz Duration in basic details
And User Select skills and Select skill 
And User Enter Maximum User Enrollments and Expiration Date in Basic details
And User Select any Checkbox 
And User Select Question Navigation 
And User Enter Maximum Number of Attempts in Quiz Progression
And User Click Save button and proceed
And User Click Questions button
And User Select Add Questions and select One word/Short
And User Enter Questions in Add Question
And User Enter Correct Answer in Add Question
And User Enter Question Description in Add Question
And User Enter Correct Answer Description in Add Question
And User Select choose a file and upload image
And User Click Author Difficulty Rating 
And User Click Save button to Oneword
And User Click Save and Publish Quiz module

@TC-002_Quiz
Scenario: User To Add new Module Quiz using Multiple Choice 
Given User Click Module authoring and Quiz Button
And User Enter Module Code and Module title 
And USer Enter module thumbnail and Downloadable media
And User Enter Module Short description and long description
And User Enter How many Questions to ask in basic details
And User Enter Pass percentage in basic details
And User Enter Quiz duration in basic details
And user Select skills and Search skill 
And User Enter Maximum User Enrollments and Expiration date in Basic details
And User Select any checkbox 
And User Select Question navigation 
And User Enter Maximum Number of Attempts in Quiz progression
And User Click Save button and Proceed
And User Click Questions Button
And User select add questions and select Multiple choice
And User Enter Questions in add Question
And User Enter Answer option and pick the Correct option in Add Question
And User Enter Question description in Add Question
And User Enter Correct Answer description in Add Question
And User Select choose a file and Upload image
And User Click Author Difficulty rating 
And User Click Save button to Multiple choice
And User Click Save and Publish Quiz Module


@TC-003_Quiz
Scenario: User To Add new Module Quiz using import questions
Given User Click  Module Authoring and Quiz Button
And User Enter Module Code
And User Enter Module Title
And USer Enter module thumbnail and downloadable media
And User Enter Module short description and long description
And User Enter How many Questions to Ask in basic details
And User Enter Pass Percentage in basic details
And User Enter Quiz Duration in basic details
And User Select skills and Select skill 
And User Enter Maximum User Enrollments and Expiration Date in Basic details
And User Select any Checkbox 
And User Select Question Navigation 
And User Enter Maximum Number of Attempts in Quiz Progression
And User Click Save button and proceed
And User Click Questions button
And User select add questions and select Multiple choice
And User Enter Questions in Add Question
And User Enter Correct Answer in Add Question
And User Enter Question Description in Add Question
And User Enter Correct Answer Description in Add Question
And User Select choose a file and upload image
And User Click Author Difficulty Rating 
And User Click Save button to Oneword
And User Click Save and Publish Quiz module


@TC-004_Quiz
Scenario: User verify the Empty Details
Given User Click Module Authoring Module and Create Module Button
And User Click Quiz Button
And User Click on the Save button
And User verify the Module code and title as Empty 
And User Verify the Short description and Long Description is empty 
And User verify the Question ask and Pass percentage and Quiz Duration is empty

@TC-005_Quiz
Scenario: User verify the Special Characters
Given User Click Module Authoring Module and Create module Button
And User Click Quiz button
And User Enter Special Characters to the mandatory fields
And User Click on the save button to verify 
And User verify the Question ask and Pass percentage and Quiz Duration has valid values

@TC-006_Quiz
Scenario: User To Add new Module Quiz without adding oneword and multiple choice
Given User Click  Module Authoring and Quiz Button
And User Enter Module Code
And User Enter Module Title
And USer Enter module thumbnail and downloadable media
And User Enter Module short description and long description
And User Enter How many Questions to Ask in basic details
And User Enter Pass Percentage in basic details
And User Enter Quiz Duration in basic details
And User Select skills and Select skill 
And User Enter Maximum User Enrollments and Expiration Date in Basic details
And User Select any Checkbox 
And User Select Question Navigation 
And User Enter Maximum Number of Attempts in Quiz Progression
And User Click Save button and proceed
And User Click Questions button
And User select add questions and select one word
And User click on save button without adding basic details
And User Verify the Mandatory fields
And User select add questions and select multiple choice
And User click on save button without adding basic details
And User Verify the Mandatory fields


 


@TC-001_SS
Scenario: User To Add new Module Slideshow
Given User Click Module Authoring module
And User Click Create Module Button to select 
And User Click Slideshow Module Button
And User Enter Module code and Module Name
And User Upload Module thumbnail and Downloadable Media
And User Select transition type
And User Select page orientation mode
And User click on Choose a file and upload
And User Enter Module Short description
And User Enter Module Long description 
And User Select Skills Button and select Skills 
And User Enter Maximum User enrollments in Advance settings
And User Enter Expiration date in advance settings
And User Enter the Timer Setting
And User Enter Maximum Number of attempts in Advance Settings
And User Click save button for slideshow
And User Click Save and Publish button



@TC-002_SS
Scenario: User To Add new Module Slideshow without adding basic details
Given User Click Module authoring module
And User Click Create module Button
And User Click Slideshow Module button
And User Click Save button without filling basic details
And User Verify the Module Code and Name is required
And User the Short and Long Description is required


@TC-003_SS
Scenario: User verify the Special Characters is invalid
Given User click Module Authoring Module
And User Click Create Module and select Slideshow Module
And User Enter special character values in Module Code basic details
And User Enter special character values in Module Title basic details
And User Selected transition type
And User Selected page orientation mode
And User selected zip file in Choose a file and uploaded
And User Enter more than one fifty  character values in Module Short Description basic details
And User Enter more than Thousand character values in Module Long Description basic details
And User Enter special character values in Maximum User Enrollments Advance settings
And User Enter Expiration Date in advance settings
And User Enter special character values in Maximum Number of Attempts Advance Settings
And User Click Save button and verify 
And User verify the cannot have Special character in module code and title	
And User verify the cannot have Special character in Maxium User Enrollements and Number of Attempts

@TC-004_SS
Scenario: User To Add new Module Slideshow without Publish
Given User Click module authoring module
And User Click create module Button to select 
And User Click slideshow Module Button
And User Enter module code and module Name
And User Upload module thumbnail and downloadable Media
And User Select Transition type
And User Select Page Orientation Mode
And User click on Choose a File and Upload
And User Enter Module short description
And User Enter Module long description 
And User Select Skills button and Select skills 
And User Enter maximum User enrollments in Advance settings
And User Enter expiration date in advance settings
And User Enter the timer Setting
And User Enter maximum Number of attempts in Advance Settings
And User Click Save button for slideshow
And User Click save and Publish button



@TC-005_SS
Scenario: User Verify the Preview Button
Given User Click on Module Authoring and Click search Slideshow
And User Enter the Slideshow Module Code in search Box
And User Click on Preview button to view module details
And User Click Back to Module in Slideshow module

@TC-006_SS
Scenario: User Verify the Edit Button
Given User Click on Module authoring and Click search Box
And User Enter the SlideShow Module Code in Search Box
And User Click on Edit Button to view module details



@TC-007_SS
Scenario: User delete the Unpublished module
Given Click on Module Authoring and Search
And Enter the SlideShow Module Code in search Box
And Click on Delete button to view Module details
And Click pop to Delete the module 

@TC-008_SS
Scenario: User delete the published module
Given Click on Module authoring button and click Search
And Enter the SlideShow Module Code in searchBox
And Click on Delete Button 
And Click Delete the module
And Click to Unpublish the module 
And Click on Edit Button
And Click on Unpublish button 
And Click on Module button
And Search the Module and Click the Delete Button
And Click popup to Delete the Module


@TC-001_Scrom
Scenario: User Add new Module SCROM
Given User Click on the Module Authoring 
And User click on the Create Button in Module Authoring
And User Click Scorm Module
And User Enter Module Code in basic details
And User Enter Module Title in basic details
And User Select Module Thumbnail and upload
And User Click Upload SCROM and Upload
And User Enter Module Short Description in basic details
And User Enter Module Long Description in basic details
And User Select Skills and select skill 
And User Enter Maximum User Enrollments in Advance settings
And User Enter Expiration Date in Advance settings
And User Enter Maximum Number of Attempts in Advance Settings
And User Click save button
And User Verify Added Successfully Button
And User Click Save and Publish

@TC-002_Scrom
Scenario: User Create new module SCROM
And User Click Module Authoring Module
And User Click Create Module Button
And User Click SCROM Button
And User Keep Module Code field as blank in basic details
And User Keep Module Title field as blank in basic details
And User Select Module Thumbnail and Upload
And User Upload SCROM not Upload
And User Keep Module Short Description field as blank in basic details
And User Keep Module Long Description field as blank in basic 
And User Enter Maximum User Enrollments in Advance settings
And User Enter Expiration Date in Advance settings
And User Enter Maximum Number of Attempts in Advance settings
And User Click Save Button
And User Verify Basic details are not filled 


@TC-003_Scorm
Scenario: User use Special Character in Scorm
Given User Click on Module Authoring Module
And User Click on Create Module Button
And User Select SCROM
And User Enter special character values in Module Code field in basic details 
And User Enter special character values in Module Title field in basic details
And User select Module Thumbnail and Upload
And User Upload any video file to Upload SCROM section
And User Add more than Hundred character values in Module Short Description field in basic details
And User Add more than Thousand character values Module Long Description field in basic details 
And User Enter Maximum User Enrollments in Advance Settings
And User Enter Expiration Date in Advance Settings
And User Enter Maximum Number Of Attempts in Advance Settings
And User click Save Button
And User Verify Module Code and Module Title error


@TC-004_Scorm
Scenario: User Verify the Preview Button
Given User Click on Module Authoring and Click search Scorm
And User Enter the Scorm Module Code in search Box 
And User Click on Preview button to view Scorm Module details
And User Click Back to Module in Scorm module

@TC-005_Scorm
Scenario: User Verify the Edit Button
Given user Click on Module Authoring and Click Search Scorm
And User Enter the Scorm Module Code in Search Box
And User Click on Edit button to view Scorm Module details



@TC-006_Scorm
Scenario: User delete the Unpublished module
Given Click on Module Authoring and Search Scorm Module
And Enter the Scorm Module Code in search Box
And Click on Delete button on Scorm module
And Click pop to Delete the Scorm module 

@TC-007_Scorm
Scenario: User delete the published module
Given Click on Module authoring button and Click search Scorm
And Enter the Scorm Module Code in searchBox
And Click on Delete Button in Scorm module 
And Click Delete the Scorm module
And Click to Unpublish the Scorm module 
And Click on Edit Button in Scorm module
And Click on Unpublish button the Scorm module 
And Click on Module Authoring button and Search Scorm
And Search the Scorm Module and Click the Delete Button
And Click popup to Delete the Scorm Module


@TC-001_Text
Scenario Outline: User Create new module text
Given user click on module Authoring module and create module button
And user select Text
And user Enter Module Code"<Text Row>" And Module Title "<Text Row>" in basic details
And user Select Module Thumbnail "<Text Row>" and upload for module text "<Text Row>" in basic details
And user Enter Module Short Description "<Text Row>" and Module Long Description "<Text Row>" in basic details
And user Select Audio "<Text Row>" in basic details
And user Enter Module Content "<Text Row>" and Click Skills to select Skill "<Text Row>" in basic details 
And user Enter Maximum User Enrollments "<Text Row>" and Expiration Date "<Text Row>" for Advance settings in basic details
And user Enter Maximum Number of Attempts "<Text Row>" and Minimum Time Limit "<Text Row>" for Advance settings in basic details
And user click Save button
And user click Save and Publish button "<Text Row>" 

Examples:
|Text Row|
|1|
|2|


@TC-002_Text
Scenario: User To Add new Text Module without adding basic details
Given User Click Module Authoring and click Create Module button
And User Click Text Module 
And User Click Save button without filling Text Module
And User Verify the Module Code and Name is required in Text Module
And User Verify the Short and Long Description is required in Text Module

@TC-003_Text
Scenario:  User To Add new Text Module with adding Special Symbols in  basic details
Given User Click Module Authoring and click create Module button by Adding special characters
And User Click Text module 
And User Click Save button with filling text Module by special characters
And User Verify the Module Code and Name is required in text module


@TC-004_Text
Scenario: User Verify the Preview Button
Given User Click on Module Authoring and Click search Text
And User Enter the Text Module Code in search Box 
And User Click on Preview button to view Module details
And User Click Back to Module in Text module

@TC-005_Text
Scenario: User Verify the Edit Button
Given user Click on Module Authoring and Click Search box
And User Enter the Text Module Code in Search Box
And User Click on Edit button to view Module details



@TC-006_Text
Scenario: User delete the Unpublished module
Given Click on Module Authoring and Search Text Module
And Enter the Text Module Code in search Box
And Click on Delete button on text module
And Click pop to Delete the text module 

@TC-007_Text
Scenario: User delete the published module
Given Click on Module authoring button and Click search
And Enter the Text Module Code in searchBox
And Click on Delete Button in text module 
And Click Delete the text module
And Click to Unpublish the text module 
And Click on Edit Button in text module
And Click on Unpublish button the text module 
And Click on Module Authoring button
And Search the text Module and Click the Delete Button
And Click popup to Delete the text Module

@TC-001_Video
Scenario Outline: User Create new module video
Given user click on Module Authoring and create module button to create video Module
And user select Video Module
And user Enter Module Code And Module Title "<VideoModule>" in basic details for Video module
And user Select Module Thumbnail and upload "<VideoModule>" in basic details for video module
And user Select Video content "<VideoModule>" in basic details
And user Enter Module Short Description and Long Description "<VideoModule>" in basic details for video module
And user Click Skills to select Skill "<VideoModule>" in Basic Details 
And user Enter Maximum User Enrollments and Expiration Date "<VideoModule>" for Advance settings in basic details for video module
And user Enter Maximum Number of Attempts and Time Limit "<VideoModule>" for Advance settings in basic details for video module
And user select Allow Offline Access on Mobile and Enter number of days "<VideoModule>"
And user click Save button for Video module
And user click Save and Publish Button "<VideoModule>"

Examples:
|VideoModule|
|1|
|2|

@TC-002_Video
Scenario: User To Add new video Module without adding basic details
Given User Click Module Authoring and Create Module button
And User Click Video Module 
And User Click Save button without filling video Module
And User Verify the Module Code and Name is required in video Module
And user verify the video content is required
And User Verify the Short and Long Description is required in video Module

@TC-003_Video
Scenario: User To Add new Video Module with adding Special Symbols in  basic details
Given User Click Module Authoring and  create Module button by Adding special characters
And User Click Video module 
And user upload video content 
And User Click Save button with filling Video Module by special characters
And User Verify the Module Code and Name is required in Video module

@TC-004_Video
Scenario: User Verify the Preview Button
Given User Click on Module Authoring and Click search Video
And User Enter the Video Module Code in search Box 
And User Click on Preview button to view Video Module details
And User Click Back to Module in Video module

@TC-005_Video
Scenario: User Verify the Edit Button
Given user Click on Module Authoring and Click Search Video Module
And User Enter the Video Module Code in Search Box
And User Click on Edit button to view Video Module details


@TC-006_Video
Scenario: User delete the Unpublished module
Given Click on Module Authoring and Search video Module
And Enter the video Module Code in search Box
And Click on Delete button on Video module
And Click pop to Delete the Video module 


@TC-007_Video
Scenario: User delete the published module
Given Click on Module authoring button and Click search Video
And Enter the Video Module Code in searchBox
And Click on Delete Button in video module 
And Click Delete the video module
And Click to Unpublish the video module 
And Click on Edit Button in video module
And Click on Unpublish button the video module 
And Click on Module Authoring button to Delete Video
And Search the Video Module and Click the Delete Button
And Click popup to Delete the Video Module


@TC-001_Webcontent
Scenario Outline: User Create new module Webcontent
Given User Click on module Authoring and create module button to create Webcontent
And User select WebContent
And User Enter Module Code And Module Title "<WebModule>" in basic details for Webcontent module
And User Select Module Thumbnail and upload "<WebModule>" in basic details for Webcontent module
And User Enter Module Short Description and Long Description "<WebModule>" in basic details for Webcontent module
And User enter webcontent "<WebModule>" in Basic details 
And User Click Skills to select Skill "<WebModule>" for WebContent module 
And User Enter Maximum User Enrollments and Expiration Date "<WebModule>" in Advance settings for Webcontent module
And User Enter Maximum Number of Attempts and Minimum Time Limit "<WebModule>" in Advance settings for Webcontent module
And User click Save button for Webcontent Module
And User click Save and Publish button "<WebModule>" for Webcontent Module

Examples:
|WebModule|
|1|
|2|


@TC-002_Webcontent
Scenario: User To Add new Web content Module without adding basic details
Given User Click Module Authoring and Create Module button for web content module
And User Click Web content Module 
And User Click Save button without filling basic details in web content Module
And user confirm web content popup
And User Verify the Module Code and Name is required in web content Module
And User Verify the Short and Long Description is required in web content Module


@TC-003_Webcontent
Scenario: User To Add new Webcontent Module with adding Special Symbols in  basic details
Given User Click Module Authoring and create Module button by giving special characters in Basic details 
And User Click Webcontent module 
And user upload web content 
And User Click Save button with filling Web content Module by special characters
And User Verify the Module Code and Name is required in web content module

@TC-004_Webcontent
Scenario: User Verify the Preview Button
Given User Click on Module Authoring and Click search Webcontent
And User Enter the Webcontent Module Code in search Box 
And User Click on Preview button to view Webcontent Module details
And User Click Back to Module in Webcontent module

@TC-005_Webcontent
Scenario: User Verify the Edit Button
Given user Click on Module Authoring and Click Search Webcontent Module
And User Enter the Webcontent Module Code in Search Box
And User Click on Edit button to view Webcontent Module details


@TC-006_Webcontent
Scenario: User delete the Unpublished module
Given Click on Module Authoring and Search Webcontent Module
And Enter the Webcontent Module Code in search Box
And Click on Delete button on Webcontent module
And Click pop to Delete the Webcontent module 


@TC-007_Webcontent
Scenario: User delete the published module
Given Click on Module authoring button and Click search Webcontent
And Enter the Webcontent Module Code in searchBox
And Click on Delete Button in Webcontent module 
And Click Delete the Webcontent module
And Click to Unpublish the Webcontent module 
And Click on Edit Button in Webcontent module
And Click on Unpublish button the Webcontent module 
And Click on Module Authoring button to Delete Webcontent
And Search the Webcontent Module and Click the Delete Button
And Click popup to Delete the Webcontent Module

@TC-001_Image
Scenario Outline: User Create new module image
Given User click on Module Authoring and create module button to create image module
And User select Image Module
And User Enter Module Code And Module Title "<Image>" in basic details for Image module
And User Select Module Thumbnail and upload "<Image>" for module text in basic details for Image module
And User Enter Module Short Description and Long Description "<Image>" in basic details for Image module
And User Select image "<Image>" in Basic details 
And User Enter Module Content and Click Skills to select Skill "<Image>" in basic details for Image module
And User Enter Maximum User Enrollments and Expiration Date "<Image>" for Advance settings in basic details for Image module
And User Enter Maximum Number of Attempts and Minimum Time Limit "<Image>" for Advance settings in basic details for Image module
And User click Save button for Image Module
And User click Save and Publish button "<Image>" for Image Module

Examples:
|Image|
|1|
|2|


@TC-002_Image
Scenario: User To Add new image Module without adding basic details
Given User Click Module Authoring and Create Module button for image module
And User Click image Module 
And User Click Save button without filling image Module
And User Verify the Module Code and Name is required in image Module
And user verify the image content is required
And User Verify the Short and Long Description is required in image Module



@TC-003_Image
Scenario:  User To Add new image Module with adding Special Symbols in  basic details
Given User Click Module Authoring and  create Module button by Adding special characters in Basic details
And User Click image module 
And user upload image content 
And User Click Save button with filling image Module by special characters
And User Verify the Module Code and Name is required in image module


@TC-004_Image
Scenario: User Verify the Preview Button
Given User Click on Module Authoring and Click search Image
And User Enter the Image Module Code in search Box 
And User Click on Preview button to view Image Module details
And User Click Back to Module in Image module

@TC-005_Image
Scenario: User Verify the Edit Button
Given user Click on Module Authoring and Click Search Image Module
And User Enter the Image Module Code in Search Box
And User Click on Edit button to view Image Module details


@TC-006_Image
Scenario: User delete the Unpublished module
Given Click on Module Authoring and Search Image Module
And Enter the Image Module Code in search Box
And Click on Delete button on Image module
And Click pop to Delete the Image module 


@TC-007_Image
Scenario: User delete the published module
Given Click on Module authoring button and Click search Image
And Enter the Image Module Code in searchBox
And Click on Delete Button in Image module 
And Click Delete the Image module
And Click to Unpublish the Image module 
And Click on Edit Button in Image module
And Click on Unpublish button the Image module 
And Click on Module Authoring button to Delete Image
And Search the Image Module and Click the Delete Button
And Click popup to Delete the Image Module


@TC-001_Webinar
Scenario Outline: User Create new module Webinar
Given User click on module Authoring and create module button to create Webinar
And User select Webinar
And User Enter Module Code And Module Title "<Webinar>" in basic details for Webinar module
And User Select Module Thumbnail and upload media "<Webinar>" in basic details for Webinar module
And User Enter Module Short Description and Long Description "<Webinar>" in basic details for Webinar module
And User Click Skills to select Skill "<Webinar>" for Webinar module 
And User Enter Maximum User Enrollments and Expiration Date "<Webinar>" in Advance settings for Webinar module
And User Enter Maximum Number of Attempts and click on non scorable module "<Webinar>" for Webinar module
And User click Save button for Webinar module
And user click session Tab button
And user click Add Webinar button
And user Enter Session Code And Session title "<Webinar>" in Session details 
And user enter Start Date and end date "<Webinar>" in Session details 
And user enter From and To "<Webinar>" in session details
And user enter Webinar Url "<Webinar>"  in session details
And user enter Maximum user and webinar guidelines "<Webinar>"
And user enter Instructor "<Webinar>" in session details
And user click on Save button in Session details
And User click Save and Publish "<Webinar>" Button for session module

Examples:
|Webinar|
|1|
|2|

@TC-002_Webinar
Scenario: User To Add new Webinar Module without adding basic details
Given User Click Module Authoring and Create Module button for Webinar module
And User select Webinar module
And User Click Save button without filling basic details in Webinar Module
And User Verify the Module Code and Name is required in Webinar Module
And User Verify the Short and Long Description is required in Webinar Module

@TC-003_Webinar
Scenario: User To Add new Webinar Module with adding Special Symbols in  basic details
Given User Click Module Authoring and create Module button by giving special characters in Basic details for Webinar module
And User select Webinar Module
And User Click Save button with filling Webinar Module by special characters
And User Verify the Module Code and Name is required in Webinar module

@TC-004_Webinar
Scenario: User Add new Webinar without adding Session details
Given User click on Module authoring and create module button to create Webinar
And User Select Webinar
And User Enter Module Code And  module title in Basic Details for webinar Module
And user enter Module short Description and Long Description in basic details for Webinar module
And user Click save Button for Webinar module
And User click Session Tab 
And user Click Add Webinar button
And User Click Save button without filling session details in Webinar Module
And User Verify the Session Code and Name is required in Webinar Module
And User Verify the webinar url and instructor is required in Webinar Module




@TC-005_Webinar
Scenario:  User To Add new Webinar with adding Special characters in Session details
Given User click on module Authoring and Search the webinar module
And User click on the Edit Button and click on Session Module
And User click session Tab button  to Create new session
And user click Add Webinar button to Create new session
And user Click Save button with filling Session Module by special characters
And user Verify the Session Code and Name is required in Webinar Module to check Special Symbol error 
And User Verify the webinar url and instructor is required in Webinar Module to check Special Symbol error 

@TC-006_Webinar
Scenario: User Verify the Preview Button
Given User Click on Module Authoring and Click search Webinar
And User Enter the Webinar Module Code in search Box 
And User Click on Preview button to view Webinar Module details
And User Click Back to Module in Webinar module

@TC-007_Webinar
Scenario: User Verify the Edit Button
Given user Click on Module Authoring and Click Search Webinar Module
And User Enter the Webinar Module Code in Search Box
And User Click on Edit button to view Webinar Module details


@TC-008_Webinar
Scenario: User delete the Unpublished module
Given Click on Module Authoring and Search Webinar Module
And Enter the Webinar Module Code in search Box
And Click on Delete button on Webinar module
And Click pop to Delete the Webinar module 


@TC-009_Webinar
Scenario: User delete the published module
Given Click on Module authoring button and Click search Webinar
And Enter the Webinar Module Code in searchBox
And Click on Delete Button in Webinar module 
And Click Delete the Webinar module
And Click to Unpublish the Webinar module 
And Click on Edit Button in Webinar module
And Click on Unpublish button the Webinar module 
And Click on Module Authoring button to Delete Webinar
And Search the Webinar Module and Click the Delete Button
And Click popup to Delete the Webinar Module




@TC-001_CourseAuthoring
Scenario: User add the course and publish
Given User click on Course Authoring Module
And User Click on Create Course
And User Enter the Course Code and Course Name
And User Select the Select Author 
And User enter the Short and Long description
And User click on the Course Type
And User select the Start Date and End date
And User select the activation date
And User enter the maximum enrollement
And User click on save button
And User Click on Announcement 
And User click on Create post
And User Enter Announcement Title and Short Description
And User Select publish date and time
And User Click and enter details in post
And User click on Save and Publish 
And User verify the Announcement 
And User click on the module 
And user click on the add module
And user select the module using checkbox
And user click on the Action button and click bulk add
And user click on Pop and click on back to module  
And User Click on the Discussion button
And User Click on the Add Discussion button
And User Enter the Discussion detail and description 
And User click on the publish 
And User Click on the popup
And User click on the goal 
And User Click on the users
And User click on the action and click bulk add
Then User verify the course authoring


@TC-002_Signout
Scenario: user logout the application
Given User click on the profile
And User Click on Logout button
 

@TC-001_learner
Scenario: User Login with Learner Credentials
Given User Enter the Learner id
And User Enter the password
And User Click Login Button
And User Verify the User Login
And User Click on the Assessment
And User Click on the Course 
And User verify the Author Name
And User Click on the Announcement
And User Click on the Module 
And User Click on the Scorm Module
And User Click Go button
And User Click Agree and Start
And User User Click Start Button
And User Switch to Course window
And User Click back to User window
And User Click on Discussion button
And User Enter the Course Discussion
And User Added the Question and click Answer button
And User Response will be get back
And User click back to Discussion
And User click on Leadership board
And User Click on the User profile
And User Logout the learner  






 
 

 