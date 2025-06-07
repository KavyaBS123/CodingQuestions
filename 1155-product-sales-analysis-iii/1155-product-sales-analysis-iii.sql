# Write your MySQL query statement below
SELECT product_id, year as first_year, quantity, price
FROM Sales
WHERE(product_id , year) in (select product_id,min(year) from Sales group by product_id)