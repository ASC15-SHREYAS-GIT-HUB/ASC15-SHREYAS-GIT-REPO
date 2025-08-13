use sbdb;

create table STUDENT(
	id int primary key,
	FirstName varchar(30) not null,
	LastName varchar(30) not null,
	Email varchar(30) not null,
	GradeLevel varchar(30),
	Age int


);

INSERT INTO STUDENT (id,FirstName, LastName, Email, GradeLevel, Age)
VALUES 
    (1,'Alice', 'Smith', 'alice@school.com', '10th', 15),
    (2,'Bob', 'Johnson', 'bob@school.com', '11th', 16),
    (3,'Carol', 'Williams', 'carol@school.com', '9th', 14);

select * from student;

drop table STUDENT;