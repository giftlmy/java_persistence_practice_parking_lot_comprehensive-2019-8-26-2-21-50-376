CREATE TABLE employee (
  employeeID VARCHAR(40) PRIMARY KEY,
);
insert into employee values ('1');

CREATE TABLE parkinglot (
  parkinglotID varchar(40) PRIMARY KEY,
  capacity INTEGER(100) not null ,
  availablePositionCount INTEGER(100) default NULL,
 );
 insert into parkinglot values('1',100,60);