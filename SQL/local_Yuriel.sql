-- SQL Developer������ �ּ��� hyphen x 2

-- Q. ������̺�(S_EMP)�� ��� �����͸� ����϶�.
SELECT
    *
FROM
    s_emp; -- Ctrl+Enter ġ�� Ŀ�� �ִ� ��ɹ� ���� (���� ����� ���̶���Ʈ �� �κ�)
                     -- F5�� �����ؾ� �Ѵ�!! ��� ��ɹ��� �ڵ����� �����ϱ� ������, ������ �ʴ� ��ɹ��� �߸� ����� �� �ִ�!
                     -- �� �� commit�� ���� rollback�� �� ����!!

-- Q. �ڱ��� ������ ����(TITLE)�� ������� �����϶�.
UPDATE s_emp
SET
    title = '���'
WHERE
    id = 1; -- ���� �࿡ �и���Ų ������, �Ϻθ� �����Ͽ� ������ ���� �ֱ� �����̴�.
                --> semi-colon�� ���� �и��ϴ� ������, �Ϻθ� �����ص� semi-colon�� ���� �� �ް� �ϱ� ���ؼ��̴�.
            -- eclipse�� �Ȱ��� ���⼭�� Ctrl + Slash �ϸ� �ּ�ó�� �ȴ�

DELETE FROM s_emp;

SELECT
    name   �̸�,
    start_date,
    salary * 18 ����
FROM
    s_emp; -- name ��ſ� ���� "�̸�"�� �����ϰ�, salary*18 ��� ���� "����"�� ������ ���̴�

SELECT
    name,
    title
FROM
    s_emp;

SELECT
    name || ' ' || title
FROM
    s_emp;

-- Q. �������� ��å(title)�� �ߺ����� ����϶�.
SELECT DISTINCT
    title
FROM
    s_emp;
--Select distinct title, name from s_emp; --> �̸��� ��å�� �� �� ���� ��츸 �ߺ����� ����!

SELECT DISTINCT
    title
FROM
    s_emp
ORDER BY
    title DESC;

-- Q. ��å(title)�� ����� ����� ����϶�.
SELECT
    *
FROM
    s_emp
WHERE
    title = '���'
    AND salary BETWEEN 1000 AND 2000 -- between�� ����ϸ� ��谪�� ���Եȴ� --> 1000 <= salary <= 2000
    ;

-- Q. �������� ��� �μ��� �ߺ����� ����ϰ� �μ��� ������������ �����϶�.
SELECT DISTINCT
    dept_id
FROM
    s_emp
ORDER BY
    1;

-- Q. �μ� 101, 102�� ���� �������� ����϶�.
SELECT
    *
FROM
    s_emp
WHERE
    dept_id IN (
        101,
        102
    )
ORDER BY
    dept_id;

-- Q. 
SELECT
    title,
    length(title),
    lengthb(title)
FROM
    s_emp;

SELECT
    add_months(SYSDATE, - 2)
FROM
    dual;

SELECT
    round(SYSDATE, 'year')
FROM
    dual;

SELECT
    trunc(SYSDATE, 'month')
FROM
    dual;

SELECT
    TO_CHAR(SYSDATE + 4, 'dd / month, year')
FROM
    dual; -- sysdate�� ���ڷ� ����Ǵµ�, �װ��� to_char�� �̿��ؼ� ���ڿ��� �ٲ۴�

-- Q. ��ü ������ �� ������ �����.

SELECT
    COUNT(*)
FROM
    s_emp;

-- Q. ��ü ������ ��� ������ ����϶�.

SELECT
    AVG(salary) AS average_salary
FROM
    s_emp;

SELECT
    dept_id,
    round(AVG(salary), 2)
FROM
    s_emp
GROUP BY
    dept_id
ORDER BY
    2 DESC -- Select�� ����, dept_id & round(avg(salary),2) �� 2��°�� ��������!
                -- BUT Select���� �����̳� �� ������ �ٲ� �� �������� ���� ��� ����� �÷����� �ۼ��ϴ� ���� ����!
    ;

SELECT
    dept_id,
    name,
    salary
FROM
    s_emp
ORDER BY
    1
