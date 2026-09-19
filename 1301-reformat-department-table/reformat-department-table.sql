# Write your MySQL query statement below
select id,
max(case when month="Jan" then Revenue end)as Jan_Revenue,
max(case when month="Feb" then Revenue end)as Feb_Revenue,
max(case when month="Mar" then Revenue end)as Mar_Revenue,
max(case when month="Apr" then Revenue end)as Apr_Revenue,
max(case when month="May" then Revenue end)as May_Revenue,
max(case when month="Jun" then Revenue end)as Jun_Revenue,
max(case when month="Jul" then Revenue end)as Jul_Revenue,
max(case when month="Aug" then Revenue end)as Aug_Revenue,
max(case when month="Sep" then Revenue end)as Sep_Revenue,
max(case when month="Oct" then Revenue end)as Oct_Revenue,
max(case when month="Nov" then Revenue end)as Nov_Revenue,
max(case when month="Dec" then Revenue end)as Dec_Revenue
from Department group by id