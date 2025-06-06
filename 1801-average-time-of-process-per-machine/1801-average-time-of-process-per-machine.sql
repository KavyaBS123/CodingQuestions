# Write your MySQL query statement below
SELECT 
start_time.machine_id, 
ROUND(AVG(end_time.timestamp-start_time.timestamp),3) AS processing_time
FROM 
Activity AS start_time
JOIN 
Activity AS end_time
ON
start_time.machine_id=end_time.machine_id
AND start_time.process_id=end_time.process_id
AND start_time.activity_type='start'
AND end_time.activity_type='end'
GROUP BY
start_time.machine_id