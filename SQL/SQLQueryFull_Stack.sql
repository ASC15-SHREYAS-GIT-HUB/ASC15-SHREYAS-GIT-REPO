USE myfriendsdb; 

CREATE Table Employee(
	 id INT primary key,
	 firstName varchar(50),
	lastName varchar(50) ,
	 hobbies varchar(50),
)

insert into Employee(id,firstName,lastName,hobbies)
values(1,'David','Kutti','Cycling'),
		(2,'Joesph','Mathew','Reading'),
		(3,'Cristopher','Hemming','Football');

select * from employee;


drop table Employee;