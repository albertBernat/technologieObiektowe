# Unit test framework based on Junit 4 - created for academic purposes

Implementation is inspired by Junit4. It's small framework with basic operations used in unit tests. 

Implemented: 
- SetUp method
- TearDown method
- Invoking single test
- Invoking list of tests
- Running test in given package
- Generate console reports and HTML files
- Assertions

Project consists of two maven modules: TestFramework and FrameworkDemo. First is core module of framework, second is basic implementation of stack with example unit test.

!Important - to run test properly you must pass -ea flag to java command parameter. (It enables assertions).
