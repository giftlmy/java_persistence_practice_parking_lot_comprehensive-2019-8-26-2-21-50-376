CREATE TABLE employee (
  employeeID VARCHAR(40) PRIMARY KEY,
);
insert into employee values ('1');

CREATE TABLE parkinglot (
  parkinglotID varchar(40) PRIMARY KEY,
  capacity INTEGER(100) not null ,
  availablePositionCount INTEGER(100) default NULL,
  employeeID varchar(40)
 );
 insert into parkinglot values('1',100,60,'1');