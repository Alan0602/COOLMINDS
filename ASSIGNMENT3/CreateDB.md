## Create new DB.
#### Question 2.
Create a DB table(mysql/ms sql) for saving User info(say userName, password, FirstName, Last Name, Address, PinCode, Phone Number)

#### Requirements:
- Install MySQL:[MySQL](https://www.mysql.com/downloads/)
- Set Password in MySQL
- Install MySQL WorkBench (Optional)

#### QUERIES
- Create a DataBase
```sql
Create database userdata;
use userdata;
```
- Create table in database
```sql
CREATE TABLE Users
(UserID INT AUTO_INCREMENT PRIMARY KEY, UserName VARCHAR(50) NOT NULL UNIQUE, Password VARCHAR(255) NOT NULL, FirstName VARCHAR(50) NOT NULL, LastName VARCHAR(50) NOT NULL, Address VARCHAR(255) NOT NULL, PinCode VARCHAR(10) NOT NULL, PhoneNumber VARCHAR(15) NOT NULL);

desc Users;
```
![image](https://github.com/Alan0602/COOLMINDS/assets/100459334/6db3cb87-8447-4430-b096-9623b36d40d1)
  
