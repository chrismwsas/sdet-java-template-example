# Software Development Engineer in Test

In this exercise you will have 3 hours to create tests and supporting functions in Java to test certain user journeys through GitHub using its API.

## Tasks

Write three tests to verify the following user journeys:

1. As a user, I want to be able to login, see my details, and get a list of my repositories.
2. As a user, I want to be able to create, edit and view a repository.
3. As a user, I want to be able to create an Issue, get a list of Issues for my repo, and add/view comments on that Issue.

Your code should be written to maximise its maintainability and reusability.

Refer to the GitHub API v3 documentation for information: https://developer.github.com/v3/.

You can use the GitHub model classes that are available from:

https://github.com/eclipse/egit-github/tree/master/org.eclipse.egit.github.core#core-orgeclipseegitgithubcore 

You may also use an existing test framework that you are familiar with e.g. Cucumber for BDD). You should choose the technologies you have experience in and are comfortable with.

## Example Code

This project contains code to use the GitHun model model classes and a test class (GitHubJavaAPITest) with a single test function (test_BasicAuthenticationGetUserName) to demostrate usage.You can run this test from your IDE. It requires a valid GitHub username and token (see below for getting a GitHub access token)

You may choose to build upon this code or you can start fresh and even use a different technology for API requests like REST Assured.

## Access to the GitHub API

You must use your own GitHub account and need to generate and access token. You create an access token by selecting the Settings page for your account and then select Developer settings (https://github.com/settings/tokens).

## Pushing code

You should push your code change to remote repsitory as you make changes throughout the durtion of the test.
