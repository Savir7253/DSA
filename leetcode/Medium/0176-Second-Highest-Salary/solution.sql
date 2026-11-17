-- LeetCode Problem: Second Highest Salary
-- Link: https://leetcode.com/problems/second-highest-salary/
-- Difficulty: Medium
-- Language: postgresql

-- Write your PostgreSQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee);