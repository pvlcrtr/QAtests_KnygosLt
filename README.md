# Automation Tests for knygos.lt

Reference: https://www.knygos.lt/

## Description:

#### Automated tests for [knygos.lt](https://www.knygos.lt/):

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
* Click "User account" button
* Click "Sign In" button
* Verify all registration fields
* Click "Submit" button 
* Compare actual result to expected result

Expected result: User shouldn not create account with invalid data
Actual result: As expected
```

### 2. Login with valid and invalid data field

#### A. Login with valid data

```bash
* Click "Login" button
* Enter valid email to "Email" field
* Enter valid password to "password" field
* Click "Submit" button 
* Compare actual result to expected result

Expected result: User should successfully login
Actual result: As expected
```

#### B.Login with invalid data

```bash
* Click "Login" button
* Enter invalid email to "Email" field
* Enter invalid password to "password" field
* Click "Submit" button 
* Compare actual result to expected result

Expected result: User should not login
Actual result: As expected
```

### 3. Logout

```bash
* Click "Login" button
* Enter invalid email to "Email" field
* Enter invalid password to "password" field
* Click "Submit" button 
* Click "User account" button
* Press "Logout"
* Compare actual result to expected result

Expected result: User should successfully logout
Actual result: As expected
```

### 4. Search function

```bash
* Enter text to search field
* Click "Search" button
* Compare actual text message result to expected text message

Expected result: Search function should search by given parameters
Actual result: As expected
```

### 5. Search by categories

```bash
* Click "Top books" button
* Select "Top Category" from list 
* Compare actual search result message to expected result

Expected result: Search function should successfully work by set filters
Actual result: As expected
```

### 6. Add books to cart

```bash
* Enter text to search field
* Click "Search" button 
* Click "Add book to cart" button 
* Click "Continue shopping" button 
* Click "Add another book to cart" button
* Click "Check wishlist" button
* Compare actual result to expected

Expected result: Product should be successfully added to a cart
Actual result: As expected
```

### 7. Test "add books to wishlist" function

```bash
* LogIn to existing account
* Click "Books on sale" button
* Click "Books up to 2.99 Eur." button
* Click "Books with defects" button 
* Select "Books in stock" in selection box
* Select first book by click on it
* Click "Add book to wishlist" button
* Click "Open user account" button
* Click "Wishlist" button
* Compare actual result to expected result

Expected result: Product should be successfully added to a wishlist
Actual result: As expected
```