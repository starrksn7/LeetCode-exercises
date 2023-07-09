# Write your MySQL query statement below
SELECT d.name AS 'Department', e.name AS 'Employee', salary AS Salary
FROM Employee e 
JOIN Department d on e.departmentId = d.id
WHERE (e.departmentId, salary) IN (SELECT departmentId, MAX(salary)
                                  FROM Employee
                                  GROUP BY departmentId);