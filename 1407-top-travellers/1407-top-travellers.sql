# Write your MySQL query statement below
SELECT u.name, IFNULL(SUM(distance), 0) AS travelled_distance
FROM Users u
LEFT JOIN Rides r ON r.user_id = u.id
GROUP BY r.user_id
ORDER BY 2 DESC, 1 ASC;