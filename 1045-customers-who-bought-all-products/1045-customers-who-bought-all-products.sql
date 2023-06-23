# Write your MySQL query statement below
SELECT customer_id FROM Customer
JOIN Product ON Product.product_key = Customer.product_key
GROUP BY customer_id
HAVING COUNT(DISTINCT Customer.product_key) = (SELECT COUNT(*) FROM Product);


