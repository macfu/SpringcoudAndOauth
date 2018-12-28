drop database if exists mldn;
create database mldn character set utf8;
use mldn;
create table client(
 clientid varchar(64) not null,
 clientsecret varchar(32),
 scope varchar(32),
 locked int,
 authorizedgranttypes varchar(64),
 constraint pk_mid primary key (clientid)
)engine='innodb';

create table authorities(
 authoid varchar(64),
 title varchar(64),
 constraint pk_authoid primary key (authoid)
)engine='innodb';

create table client_authorities(
 clientid varchar(64),
 authoid varchar(64),
)engine='innodb';

insert into client(clientid,clientsecret,scope,locked,authorizedgranttypes) values ('cadmin','chello','webapp',0,'authorization_code');
insert into client(clientid,clientsecret,scope,locked,authorizedgranttypes) values ('cmldn','cjava','webapp',0,'authorization_code');

insert into authorities(authoid, title) values ('CLIENT','访问客户');

insert into client_authorities(clientid, authoid) values ('cadmin','CLIENT');
insert into client_authorities(clientid, authoid) values ('cmldn','CLIENT');

