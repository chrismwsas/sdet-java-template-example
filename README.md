# Software Development Engineer in Test

To prepare for the SDET technical test, you should follow the instructions below to run a Java test with JUnit that talks to the GitHub API.

Note that you must be able to run the test before you undertake the technical test. If you are cannot get the test to run please contact your representative from SAS. 

## Pre-requisites

You must use your own GitHub account and you will need to generate an access token. You can create an access token by selecting the Settings page for your GitHub account and then selecting Developer settings (https://github.com/settings/tokens).

You will need a Java JDK. Version 8 will be sufficient. We would also highly recommend installing maven and verifying that you can use it.

On Windows, this should be as simple as installing the package manager Chocolatey (https://chocolatey.org/install) then running:

````
choco install jdk8
choco install maven
````

Or follow the instructions here for your platform:

https://www.baeldung.com/install-maven-on-windows-linux-mac

You can use any IDE and tools that you are familiar with.

## Example Code

This project contains simple code to demonstrate the use of a GitHub query API, and Junit, with a single test class, GitHubJavaAPITest, containing a single test function (test_BasicAuthenticationGetUserName). 

To run the example test, first edit src/test/java/GitHubJavaAPITest.java and change the username and token to your GitHub user and your personal access token as generated earlier.

Then run:

````
mvn test
````

This should pull down all the dependencies and run and pass the single test.

Alternatively, you can run this test from your IDE of choice using whatever method you are familiar with.

# Next Steps 

During the technical test you'll be asked to work through a number of programing tasks.

The code in this example can be used as the basis of coding solutions to the tasks. 

However, you may choose to start fresh using different technology othen than the GitHub model classes for API requests (for example, REST Assured). 
