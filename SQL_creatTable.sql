DROP TABLE IF EXISTS student;
CREATE TABLE student(
  id INT NOT NULL PRIMARY KEY,
  sn INT UNIQUE,
  NAME VARCHAR(20) DEFAULT 'unkown',
  qq_mail VARCHAR(20)
);




DROP TABLE IF EXISTS classes;
CREATE TABLE classes(
  id INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(20),
  `desc` VARCHAR(100)
);

DROP TABLE IF EXISTS student;
CREATE TABLE student(
  id INT PRIMARY KEY AUTO_INCREMENT,
  sn INT UNIQUE,
  NAME VARCHAR(20) DEFAULT 'unkown',
  qq_mail VARCHAR(20),
  classes_id INT,
  FOREIGN KEY(classes_id) REFERENCES classes(id)
);


DROP TABLE IF EXISTS course; CREATE TABLE course ( id INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(20) );

DROP TABLE IF EXISTS score; CREATE TABLE score ( id INT PRIMARY KEY AUTO_INCREMENT, score DECIMAL(3, 1), student_id INT, course_id INT, FOREIGN KEY (student_id) REFERENCES student(id), FOREIGN KEY (course_id) REFERENCES course(id) );

-- 第一范式  数据库中所有字段值都不可分解
-- 第二范式  确保表中的每列都和主键相关
-- 第三范式  确保每列都和主键列直接相关，而不是间接相关

CREATE TABLE emp( 
   id INT PRIMARY KEY AUTO_INCREMENT, 
   NAME VARCHAR(20) NOT NULL, 
   role VARCHAR(20) NOT NULL, 
   salary NUMERIC(11,2) 
);
INSERT INTO emp(NAME, role, salary) VALUES 
('马云','服务员', 1000.20), 
('马化腾','游戏陪玩', 2000.99), 
('孙悟空','游戏角色', 999.11),
 ('猪无能','游戏角色', 333.5), 
 ('沙和尚','游戏角色', 700.33), 
 ('隔壁老王','董事长',12000.66);

SELECT role,MAX(salary),MIN(salary),AVG(salary)
    FROM emp GROUP BY role;

SELECT role,AVG(salary) FROM emp GROUP BY role
    HAVING AVG(salary)<1500;



INSERT INTO classes(NAME, `desc`) VALUES 
('计算机系2019级1班', '学习了计算机原理、C和Java语言、数据结构和算法'), 
('中文系2019级3班','学习了中国传统文学'), 
('自动化2019级5班','学习了机械自动化'); 

INSERT INTO student(sn, NAME, qq_mail, classes_id) VALUES 
('09982','黑旋风李逵','xuanfeng@qq.com',1), 
('00835','菩提老祖',NULL,1), 
('00391','白素贞',NULL,1),
('00031','许仙','xuxian@qq.com',1), 
('00054','不想毕业',NULL,1), 
('51234','好好说话','say@qq.com',2), 
('83223','tellme',NULL,2), 
('09527','老外学中文','foreigner@qq.com',2); 

INSERT INTO course(NAME) VALUES 
('Java'),('中国传统文化'),('计算机原理'),('语文'),('高阶数学'),('英文'); 

INSERT INTO score(score, student_id, course_id) VALUES 
-- 黑旋风李逵 
(70.5, 1, 1),(98.5, 1, 3),(33, 1, 5),(98, 1, 6), 
-- 菩提老祖 
(60, 2, 1),(59.5, 2, 5), 
-- 白素贞 
(33, 3, 1),(68, 3, 3),(99, 3, 5), 
-- 许仙 
(67, 4, 1),(23, 4, 3),(56, 4, 5),(72, 4, 6), 
-- 不想毕业 
(81, 5, 1),(37, 5, 5),
-- 好好说话 
(56, 6, 2),(43, 6, 4),(79, 6, 6), 
-- tellme 
(80, 7, 2),(92, 7, 6);



SELECT *FROM student stu JOIN score sco ON stu.id=sco.student_id;


SELECT * FROM student stu LEFT JOIN score sco ON stu.id=sco.student_id;

SELECT id,NAME FROM course WHERE NAME='java' OR NAME='计算机原理';

SELECT * FROM student WHERE classes_id=(
  SELECT classes_id FROM student WHERE NAME='不想毕业');

DROP DATABASE IF EXISTS usermanger;
CREATE DATABASE IF NOT EXISTS usermanger CHARACTER SET utf8;
USE usermanger;

DROP TABLE IF EXISTS usermessage;
CREATE TABLE usermessage(
  id INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(60),
  username VARCHAR(60) DEFAULT 'bit',
  PASSWORD VARCHAR(60) DEFAULT '123456',
  gender VARCHAR(4),
  age INT,
  address VARCHAR(90),
  qq VARCHAR(20),
  email VARCHAR(30)
);

CREATE TABLE userinfo(
   id INT PRIMARY KEY AUTO_INCREMENT,
   NAME VARCHAR(30),
   passwd CHAR(10),
   phone CHAR(11),
   email VARCHAR(30)
);

CREATE TABLE petinfo(
  id INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(30),
  picture CHAR(30),
  sort CHAR(10),   -- 种类 猫、狗等
  breed VARCHAR(40), -- 品种
  price INT,
  DESCRIBE VARCHAR(30),
  flag INT -- 在售，买走为0，否则为1
);

CREATE TABLE cartinfo(
  uid INT PRIMARY KEY,  -- 用户ID
  pid INT -- 宠物ID
);

CREATE TABLE historyinfo(
   uid INT PRIMARY KEY,
   pid INT,
   TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);














