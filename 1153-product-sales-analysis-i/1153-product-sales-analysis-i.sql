# Write your MySQL query statement below
SELECT p.product_name as product_name , s.year as year, s.price as price
FROM Product p  join Sales s on s.product_id=p.product_id