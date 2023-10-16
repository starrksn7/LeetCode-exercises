# Write your MySQL query statement below
SELECT employee.name as Employee FROM Employee employee
JOIN Employee employer ON employee.managerId = employer.id
WHERE employee.salary > employer.salary;
