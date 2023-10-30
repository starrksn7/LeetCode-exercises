# Write your MySQL query statement below
SELECT d.name AS department, e1.name AS employee, e1.salary
FROM Employee e1
JOIN Employee e2 ON e2.departmentId = e1.departmentId AND e1.salary <= e2.salary 
JOIN Department d ON d.id = e2.departmentId
GROUP BY 1, 2, 3
HAVING COUNT(DISTINCT(e2.salary)) <= 3;