/* Formatted on 2025/06/05 오전 9:55:00 (QP5 v5.336) */
DESC emp;                                              -- 주석 emp 테이블 구조 보기

SELECT * FROM emp;                                                                                           -- 테이블 내용 보기
DESC dept;                                                   -- dept 테이블 구조 보기

SELECT * FROM dept;                                                                                                -- 테이블 내용 보기
DESC bonus;                                                        -- bonus 테이블 구조 보기

SELECT * FROM bonus;                                                                                                     -- 테이블 내용 보기
DESC salgrade;                                                                       -- salgrade 테이블 구조 보기

SELECT * FROM salgrade;                                                                                                                    -- 테이블 내용 보기

SELECT empno, ename, deptno FROM emp;                                                                                                                                                              -- 열을 선택하여 출력

SELECT DISTINCT deptno
  FROM emp;                                                      -- 열을 선택하되 중복을 제거

SELECT deptno FROM emp;                                                                                                      -- 열을 선택하되 중복 제거 X

SELECT DISTINCT job, deptno
  FROM emp;

SELECT ename, sal, sal * 10, comm FROM emp;

--                 이런 식으로 자체연산가능

SELECT ename "사원이름", sal FROM emp;

--          이렇게 내가 열의 이름을 별칭으로 재정의 가능

SELECT ename AS 사원이름, sal FROM emp;

--   따옴표보다는 as가 선호됨

  SELECT *
    FROM emp
ORDER BY sal;

-- sal 기준으로 오름차순으로 정렬

  SELECT *
    FROM emp
ORDER BY empno;

-- empno 사원번호 기준으로 정렬

-- 기준이 오름차순이므로 내림차순은 다름

  SELECT *
    FROM emp
ORDER BY sal DESC;                                                                                                             -- 뒤에 desc 붙이면 내림차순

-- 오름과 내림을 둘 다 하고 싶다면

  SELECT *
    FROM emp
ORDER BY sal DESC, empno ASC;

SELECT *
  FROM emp
 WHERE sal = 800;

SELECT *
  FROM emp
 WHERE empno = 7782;

-- 조건에 맞는 행렬을 찾을 때 where 사용

-- 여러 가지의 조건을 사용할 때 And/or

SELECT *
  FROM emp
 WHERE deptno = 30 AND job = 'SALESMAN';

-- 연산자도 사용 가능

SELECT *
  FROM emp
 WHERE sal >= 3000;

SELECT *
  FROM emp
 WHERE sal != 3000;

SELECT *
  FROM emp
 WHERE NOT sal = 3000;

SELECT *
  FROM emp
 WHERE job IN ('CLERK', 'SALESMAN');

-- 사잇값도 가능

SELECT *
  FROM emp
 WHERE sal >= 1000 AND sal <= 2000;

  SELECT *
    FROM emp
   WHERE sal BETWEEN 1000 AND 2000
ORDER BY sal ASC;

-- 문자열 조회

SELECT *
  FROM emp
 WHERE ename LIKE 'S%';

SELECT *
  FROM emp
 WHERE ename LIKE '_L%';

SELECT *
  FROM emp
 WHERE comm IS NULL;

SELECT *
  FROM emp
 WHERE comm IS NOT NULL;

-- null값을 찾으려면 =가 아니라 is 사용

CREATE TABLE dept_temp
AS
    SELECT * FROM dept;

-- drop table 테이블 이름

INSERT INTO dept_temp (deptno, dname, loc)
     VALUES (50, 'DATABASE', 'SEOUL');

SELECT * FROM dept_temp;

SELECT empno,
       ename,
       sal,
       deptno
  FROM emp
 WHERE deptno = 10
UNION
SELECT empno,
       ename,
       sal,
       deptno
  FROM emp
 WHERE deptno = 20;

-- union은 집합 개념임 / 다만 출력 열의 자료형 타입이 같아야 함

SELECT empno, ename, sal, deptno FROM emp
MINUS
SELECT empno,
       ename,
       sal,
       deptno
  FROM emp
 WHERE deptno = 10;                                                                                               -- minus: 차집합

SELECT empno, ename, sal, deptno FROM emp
INTERSECT
SELECT empno,
       ename,
       sal,
       deptno
  FROM emp
 WHERE deptno = 10;                                                                                               -- intersect: 교집합

CREATE TABLE dept_temp
AS
    SELECT * FROM dept;

-- drop table 테이블 이름

INSERT INTO dept_temp (deptno, dname, loc)
     VALUES (50, 'DATABASE', 'SEOUL');

SELECT * FROM dept_temp;

SELECT empno,
       ename,
       sal,
       deptno
  FROM emp
 WHERE deptno = 10
UNION
SELECT empno,
       ename,
       sal,
       deptno
  FROM emp
 WHERE deptno = 20;

-- union은 집합 개념임 / 다만 출력 열의 자료형 타입이 같아야 함

SELECT empno, ename, sal, deptno FROM emp
MINUS
SELECT empno,
       ename,
       sal,
       deptno
  FROM emp
 WHERE deptno = 10;                                                                                               -- minus: 차집합

SELECT empno, ename, sal, deptno FROM emp
INTERSECT
SELECT empno,
       ename,
       sal,
       deptno
  FROM emp
 WHERE deptno = 10;                                                                                               -- intersect: 교집합

CREATE TABLE emp_ddl
(
    empno       NUMBER (4),
    ename       VARCHAR2 (10),
    job         VARCHAR2 (9),
    mgr         NUMBER (4),
    hiredate    DATE,
    sal         NUMBER (7, 2),
    comm        NUMBER (7, 2),
    deptno      NUMBER (2)
);

 DESC demp_ddl;

CREATE TABLE dept_ddl
AS
    SELECT * FROM dept;

 DESC dept_ddl;

SELECT * FROM dept_ddl;

CREATE TABLE emp_ddl_30
AS
    SELECT *
      FROM emp
     WHERE deptno = 30;

SELECT * FROM emp_ddl_30;

CREATE TABLE empdept_ddl
AS
    SELECT e.empno,
           e.ename,
           e.job,
           e.mgr,
           e.hiradate,
           e.sal,
           e.comm,
           d.deptno,
           d.dname,
           d.loc
      FROM emp e, dept d
     WHERE 1 != 1;

SELECT * FROM empdept_ddl;

CREATE TABLE emp_alter
AS
    SELECT * FROM emp_alter;

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
    ADD hp VARCHAR2 (20);

ALTER TABLE emp_alter
    ADD hp VARCHAR2 (20);

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
    RENAME COLUMN hp TO tel;

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
    MODIFY empno NUMBER (5);

 DESC emp_alter;

ALTER TABLE emp_alter
    DROP COLUMN tel;

SELECT * FROM semp_alter;

RENAME emp_alter TO emp_rename;

 DESC emp_alter;

SELECT * FROM emp_rename;

TRUNCATE TABLE emp_rename;

SELECT * FROM emp_rename;

DROP TABLE emp_rename;
 DESC emp_rename;

SELECT * FROM dba_tables;

select * from ALL_USERS WHERE USERNAME = 'hsxa';
select * from DBA_USERS WHERE USERNAME = 'hsxa';
select * from DBA_OBJECTS WHERE OWNER = 'hsxa';

select * from ALL_USERS;
