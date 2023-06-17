# Write your MySQL query statement below
SELECT (CASE
        WHEN mod(id, 2) != 0 AND records != id THEN id + 1
        WHEN mod(id, 2) != 0 AND records = id THEN id
        ELSE id - 1
        END) AS id, student
FROM seat, (SELECT count(*) AS records FROM seat) AS seat_records
ORDER BY id ASC;
