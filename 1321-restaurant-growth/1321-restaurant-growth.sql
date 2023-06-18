# Write your MySQL query statement below
SELECT DISTINCT visited_on, amount, round(amount/7, 2) AS average_amount
FROM (SELECT visited_on, 
     SUM(amount) OVER (ORDER BY visited_on RANGE BETWEEN INTERVAL 6 day preceding AND CURRENT ROW) as amount,
     dense_rank() OVER (ORDER BY visited_on) AS rk 
     FROM customer) as t
WHERE rk >= 7;

