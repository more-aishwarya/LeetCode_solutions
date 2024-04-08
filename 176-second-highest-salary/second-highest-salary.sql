# Write your MySQL query statement below
SELECT 
(SELECT DISTINCT Salary FROM Employee 
ORDER By salary DESC
Limit 1 offset 1) AS SecondHighestSalary;
