#Mapper확인

use spring;

create table sample (num int, title varchar(50), res timestamp );

select * from sample;

insert into sample values (1, '샘플1', default);

insert into sample values (2, '샘플2', default);

insert into sample values (3, '샘플3', default);

commit;

SELECT num FROM sample ORDER BY num DESC LIMIT 1;

commit;