--Group by dept_id -- dept_id�� �ߺ��Ǵ� ������� �ϳ��� dept_id �׷쿡 ��´�
                   -- ��������! �ֳ��ϸ� name�� �������� �������ε� �̰��� �ϳ��� �׷����� ���� �� ���� �����̴� --> i.e. dept_id 113���� 5���� �ִµ�, �׷����� ������ ���� �̸��� �;��ϳ�?
                   -- "Group by"�� ����Ϸ��� Select���� �׷��Լ� OR �׷��� ���� �;��Ѵ� --> nameó�� �׷��� �ƴ� ���� �� �� ����
    ;

-- Q. �μ��� ��� ���� ����϶�.

SELECT
    dept_id,
    COUNT(*)
FROM
    s_emp --> ��ü ��� ��
GROUP BY
    dept_id
ORDER BY
    1;

-- Q. �� ����(region_id)���� �� ���� �μ��� �ִ��� ����϶�.

SELECT
    region_id,
    COUNT(*)
FROM
    s_dept
GROUP BY
    region_id
ORDER BY
    1;

-- Q. �� �μ�(dept_id)���� ��ձ޿��� ���ϵ� �޿��� 2000 �̻��� �μ��� ����϶�.

SELECT
    dept_id,
    round(AVG(salary), 2) ��ձ޿�
FROM
    s_emp
GROUP BY
    dept_id
HAVING
    AVG(salary) >= 2000 -- �׷��Լ��� ���� ������ "where"�� �ƴ϶� "having"�� ����ؼ� ��Ÿ����
                           -- Having���� Group by �� �ڿ� �;� �Ѵ�
ORDER BY
    2 DESC;

-- Having�� - ���� 7
-- Q. title���� salary�� ������ ���ϵ�, '����'�� ����� �����ϰ�, sum(salary)�� 8000 �̻��� title�� ��Ÿ����, sum(salary)�� �������� �϶�.

SELECT
    title,
    SUM(salary)
FROM
    s_emp
WHERE
    title NOT LIKE '%����' -- '%' ���Խ��� '*'�� ���� --> ��(��)�� 0�� �̻� �ٸ� ���ڰ� ���� �͵� '����'�� ���� ���� --> ex) '%����'���� �ϸ� ����, �λ����, ��ȹ���� ���� ��� ��´�
GROUP BY
    title
HAVING
    SUM(salary) >= 8000 -- �׷��Լ��� �����̴ϱ� Having���� �ۼ�
ORDER BY
    2 DESC;

-- Q. dept_id���� title�� '���'�� ��쿡�� avg(salary)�� ���϶�.

SELECT
    dept_id,
    AVG(salary)
FROM
    s_emp
WHERE
    title = '���' -- �׷��Լ��� ������ �ƴϴϱ� Where���� �ۼ�
GROUP BY
    title,
    dept_id
ORDER BY
    2 DESC --> ������ �׻� �������� (�ٸ� �۾��� ��ģ �� �ϵ���)
    ;

-- Group�� Subgroup���� ����ȭ�ϱ�
-- Q. �� �μ�(s_emp.dept_id) ���� ��å(s_emp.title)���� �� ���� �ο��� �ִ��� ��Ÿ����.

SELECT
    dept_id,
    title,
    COUNT(*) AS people
FROM
    s_emp -- '*'�� ������ ���� ������ ������ �۾��Ѵ� <-> Ư�� �÷�(ex) name)�� ������ null�� �����ϰ� �۾��Ѵ�
GROUP BY
    dept_id,
    title
ORDER BY
    1 ASC,
    2 DESC;

-- Q. �� �μ�(s_emp.dept_id)���� ������ �� ���ִ��� ��Ÿ����.

SELECT
    dept_id,
    COUNT(*)
FROM
    s_emp
GROUP BY
    dept_id
ORDER BY
    1;

-- Q. �� �μ�(s_emp.dept_id)���� �޿�(s_emp.salary)�� �ּ� & �ִ븦 ���ϰ�, �ּ� & �ִ밡 ���� �μ�(s_emp.dept_id)�� ������ ������ �μ�(s_emp.dept_id)�� ��Ÿ����.

SELECT
    dept_id,
    MAX(salary),
    MIN(salary)
FROM
    s_emp
GROUP BY
    dept_id
HAVING
    MAX(salary) NOT LIKE MIN(salary) -- '<>'�� '!='�� ����
