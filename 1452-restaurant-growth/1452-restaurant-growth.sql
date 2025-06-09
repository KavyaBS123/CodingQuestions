# Write your MySQL query statement below
SELECT
a.visited_on,
SUM(b.amount) AS amount,
ROUND(SUM(b.amount) / 7 , 2) AS average_amount
FROM(
    SELECT DISTINCT visited_on
    FROM Customer
) a
JOIN Customer b
ON b.visited_on BETWEEN DATE_SUB(a.visited_on, INTERVAL 6 DAY) AND a.visited_on
GROUP BY a.visited_on
HAVING COUNT(DISTINCT b.visited_on)=7
ORDER BY a.visited_on