SELECT a.name AS Employee
FROM Employee a
JOIN Employee m
ON a.managerId=m.id
WHERE a.salary>m.salary;