ORDER BY
    1;


-- Q. join ����ϱ�

SELECT
    s_dept.id,
    s_dept.name,
    s_region.name   AS region_name
FROM
    s_dept,
    s_region
WHERE
    s_dept.region_id = s_region.id;

-- Q. ���(s_emp) �μ�(s_dept) ����(s_region)�� ���� ����϶�
    -- ����̸� --> s_emp.name
    -- �μ��̸� --> s_dept.name
    -- �����̸� --> s_region.name

SELECT
    s_emp.name      AS name,
    s_dept.name     AS dept -- ��ǥ�� �տ� ���̴� ������, �̷��� �� ���� �ּ�ó���ص� �յ� ���� ���� ���� ����Ǳ� �����̴�.
    ,
    s_region.name   AS region -- <table name>.* --> �ش� ���̺��� ��� �÷��� select�Ѵ�.
FROM
    s_emp,
    s_dept,
    s_region
WHERE
    s_emp.dept_id = s_dept.id
    AND s_dept.region_id = s_region.id
ORDER BY
    s_region.name;
    
    
-- Q. ���� ������ �ٹ��ϴ� ����� ���� �� ����� �̸��� �ٹ��ϴ� �μ����� ��Ÿ����.
    -- �������� --> s_region.id = 1 = s_dept.region_id
    -- ����̸� --> s_emp.name
    -- �� ����� �μ��� --> s_dept.name, s_emp.dept_id

SELECT
    e.name   AS name,
    d.name   AS dept
FROM
    s_region r, -- s_region AS r�� ����
    s_emp e,
    s_dept d
WHERE
    r.name = '����Ư����'
    AND r.id = d.region_id
    AND d.id = e.dept_id
ORDER BY
    d.name;

-- NON-EQUIJOIN

SELECT
    e.name,
    e.salary,
    g.grade   �޿����
FROM
    s_emp e,
    salgrade g
WHERE
    e.salary BETWEEN g.losal AND g.hisal;
    
-- OUTER JOIN
-- ������� �������� ���� ���� ����� ����϶�.

SELECT
    e.name   �����,
    e.id,
    c.name   ����
FROM
    s_emp e,
    s_customer c
WHERE
    e.id (+) = c.sales_rep_id -- OUTER JOIN ���� ���ؼ��� "(+)"�� �� �ʿ� ���δ�. --> ���� ���� �ִ� �ʿ� ���δ� (�� ������ ���, ������� ���� �ʿ� ���δ�)
    AND e.name IS NULL        -- "(+)"�� ����ʿ� ���̴����� ���� ����� �ٸ���
ORDER BY
    2;
    
-- Q. �̹� ���� ������ �� ���ϱ�
    -- ���� ���� 1�Ͽ��� -1

SELECT
    last_day(SYSDATE)
FROM
    dual;

SELECT
    trunc(add_months(SYSDATE, 1), 'month') - 1
FROM
    dual;


-- 11�� 29�� �ǽ� ���� Ǯ��

-- Q. �� �μ�(dept_id)�� ��� �޿��� ����ؼ� ������.

SELECT
    dept_id,
    round(AVG(salary), 2)
FROM
    s_emp
GROUP BY
    dept_id
ORDER BY
    AVG(salary) DESC;

-- Q. �� �μ�(dept_id)���� ��å�� ����� �������� ��ձ޿��� ����϶�.

SELECT
    dept_id,
    round(AVG(salary), 2)
FROM
    s_emp
WHERE
    title = '���'
GROUP BY
    dept_id
ORDER BY
    AVG(salary) DESC;

-- Q. �� ����(region_id)���� �� ���� �μ��� �ִ����� ��Ÿ����.

SELECT
    region_id,
    COUNT(*) AS dept
FROM
    s_dept
GROUP BY
    region_id;

-- Q. �� �μ�(dept_id)���� ��� �޿�(salary)�� ���ϵ� ��� �޿��� 2000 �̻��� �μ��� ��Ÿ����.

SELECT
    dept_id,
    round(AVG(salary), 2)
FROM
    s_emp
GROUP BY
    dept_id
HAVING
    AVG(salary) >= 2000
ORDER BY
    AVG(salary) DESC;

