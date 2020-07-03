insert into course(id, name, created_date, last_updated_date, is_deleted) values(10001, 'The Castle Course', sysdate(), sysdate(), false);
insert into course(id, name, created_date, last_updated_date, is_deleted) values(10002, 'The Trial Course',sysdate(), sysdate(), false);
insert into course(id, name, created_date, last_updated_date, is_deleted) values(10003, 'Amerika Course',sysdate(), sysdate(), false);
insert into course(id, name, created_date, last_updated_date, is_deleted) values(10004, 'The Metamorphosis Course',sysdate(), sysdate(), false);
insert into course(id, name, created_date, last_updated_date, is_deleted) values(10005, 'Dummy Course_1',sysdate(), sysdate(), false);
insert into course(id, name, created_date, last_updated_date, is_deleted) values(10006, 'Dummy Course_2',sysdate(), sysdate(), false);
insert into course(id, name, created_date, last_updated_date, is_deleted) values(10007, 'Dummy Course_3',sysdate(), sysdate(), false);
insert into course(id, name, created_date, last_updated_date, is_deleted) values(10008, 'Dummy Course_4',sysdate(), sysdate(), false);
insert into course(id, name, created_date, last_updated_date, is_deleted) values(10009, 'Dummy Course_5',sysdate(), sysdate(), false);


insert into passport(id, number) values(40001, 'E123456');
insert into passport(id, number) values(40002, 'L123456');
insert into passport(id, number) values(40003, 'N213456');
insert into passport(id, number) values(40004, 'E12342');
insert into passport(id, number) values(40005, 'R132485');


insert into student(id, name, passport_id) values(20001, 'Sipi',40002);
insert into student(id, name, passport_id) values(20002, 'Birbi',40001);
insert into student(id, name, passport_id) values(20003, 'Timos',40005);
insert into student(id, name, passport_id) values(20004, 'Zoli',40004);
insert into student(id, name, passport_id) values(20005, 'Polom',40003);


insert into review(id, rating, description, course_id) values(50001, 'FIVE', 'Great Course',10001);
insert into review(id, rating, description, course_id) values(50002, 'FIVE', 'Great Course',10002);
insert into review(id, rating, description, course_id) values(50003, 'FOUR', 'Good Course',10002);
insert into review(id, rating, description, course_id) values(50004, 'THREE', 'Average Course',10004);
insert into review(id, rating, description, course_id) values(50005, 'ONE', 'SHIT',10001);
insert into review(id, rating, description, course_id) values(50006, 'TWO', 'Bad Course', 10003);

insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20001, 10004);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20002, 10004);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20003, 10001);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20004, 10001);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20005, 10003);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20005, 10004);