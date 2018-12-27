drop database if exists macfu8001;
create database macfu8001 character set utf8;
use macfu8001;
create table dept(
 deptno bigint auto_increment,
 dname varchar(64),
 loc varchar(64),
 constraint pk_deptno primary key(deptno)
);

insert into dept(dname,loc) values ('开发部',database());
insert into dept(dname,loc) values ('财务部',database());
insert into dept(dname,loc) values ('市场部',database());
insert into dept(dname,loc) values ('后勤部',database());
insert into dept(dname,loc) values ('公关部',database());