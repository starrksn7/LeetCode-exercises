# Write your MySQL query statement below
SELECT DATE_FORMAT(trans_date, "%Y-%m") as month, country, 
COUNT(id) AS trans_count, 
SUM(CASE WHEN state = 'approved' THEN 1 ELSE 0 END) approved_count,
SUM(amount) AS trans_total_amount,
SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) approved_total_amount
FROM Transactions
GROUP BY country, month;

