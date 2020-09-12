/*create table*/
create table r42
(id number(7) constraint r42_id_pk primary key,
 batch_name varchar2(30) default 'r42',
 name varchar2(30),
 email varchar2(30) not null, /*constraint r42_email_uk unique*/
 dob date,
 phone_no varchar2(13));
/* describe*/
describe r42;
select * from tab;
/*insert a row with all column name*/
insert into r42(id, batch_name, name, email, dob, phone_no)
values(1123452, 'ESAD/J2EE/TCLD/01M/r42/01', 'your name', 'your email', '01-JAN-85', '01711655409');
commit;
select * from r42;
/*insert a row without column name*/
insert into r42
values(1123453, 'ESAD/J2EE/TCLD/01M/r42/01', 'your name', 'your email', '01-JAN-85', '017676635409');
/*insert a row with implicit null value*/
insert into r42(id, email, dob)
values(1123457, 'your email','01-JAN-85');
/*insert a row with explicit null value*/
insert into r42
values(1123986, null, 'your name', 'your email', sysdate, '');
/*insert rows with substitution variable*/
insert into r42
values(&id, '&batch_name', '&name', '&email', '&dob', '&pn');
/*insert rows using subquery*/
insert into r42(id, name, email, dob, phone_no)
select employee_id, last_name, email, hire_date, phone_number
from employees where department_id=50;
rollback;
/*update row*/
update r42
set name='Update name',
    email='new email'
where id= 1123457;
/*delete row*/
delete from r42
where id=3224242;
/*TRUNCATE */
TRUNCATE TABLE r42;
/*create sequence*/
CREATE SEQUENCE r42_id_seq
INCREMENT BY 1
START WITH 1000000
MAXVALUE   10000000
NOCACHE
NOCYCLE;
/*insert using sequence*/
insert into r42(id, email, dob)
values(r42_id_seq.nextval, 'your email','01-JAN-85');
/*View the current value for the r42_id_seq sequence:*/
SELECT r42_id_seq.CURRVAL
FROM dual;

/*Add constraint after creating table */
alter table r42
add constraint r42_id_pk primary key(id)

alter table r42
add constraint r42_email_uk unique(email);

alter table r42
drop constraint r42_email_uk;

/*Add new column*/
ALTER TABLE r42
ADD (father_name VARCHAR2(30));

/*Modify new column*/
alter table r42
modify (name varchar2(40) default 'demo');

/*Drop column*/
ALTER TABLE r42
DROP COLUMN father_name;

/* OR */
ALTER TABLE r42
DROP (father_name);

/*Rename column*/
ALTER TABLE r42
RENAME COLUMN id to trainee_id;











