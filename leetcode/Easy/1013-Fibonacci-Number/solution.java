// LeetCode Problem: Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int fib(int n) {
    if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int num1=0;
        int num2=1;
        int sum=0;
        for(int i=n; i>1; i--){
            sum=num1+num2;
            int temp=num1;
            num1=num2;
            num2=sum;
        }
        return sum;
    }
}    