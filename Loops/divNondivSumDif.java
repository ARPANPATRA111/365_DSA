/*LeetCode link:- https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/ */

package Loops;

public class divNondivSumDif {
    public static int differenceOfSums(int n, int m) {
        int num1 =0;
        int num2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num2+=i;
            }else{
                num1+=i;
            }
        }
        return num1-num2;
    }

    public static void main(String[] args) {
        int n = 3, m = 2;
        System.out.println(differenceOfSums(n, m));
    }
}
