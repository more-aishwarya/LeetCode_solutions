# Write your MySQL query statement below
DELETE  p1 FROM Person p1,
Person p2
Where
p1.Email=p2.Email and p1.Id > p2.Id