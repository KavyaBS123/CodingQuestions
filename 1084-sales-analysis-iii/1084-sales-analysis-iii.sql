# Write your MySQL query statement below
SELECT DISTINCT p.product_id ,p.product_name
FROM Product p
JOIN
Sales s
ON p.product_id=s.product_id 
WHERE sale_date BETWEEN '2019-01-01' AND '2019-03-31'
AND NOT EXISTS (
    SELECT 1 
    FROM Sales s2
    WHERE s2.product_id=p.product_id
    AND s2.sale_date NOT BETWEEN '2019-01-01' AND '2019-03-31'
);