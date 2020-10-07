DROP TABLE IF EXISTS student;
CREATE TABLE student(
  id INT,
  sn INT COMMENT '学号',
  NAME VARCHAR(20) COMMENT '姓名',
  qq_mail VARCHAR(20) COMMENT 'qq邮箱'
);

INSERT INTO student VALUES(100,10000,'唐三藏',NULL);
INSERT INTO student VALUES(101,10001,'孙悟空','11111');

INSERT INTO student(id,sn,NAME) VALUES
        (102,20001,'曹孟德'),
        (103,20002,'孙仲谋');


DROP TABLE IF EXISTS exam_result;
CREATE TABLE exam_result(
   id INT,
   NAME VARCHAR(20),
   chinese DECIMAL(3,1),
   math DECIMAL(3,1),
   english DECIMAL(3,1)
);


INSERT INTO exam_result(id,NAME,chinese,math,english) VALUES
    (1,'唐三藏', 67, 98, 56),
    (2,'孙悟空', 87.5, 78, 77),
    (3,'猪悟能', 88, 98.5, 90),
    (4,'曹孟德', 82, 84, 67),
    (5,'刘玄德', 55.5, 85, 45),
    (6,'孙权', 70, 73, 78.5),
    (7,'宋公明',75,65,30);

SELECT *FROM exam_result;

SELECT id,NAME,english FROM exam_result;

SELECT id,NAME,10 FROM exam_result;
SELECT id,NAME,english+10 FROM exam_result;
SELECT id,NAME,chinese+math+english FROM exam_result;

SELECT id,NAME,chinese+math+english 总分 FROM exam_result;

-- 去重
SELECT math FROM exam_result;
SELECT DISTINCT math FROM exam_result;


-- 排序  默认为升序ASC，降序为DESC
SELECT NAME,qq_mail FROM student ORDER BY qq_mail;
SELECT NAME,qq_mail FROM student ORDER BY qq_mail DESC;

SELECT NAME,chinese+english+math FROM exam_result
    ORDER BY chinese+english+math DESC;

SELECT NAME,chinese+english+math total FROM exam_result
    ORDER BY total DESC;

-- 数学降序，英语升序，语文升序
SELECT NAME,math,english,chinese FROM exam_result
    ORDER BY math DESC,english,chinese;


-- 英语不及格的同学及英语成绩
SELECT NAME,english FROM exam_result
     WHERE english<60;


-- 语文成绩高于英语成绩
SELECT NAME,chinese,english FROM exam_result
    WHERE chinese>english;
    
SELECT NAME,chinese+math+english 总分 FROM exam_result
   WHERE chinese+math+english<200;

SELECT * FROM exam_result WHERE chinese>80 AND english>80;
SELECT * FROM exam_result WHERE chinese>80 OR english>80;
SELECT *FROM exam_result WHERE
   chinese>80 OR math>70 AND english>70;

SELECT NAME,chinese FROM exam_result 
    WHERE chinese BETWEEN 80 AND 90;
    
 
SELECT NAME,math FROM exam_result 
     WHERE math IN(58,59,98,99);


SELECT NAME FROM exam_result
     WHERE NAME LIKE '孙_';
     
SELECT NAME FROM exam_result
     WHERE NAME LIKE '孙%';


SELECT NAME,qq_mail FROM student
  WHERE qq_mail IS NOT NULL;
  
SELECT NAME,qq_mail FROM student
     WHERE qq_mail IS NULL;

-- 第一页
SELECT id,NAME,math,english,chinese
   FROM exam_result ORDER BY id LIMIT 3 OFFSET 0;
-- 第二页
SELECT id,NAME,math,english,chinese
   FROM exam_result ORDER BY id LIMIT 3 OFFSET 3;

-- 第三页
SELECT id,NAME,math,english,chinese
   FROM exam_result ORDER BY id LIMIT 3 OFFSET 6;

UPDATE exam_result SET math=80 WHERE NAME='孙悟空';
UPDATE exam_result SET math=60,chinese=70
      WHERE NAME='曹孟德';

UPDATE exam_result SET chinese=chinese*2;
UPDATE exam_result SET marh=math+30
     ORDER BY chinese+math+english LIMIT 3;

DELETE FROM exam_result WHERE NAME='孙悟空';

DELETE FROM exam_result WHERE NAME='曹孟德';

DROP TABLE IF EXISTS for_delete;
CREATE TABLE for_delete(
   id INT,
   NAME VARCHAR(20)
);
INSERT INTO for_delete VALUES(1,'root');
INSERT INTO for_delete(NAME) VALUES('a'),('b'),('c');
DELETE FROM for_delete;

DROP TABLE for_delete;











