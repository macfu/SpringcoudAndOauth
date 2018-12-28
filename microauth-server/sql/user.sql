CREATE TABLE member(
 mid varchar(64) not null,
 name varchar(32),
 password varchar(32),
 locked int,
 CONSTRAINT pk_mid PRIMARY KEY (mid)
)engine='innodb';

CREATE TABLE role(
 rid varchar(64),
 title varchar(256),
 CONSTRAINT pk_rid PRIMARY KEY (rid)
)engine='innodb';

create table member_role(
 mid varchar(64),
 rid varchar(64),
 CONSTRAINT fk_mid2 FOREIGN KEY (mid) REFERENCES member(mid),
 CONSTRAINT fk_rid2 FOREIGN KEY (rid) REFERENCES role(rid)
)engine='innodb';

-- 1锁定
INSERT INTO member(mid,name,password,locked) VALUES ('admin','管理员','hello',0);
INSERT INTO member(mid,name,password,locked) VALUES ('mldn','普通人','hello',0);
INSERT INTO member(mid,name,password,locked) VALUES ('meraid','美人鱼','hello',1);

INSERT INTO role(rid,title) VALUES ('USER','普通用户');
INSERT INTO role(rid,title) VALUES ('ADMIN','管理员');
INSERT INTO role(rid,title) VALUES ('GUEST','临时用户');

INSERT INTO member_role(mid,rid) VALUES ('admin','USER');
INSERT INTO member_role(mid,rid) VALUES ('admin','ADMIN');
INSERT INTO member_role(mid,rid) VALUES ('admin','GUEST');
INSERT INTO member_role(mid,rid) VALUES ('mldn','USER');
INSERT INTO member_role(mid,rid) VALUES ('mldn','GUEST');
INSERT INTO member_role(mid,rid) VALUES ('meraid','GUEST');
