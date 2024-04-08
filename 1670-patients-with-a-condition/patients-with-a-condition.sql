# Write your MySQL query statement below
SELECT patient_id, patient_name, conditions FROM Patients 
Where conditions Like 'DIAB1%' OR conditions  Like '% DIAB1%';