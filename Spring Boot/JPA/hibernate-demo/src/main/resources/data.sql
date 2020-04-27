insert into course(id, name, created_date, last_updated_date) values(10001, 'The Castle Course', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10002, 'The Trial Course',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10003, 'Amerika Course',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10004, 'The Metamorphosis Course',sysdate(), sysdate());


insert into passport(id, number) values(40001, 'E134556');
insert into passport(id, number) values(40002, 'L133256');
insert into passport(id, number) values(40003, 'N329456');
insert into passport(id, number) values(40004, 'E933162');
insert into passport(id, number) values(40005, 'R145685');


insert into student(id, name, passport_id) values(20001, 'Sipi',40002);
insert into student(id, name, passport_id) values(20002, 'Birbi',40001);
insert into student(id, name, passport_id) values(20003, 'Timos',40005);
insert into student(id, name, passport_id) values(20004, 'Zoli',40004);
insert into student(id, name, passport_id) values(20005, 'Polom',40003);


insert into review(id, rating, description, course_id) values(50001, '5', 'Great Course',10001);
insert into review(id, rating, description, course_id) values(50002, '5', 'Great Course',10002);
insert into review(id, rating, description, course_id) values(50003, '4', 'Good Course',10002);
insert into review(id, rating, description, course_id) values(50004, '3', 'Average Course',10004);
insert into review(id, rating, description, course_id) values(50005, '1', 'SHIT',10001);
insert into review(id, rating, description, course_id) values(50006, '2', 'Bad Course', 10003);

insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20001, 10004);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20002, 10004);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20003, 10001);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20004, 10001);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20005, 10003);
insert into STUDENT_COURSE(STUDENT_ID, COURSE_ID) values(20005, 10004);