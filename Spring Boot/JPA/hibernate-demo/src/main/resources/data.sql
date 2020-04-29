insert into course(id, name, created_date, last_updated_date) values(10001, 'The Castle Course', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10002, 'The Trial Course',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10003, 'Amerika Course',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10004, 'The Metamorphosis Course',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10005, 'Dummy Course_1',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10006, 'Dummy Course_2',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10007, 'Dummy Course_3',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10008, 'Dummy Course_4',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10009, 'Dummy Course_5',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10010, 'Dummy Course_6',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10011, 'Dummy Course_7',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10012, 'Dummy Course_8',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10013, 'Dummy Course_9',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10014, 'Dummy Course_10',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10015, 'Dummy Course_11',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10016, 'Dummy Course_12',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10017, 'Dummy Course_13',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10018, 'Dummy Course_14',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10019, 'Dummy Course_15',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10020, 'Dummy Course_16',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10021, 'Dummy Course_17',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10022, 'Dummy Course_18',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10023, 'Dummy Course_19',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10024, 'Dummy Course_20',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10025, 'Dummy Course_21',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10026, 'Dummy Course_22',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10027, 'Dummy Course_23',sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10028, 'Dummy Course_24',sysdate(), sysdate());


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