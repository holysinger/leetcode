```mysql
select E.SecondHighestSalary
from ( SELECT RANK() OVER (ORDER BY Salary DESC) r, Salary SecondHighestSalary
FROM Employee) E
where E.r = 2
;
```
