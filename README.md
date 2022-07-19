# knygos.lt Automation Test

Reference: https://www.knygos.lt/

## Description:
#### Automated tests for three chosen scenarios for [knygos.lt](https://www.knygos.lt/):
```bash
* Creating new account with valid data
* Creating new account with invalid data
* LogIn to existing account with valid data
* LogIn to existing account with invalid data
* Test Logout function after login
* Test search function
* Test search products by category
* Test adding products to cart
```
## Technologies:
```bash
1. Windows 10
2. IntelliJ IDEA
3. JAVA/Maven
4. JDK 18
```
#### Dependencies:
```bash
* testNg
* Selenium
* Webdriver manager
* javafaker
```

# Test Scenarios:

### 1. Registration with invalid and valid input fields
#### A. Register using valid data
```bash
* Open user account
* Click Sign In
* Verify all registration fields
* Click Submit 
```

#### B. Register using an invalid data
```bash
* Open user account
* Click Sign In
* Verify all registration fields
* Click Submit
```

### 2. Login with valid and invalid data field
#### A. Login with valid data
```bash
* Click Login
* Enter valid email
* Enter valid password
* Click Submit
```

#### B.Login with invalid data
```bash
* Click Login
* Enter invalid email
* Enter invalid password
* Click Submit
```
### 3. Logout
```bash
* Click Login
* Enter invalid email
* Enter invalid password
* Click Submit
* Click user account
* Select Logout 
```
### 4. Search function
```bash
* Set text to search field
* Click Search
* Check if text appears in results
```
### 5. Search by categories
```bash
* Click on Top button
* Click on Top Category 
* Check if text appears in results
```
