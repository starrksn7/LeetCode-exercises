# Write your MySQL query statement below
SELECT p.product_id, product_name 
FROM Product p
JOIN Sales s ON s.product_id = p.product_id
GROUP BY p.product_id
HAVING MIN(sale_date) >= '2019-01-01' AND MAX(sale_date) <= '2019-03-31';
