/*LeetCode link:- https://leetcode.com/problems/sum-multiples/description/ */

package Loops;

public class sumMultiples {
    public static int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i % 5 == 0 || i % 7 == 0 || i % 3 == 0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumOfMultiples(n));
    }
}
