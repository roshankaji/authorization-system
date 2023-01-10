# authorization-system
Permission based authorization system for API access control.

**Database: MYSQL**

User Table:
user_id
username
password

Role Table:
role_id
rolename

user_role Table:
user_id
role_id

Database commands:
_create database_ authorize_db;

_use_ authorize_db;

_CREATE TABLE user_
(
user_id int PRIMARY KEY auto_increment NOT NULL,
username VARCHAR(20) unique NOT NULL,
password varchar(25) NOT NULL
);

_CREATE TABLE role_
(
role_id int PRIMARY KEY auto_increment NOT NULL,
rolename VARCHAR(20) unique NOT NULL
);

_CREATE TABLE_ user_role
(
user_id int,
role_id int ,
foreign key(user_id) references user(user_id),
foreign key(role_id) references role(role_id)
);

**Note:Change database name and authentication details(username/password) in application.properties accordingly**

###Public API
1./user/register(registers a new user)
2./user/login(token will be generated after successful login)

###Private API
1./user/API1
2./user/API2

**Steps to Run**
Start the main application - AuthorizationSystemApplication