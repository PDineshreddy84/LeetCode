SELECT(
    SELECT DISTINCT salary 
FROM(
    SELECT 
        salary,
        ROW_NUMBER() OVER (ORDER BY salary DESC) as rnk
    FROM Employee
    ) AS RankedSalaries
    WHERE rnk=2
)AS SecondHighestSalary;