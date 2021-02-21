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

This project contains code to demonstarte use of the GitHub model classes with a test class (GitHubJavaAPITest) and a single test function (test_BasicAuthenticationGetUserName).

You can run this test from your IDE after you have built the GitHub model classes (see above). If you don't build the GitHub model JAR locally, you'll see an error like: 

> java: package org.eclipse.egit.github.core does not exist

The POM file references this as library: 

```<dependency>
    <groupId>org.eclipse.mylyn.github</groupId>
    <artifactId>org.eclipse.egit.github.core</artifactId>
    <version>2.1.5</version>
</dependency>
```

The version of the library you build may be different.

The test function also requires a valid GitHub username and token (see below for getting a GitHub access token).

You may choose to build upon this code or you can start fresh. You may also choose a different technology from the GitHub model classes for API requests such as REST Assured.


## Access to the GitHub API

You must use your own GitHub account and need to generate an access token. You can create an access token by selecting the Settings page for your GitHub account and then selecting Developer settings (https://github.com/settings/tokens).

## Pushing code

You should push your code change to remote repsitory as you make changes throughout the duration of the test.
