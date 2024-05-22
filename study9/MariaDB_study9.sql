use spring;

drop table custom;

create table custom(id varchar(20) primary key, pw varchar(400) not null, name varchar(50) not null, email varchar(200), tel varchar(18), addr varchar(200), postcode varchar(10), resdate  TIMESTAMP default current_timestamp);

desc custom;

select * from custom;



