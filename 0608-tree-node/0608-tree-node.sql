# Write your MySQL query statement below
SELECT id, 'Root' AS type FROM tree WHERE p_id IS null
UNION
SELECT id, 'Inner' AS type FROM tree 
WHERE id IN (SELECT DISTINCT p_id FROM tree 
             WHERE p_id IS NOT null) 
             AND p_id IS NOT null
UNION
SELECT id, 'Leaf' AS type FROM tree
WHERE id NOT IN (SELECT DISTINCT p_id FROM tree
                WHERE p_id IS NOT null)
                AND p_id IS NOT null;
                