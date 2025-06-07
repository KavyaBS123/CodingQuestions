# Write your MySQL query statement below
SELECT (
    SELECT num from MyNumbers
    group by num having count(num)=1
    order by num desc limit 1)
    as num