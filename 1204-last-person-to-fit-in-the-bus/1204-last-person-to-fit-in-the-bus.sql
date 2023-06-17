# Write your MySQL query statement below
SELECT person_name
FROM (SELECT person_name, SUM(weight) OVER(ORDER BY turn) AS gross_weight FROM queue) a
WHERE gross_weight <= 1000
ORDER BY gross_weight DESC LIMIT 1;