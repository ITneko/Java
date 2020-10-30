--DDL(정의어)
--CREATE, ALTER, DROP

--DML(조작어)
--SELECT, INSERT, UPDATE, DELETE

--TCL(트랜잭션)
--COMMIT, ROLLBACK, SAVEPOINT

--DCL(제어)
--GRANT, REVOKE

select * from tab;

select * from employee;

select count(*) as tt from employee;

select ename, salary, job, dno, nvl(commission,0) as 보너스, salary*12+nvl(commission,0) as 연봉 from employee;