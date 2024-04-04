# Write your MySQL query statement below
SELECT unique_id, name
FROM Employees
LEFT JOIN EmployeeUNI
ON if (Employees.id = EmployeeUNI.id, Employees.id, null)