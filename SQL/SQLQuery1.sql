create database myfriendsdb;
use myfriendsdb;

create table friend(/*Cant be null or duplicate*/
id int primary key,
first_name varchar(100),
last_name varchar(100),
hobbies varchar(50)
);

insert into friend(id,first_name,last_name,hobbies)
values (1,'Super','Man','Code'),
	   (2,'Karna','Soorya','Football'),
	   (3,'Bat','Man','NCC'),
	   (4,'Spider','Man','Swimming');

select * from friend; 
select * from friend where id = 2;
select * from friend where first_name = 'Karna';

update friend
set hobbies = 'Workout'
where id = 3;

delete from friend where id = 1;

insert into friend (id,first_name,last_name,hobbies)
values (5,'Bahubali','Amarendra','War');

insert into friend (id,first_name,last_name,hobbies)
values (1,'Cristiano','Ronaldo','Football');

drop table friend;

