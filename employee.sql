create database employee;
use employee;

create table employeedetails(
id int not null primary key,
fname varchar(10) not null,
mname varchar(10) not null,
lname varchar(10) not null,
age int not null,
salary int not null,
address varchar(30) not null,
postid int not null
);

create table postdetails(
id int not null primary key,
postname varchar(30),
postingaddress varchar(30));

alter table employeedetails
add
foreign key(postid) references postdetails(id);

desc employeedetails;

delimiter $$
create function emid()
returns varchar(30)
deterministic
begin
declare totalrows varchar(5);
select max(id) into totalrows from employeedetails;
set totalrows=concat(substr(totalrows,1,2),substr(totalrows,3,5)+1);
return totalrows;
end $$
delimiter ;

insert into postdetails values
(202,"Software Developer","Delhi"),
(203,"Analyst","Mumbai"),
(204,"Devops Engineer","Ahemdabad"),
(205,"Computer Mechanics","Howrah"),
(206,"web Developer","Surat");

select * from postdetails;
select * from employeedetails;
insert into employeedetails value
("Dev","Dev","Dev",2,2000,"Delhi",202,emid());

alter table employeedetails
add column id varchar(5) not null primary key;
alter table employeedetails
drop column id;

select * from employeedetails;
select min(id) from employeedetails;

select emid();
delete from employeedetails where age=37;
select * from employeedetails;

set sql_safe_updates=false;
drop function emid;
select substr("EM100",3,5);
show function status;

select id,fname,mname,lname,age,salary,postid from employeedetails;
select postname from postdetails;
select e.id,e.fname,e.mname,e.lname,e.address,e.age,e.salary,p.postname from employeedetails e
join postdetails p
on e.postid=p.id;

delete from employeedetails where id="EM101";

select * from employeedetails;
update employeedetails set fname="ss",mname="ss",lname="dd",age=34,salary=3455,address="Delhi",postid=202 where id="EM115"; 