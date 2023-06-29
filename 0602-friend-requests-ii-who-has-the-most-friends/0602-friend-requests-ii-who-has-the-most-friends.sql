# Write your MySQL query statement below
SELECT DISTINCT id, COUNT(DISTINCT friend) AS num 
FROM 
(SELECT requester_id AS id, accepter_id AS friend
FROM RequestAccepted
UNION
SELECT accepter_id AS id, requester_id AS friend
FROM RequestAccepted) r
GROUP BY id
ORDER BY num DESC LIMIT 1;
