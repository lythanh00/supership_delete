use supership;

insert into role(code,name) values('ADMIN','Quản trị');
insert into role(code,name) values('USER','Người dùng');

insert into user(username,password,fullname,email,isactived)
values('admin','123456','lý tiến thành','lytienthanhs1@gmail.com',1);
insert into user(username,password,fullname,status)
values('nguyenvana','123456','nguyễn văn A','nva@gmail.com',1);
insert into user(username,password,fullname,status)
values('nguyenvanb','123456','nguyễn văn B','nvb@gmail.com',1);

INSERT INTO user_role(userid,roleid) VALUES (1,1);
INSERT INTO user_role(userid,roleid) VALUES (2,2);
INSERT INTO user_role(userid,roleid) VALUES (3,2);