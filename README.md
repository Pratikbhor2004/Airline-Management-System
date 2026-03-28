# Airline-Management-System
 Language Used -  Java Core  Concept Used - Swing IDE Used - NetBeans Database Used - MySQL
This project on Airline Management System is the automation of registration process of airlines system. The system provides information like passenger’s information, flight information, list of all passengers, it allows storing and retrieving data related to the airline industry and make transactions related to air travel etc. The system also allows us to add records when a passenger reserves a ticket. For data storage and retrieval we use MySQL Database. It enables us to add any number of records in our database. The project “Airline Management System” comprises of a large number of flights which belong to a particular airline. The system we have implemented manages different objects viz.

SQL Commands 
CREATE DATABASE airlinemanagementsystem;
USE airlinemanagementsystem;
CREATE TABLE login (
    username VARCHAR(20),
    password VARCHAR(20)
);
INSERT INTO login VALUES ('root', '1234');
INSERT INTO login VALUES ('pratik', '1234');
SELECT * FROM login;
show tables;

create table passenger (name varchar(20), nationality varchar(20), phone varchar(15), address varchar(50), aadhar varchar(20), gender varchar(20));
select * from passenger;

create table flight(f_code varchar(20), f_name varchar(20), source varchar(40), destination varchar(40));
insert into flight values("1001", "AI-1212", "Delhi", "Mumbai");
insert into flight values("1002", "AI-1453", "Delhi", "Goa");
insert into flight values("1003", "AI-1112", "Mumbai", "Chennai");
insert into flight values("1004", "AI-3222", "Delhi", "Amritsar");
insert into flight values("1005", "AI-1212", "Delhi", "Ayodhya");
select * from flight;

show tables;
select * from passenger;

create table reservation(PNR varchar(15), TICKET varchar(20), aadhar varchar(20), name varchar(20), nationality varchar(30), flightname varchar(15), flightcode varchar(20), src varchar(30), des varchar(30), ddate varchar(30));
select * from reservation;


create table cancel(pnr varchar(20), name varchar(40), cancelno varchar(20), fcode varchar(20), ddate varchar(30));
select * from cancel;
