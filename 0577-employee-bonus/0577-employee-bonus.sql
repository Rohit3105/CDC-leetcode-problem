SELECT 
p.name,
b.bonus
FROM Employee P
LEFT JOIN Bonus b
ON p.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;