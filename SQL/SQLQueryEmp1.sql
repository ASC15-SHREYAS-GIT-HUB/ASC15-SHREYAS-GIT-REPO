use sbdb;

create table emp(	
	id int primary key identity(1,1),
	firstName varchar(30),
	lastName varchar(30),
	emailId varchar(30)
);

select * from emp;
drop table emp;