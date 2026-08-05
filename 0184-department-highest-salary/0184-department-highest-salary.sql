WITH RANKSALARIES AS(
    SELECT
    d.name As Department,
    e.name AS Employee,
    e.salary AS Salary,
    DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS rnk
    FROM Employee e
    JOIN Department d
    ON e.departmentId=d.id

)
SELECT Department,Employee,Salary
FROM RANKSALARIES
WHERE rnk=1;