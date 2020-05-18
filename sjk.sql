CREATE DATABASE java0421;

USE java0421;

CREATE TABLE student(
	sno int,
	name varchar(10),
	age int
);

CREATE TABLE course(
	cno int,
	cname varchar(10),
	score int
);

INSERT INTO student(sno,name,age) VALUES (1,'杨超越',20);
INSERT INTO course(cno,cname,score) VALUES (8,'杨超越',100);

SELECT * FROM student;
SELECT * FROM course;


drop table student；



CREATE TABLE student(
   id INT COMMENT 'id'，
   sn INT COMMENT '学号'，
   name VARCHAR(10) COMMENT '姓名',
   qq_emali VARCHAR(20) COMMENT '邮箱'
);

-- 单行全列插入
INSERT INTO student(id,sn,name,qq_emali) VALUES(1,1001,'tanjiro','1314@qq.com');
INSERT INTO student(id,sn,name) VALUES(2,1002,'tomioka','12222@qq.com');
-- 单行指定列插入
INSERT INTO student(id,sn,name) VALUES(3,2012,'zenitsu');
-- 多行全列插入
INSERT INTO student(id,sn,name) VALUES
(4,1034,'asjf','15322@qq.com')(6,114,'sayitsu','122322@qq.com');
-- 多行指定列插入
INSERT INTO student(id,sn,name) VALUES
(7,6564,'gsf','12422@qq.com')(9,24,'aksh','2352322@qq.com');






CREATE TABLE exam_result (
id INT COMMENT 'ID',
name VARCHAR(20),
chinese DECIMAL(3,1),
math DECIMAL(3,1),
english DECIMAL(3,1)
);

INSERT INTO exam_result VALUES(1,'GAOBO',89.9,89,98.9);

INSERT INTO exam_result (id,name, chinese, math, english) VALUES
(2,'孙悟空', 87.5, 78, 77),
(3,'猪悟能', 88, 98.5, 90),
(4,'曹孟德', 82, 84, 67),
(5,'刘玄德', 55.5, 85, 45),
(6,'孙权', 70, 73, 78.5),
(7,'宋公明', 75, 65, 30),
(8,'唐三藏', 67, 98, 56);

select * from exam_result;
select id,name,chinese from exam_result;
select id,chinese+math from exam_result;
select id,chinese+math+english as 总分 from exam_result;

SELECT math from exam_result order by math asc;





CREATE TABLE student(
   id INT PRIMARY KEY AUTO_INCREMENT，
   name VARCHAR(20) UNIQUE,
   sex VARCHAR(1) default '保密' NOT NULL ,
   age INT NOT NULL default 0,
   tall INT default 0 NOT NULL ,
   weight INT default 0 NOT NULL ,
);





insert into classes(name,'desc') values
('计算机系2019级1班','学习了计算机原理、c和java语言、数据结构和算法'),
('中文系2019级3班','学习了中国传统文学');

insert into student(sn,name,qq_mall,classes_id) values
('09982','黑旋风','xuan@qq.com',1),
('00835','菩提',null,1);

insert into course(name) values
('java'),('中国传统文化'),('计算机原理'),('语文'),('高阶数学'),('英文');
































