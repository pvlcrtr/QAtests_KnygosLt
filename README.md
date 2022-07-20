# knygos.lt Automation Test

```bash
Reference: https://www.knygos.lt/
```

## Description:

#### Automated tests for three chosen scenarios for [knygos.lt](https://www.knygos.lt/):

```bash
* Creating new account with invalid data
* LogIn to existing account with valid data
* LogIn to existing account with invalid data
* Test Logout function after login
* Test search function
* Test search products by category
* Test adding products to cart
* Test adding products to wishlist
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
1. testNg
2. Selenium
3. Webdriver manager
4. javafaker
```

# Test Scenarios:

### 1. Registration with invalid data (negative testing)

```bash
* Open user account
* Click Sign In
* Verify all registration fields
* Click Submit

Expected result: User shouldn't Sign in
Actual result: As expected
```

### 2. Login with valid and invalid data field

#### A. Login with valid data

```bash
* Click Login
* Enter valid email
* Enter valid password
* Click Submit

Expected result: User should successfully login
Actual result: As expected
```

#### B.Login with invalid data

```bash
* Click Login
* Enter invalid email
* Enter invalid password
* Click Submit

Expected result: User should not login
Actual result: As expected
```

### 3. Logout

```bash
* Click Login
* Enter invalid email
* Enter invalid password
* Click Submit
* Click user account
* Select Logout 

Expected result: User should successfully logout
Actual result: As expected
```

### 4. Search function

```bash
* Set text to search field
* Click Search
* Check if text appears in results

Expected result: Search function should search by given parameters
Actual result: As expected
```

### 5. Search by categories

```bash
* Click on Top button
* Click on Top Category 
* Check if text appears in results

Expected result: Search function should successfully work by set filters
Actual result: As expected
```

### 6. Add books to cart

```bash
* Set text to search field
* Click search 
* Click add book to cart 
* Click continue shopping  
* Click add another book to cart
* Click review a cart
* Check if two books added 

Expected result: Product should be successfully added to a cart
Actual result: As expected
```

### 6. Add books wishlist

```bash
* LogIn
* Click books on sale 
* Click books up to 2.99 Eur.
* Click books with defects 
* Click books in stock
* Click on book
* Click add book in wishlist
* Click open user account
* Click open wishlist
* Check result

Expected result: Product should be successfully added to a wishlist
Actual result: As expected
```