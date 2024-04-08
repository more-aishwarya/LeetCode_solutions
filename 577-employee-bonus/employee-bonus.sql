# Write your MySQL query statement below
Select e.name , b.bonus  FROM Employee e LEFT OUTER JOIN Bonus b ON e.empId = b.empId where b.bonus < 1000 OR bonus IS  NULL