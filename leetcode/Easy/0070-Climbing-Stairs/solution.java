// LeetCode Problem: Climbing Stairs
// Link: https://leetcode.com/problems/climbing-stairs/
// Difficulty: Easy
// Language: java

class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int num1=1;
        int num2=2;
        int sum=0;
        for(int i=n; i>2; i--){
            sum=num1+num2;
            int temp=num1;
            num1=num2;
            num2=sum;
        }
        return sum;
    }
}