-- Q.�� ��å(title)���� �޿��� ������ ���ϵ� ��å�� ������ ����� �����϶�.
    -- �� �޿������� 8000 �̻��� ��å�� ��Ÿ����, �޿����տ� ���� ������������ �����϶�.

SELECT
    title,
    SUM(salary)
FROM
    s_emp
GROUP BY
    title
HAVING title NOT LIKE '%����'
       AND SUM(salary) >= 8000
ORDER BY
    SUM(salary);
    
-- Q. �� �μ����� ��å�� ����� �����鸸 ��� �޿��� ���϶�.

SELECT
    dept_id,
    SUM(salary)
FROM
    s_emp
WHERE
    title = '���'
GROUP BY
    dept_id
ORDER BY
    SUM(salary);

-- Q. �� �μ� ������ �� ��å���� �� ���� �ο��� �ִ����� ��Ÿ����

SELECT
    dept_id,
    title,
    COUNT(*) AS people
FROM
    s_emp
GROUP BY
    dept_id,
    title
ORDER BY
    dept_id;

-- Q. �� �μ������� �� ���� ������ �ٹ��ϴ����� ��Ÿ����.

SELECT
    dept_id,
    COUNT(*) AS people
FROM
    s_emp
GROUP BY
    dept_id
ORDER BY
    dept_id;

-- Q. �� �μ����� �޿��� �ּҰ��� �ִ밪�� ��Ÿ����.
    -- ��, �ּҰ��� �ִ밪�� ���� �μ��� ������� ����.

SELECT
    dept_id,
    MIN(salary),
    MAX(salary)
FROM
    s_emp
GROUP BY
    dept_id
HAVING
    MIN(salary) != MAX(salary)
ORDER BY
    dept_id;

-- Q. OUTER JOIN�� �̿��Ͽ� ��� ���� �������� ���� ������ �ۼ�Ʈ�� ����϶�. -- ���߿�! ������ ����...
--Select count(e.name) from s_emp e, s_customer c
--Where e.id (+) = c.sales_rep_id
--Order by 1
--;

-- SELF JOIN

SELECT
    w.id     ���,
    w.name   �����,
    m.id     �μ�����,
    m.name   �μ����
FROM
    s_emp w,
    s_emp m
WHERE
    w.manager_id = m.id;

-- Q. ���� �� '������'�� ���� ��å(title)�� ������ ������ �̸��� ��å, �޿�, �μ���ȣ�� ��Ÿ���� (SELF JOIN ����϶�)

SELECT
    w.name,
    w.title,
    w.salary,
    w.dept_id
FROM
    s_emp w,
    s_emp s
WHERE
    s.title = w.title
    AND s.name = '������'
--    AND s.name <> w.name;
    AND w.name <> '������';

-- SET ������ ����ϱ�

SELECT
    name,
    dept_id,
    title
FROM
    s_emp
WHERE
    dept_id = 110
UNION
SELECT
    name,
    dept_id,
    title
FROM
    s_emp
WHERE
    dept_id = 113
ORDER BY
    2,
    3;
    
-- Q. ���� ��� ������ ��� ��� ������ ������ ����϶�.
    -- SELF JOIN����!
SELECT
    e1.title   AS ��å,
    AVG(e1.salary) AS ��տ���,
    e2.title   AS ��å,
    AVG(e2.salary) AS ��տ���
FROM
    s_emp e1,
    s_emp e2
WHERE
    e1.title = '����'
    AND e2.title = '���'
GROUP BY
    e1.title,
    e2.title;
    
    -- SUBQUERY & UNION ALL����!
Select title01 as ��å_1, salary01 as ��տ���_1, title02 as ��å_2, salary02 as ��տ���_2
From (SELECT
        title   AS title01,
        avg(salary) AS salary01
    FROM s_emp d
    WHERE title = '����'
    GROUP BY title),
    (SELECT
        title AS title02,
        avg(salary) AS salary02
    FROM s_emp e
    WHERE title = '���'
    GROUP BY title)
;

-- SUBQUERY --> subquery�κи� ���̶���Ʈ�ϰ� ctrl+enter ġ�� �� �κи� ������ �� �ִ�

SELECT
    name,
    title,
    dept_id
FROM
    s_emp
WHERE
    dept_id = (
        SELECT
            dept_id
        FROM
            s_emp
        WHERE
            name = '������'
    );

-- MULTI ROW SUBQUERY

SELECT
    name,
    dept_id
FROM
    s_emp
WHERE
    dept_id IN ( -- subquery�� select�� �����ϰ� query�� where�� ������ ��ġ�ؾ� �Ѵ�
        SELECT
            id
        FROM
            s_dept
        WHERE
            region_id = 3
    );

-- Having�������� SUBQUERY
-- Q. ���� ���� ��ձ޿��� �޴� ��å�� ���� �� ��å�� ��ձ޿��� ����϶�.

SELECT
    title,
    AVG(salary)
FROM
    s_emp
GROUP BY
    title
HAVING
    AVG(salary) = (
        SELECT
            MIN(AVG(salary))
            -- title, MIN(AVG(salary))�� ��������! --> title�� �ϳ��� min���� ��������⿡ �̹� groupȭ�� ������ --> GROUP BY�� �ʿ����
        FROM
            s_emp
        GROUP BY
            title
    );
    
-- Create�������� SUBQUERY

CREATE TABLE emp_113 (
    id,
    name,
    mailid,
    start_date
)
    AS
        SELECT
            id,
            name,
            mailid,
            start_date
        FROM
            s_emp
        WHERE
            dept_id = 113; -- "where 1 <> 1"��� �ϸ� �׻� false�̱⿡ �ƹ��͵� �� �����´�


-- DML�������� SUBQUERY

INSERT INTO emp_115 (
    id,
    name,
    mailid,
    start_date
)
    SELECT
        id,
        name,
        mailid,
        start_date
    FROM
        s_emp
    WHERE
        start_date < '16/01/01';

UPDATE s_emp
SET
    dept_id = (
        SELECT
            dept_id
        FROM
            s_emp
        WHERE
            title = '����'
    )
WHERE
    name = '��âȯ';

-- Dictionary ����

DESC dictionary;

SELECT
    *
FROM
    dictionary;

SELECT
    *
FROM
    dictionary
WHERE
    table_name LIKE 'USER%';

SELECT
    *
FROM
    user_objects
WHERE
    object_type = 'TABLE';

SELECT
    *
FROM
    user_constraints
WHERE
    table_name = 'S_EMP';
    
-- ���� (���� connect�� ����ڰ�) ���� ��� ���̺� ���

SELECT
    *
FROM
    tabs;

-- SEQUENCE �����ϱ�

CREATE SEQUENCE c_emp_id INCREMENT BY 1 START WITH 26 MAXVALUE 9999999 NOCACHE NOCYCLE;

-- SEQUENCE ���� Ȯ���ϱ�

SELECT
    sequence_name,
    min_value,
    max_value,
    increment_by,
    last_number
FROM
    user_sequences;
    
-- SEQUENCE ��� ����
    -- S_EMP ���̺��� �̸��� ȫ�浿, �޿��� 2000, �������� null�� �Է��ϵ�, ����� sequence���� ����϶�.

INSERT INTO s_emp (
    id,
    name,
    salary
) VALUES (
    c_emp_id.NEXTVAL,
    'ȫ�浿' || c_emp_id.NEXTVAL,
    2000
);

SELECT
    *
FROM
    s_emp;

INSERT INTO s_emp (
    id,
    name,
    salary
)
    SELECT
        c_emp_id.NEXTVAL,
        name || c_emp_id.NEXTVAL,
        salary
    FROM
        s_emp;

-- ���ؽ� idx �����

CREATE INDEX idx ON
    s_emp (
        name
    );
--�ε��� ������ �� Ȯ���ϱ�

SELECT
    *
FROM
    user_indexes;

-- �� �����

CREATE VIEW vw_emp AS
    SELECT
        e.name,
        e.mailid,
        d.name   AS dept_name
    FROM
        s_emp e,
        s_dept d
    WHERE
        e.dept_id = d.id;
-- �� ����

SELECT
    *
FROM
    vw_emp; -- �����ϸ� vw_emp�� query ����(���� �ۼ��� SQL ����)�� SUBQUERY�� ����ȴ�

SELECT
    *
FROM
    user_views;

-- SYNONYM �����
CREATE SYNONYM ve FOR vw_ewp;