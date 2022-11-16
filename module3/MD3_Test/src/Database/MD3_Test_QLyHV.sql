CREATE DATABASE `MD3_Test1`;
USE MD3_Test1;

CREATE TABLE Classes (
IdClass int primary key auto_increment,
ClassName varchar(15) );

CREATE TABLE Students (
Id int primary key auto_increment,
Name varchar(50) not null,
DateOfBirth Date not null,
Address varchar(100) not null,
PhoneNumber varchar(10) not null,
Email varchar(50) not null,
IdClass int,
foreign key(IdClass) references Classes(IdClass) );

INSERT INTO Classes values
(1, "C0722G1"), (2, "C0918G2"),  (3, "C0819H2");






