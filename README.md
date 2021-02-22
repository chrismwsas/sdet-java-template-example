# Software Development Engineer in Test

In this exercise you will have 3 hours to create tests and supporting functions in Java to test certain user journeys through GitHub using its API.

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

## Tasks

Write three tests to verify the following user journeys:

1. As a user, I want to be able to login, see my details, and get a list of my repositories.
2. As a user, I want to be able to create, edit and view a repository.
3. As a user, I want to be able to create an Issue, get a list of Issues for my repo, and add or view comments on that Issue.

Your code should be written to maximise its maintainability and reusability.

Refer to the GitHub API v3 documentation for information: https://developer.github.com/v3/.

You should choose technologies you have experience in and are comfortable with.

## Example Code

This project contains simple code to demonstrate the use of a GitHub query API, and Junit, with a single test class, GitHubJavaAPITest, containing a single test function (test_BasicAuthenticationGetUserName). 

You may choose to build upon this code or you can start fresh. You may also choose a different technology from the GitHub model classes for API requests, such as REST Assured.

To run the example test, first edit src/test/java/GitHubJavaAPITest.java and change the username and token to your GitHub user and your personal access token as generated earlier.

Then run:

````
mvn test
````

This should pull down all the dependencies and run and pass the single test.

Alternatively, you can run this test from your IDE of choice using whatever method you are familiar with.

## Exploring the GitHub API

You may want to use a tool like Postman or Curl to explore the GitHub API before you write Java code.

## Pushing code

You should push your code change to the remote GitHub remote repository as you make changes throughout the duration of the test.
