/*LeetCode link:- https://leetcode.com/problems/richest-customer-wealth/ */

package Loops;

public class richCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int maxi=0;
            for(int j=0;j<accounts[i].length;j++){
                maxi+=accounts[i][j];
            }
            max=Math.max(max,maxi);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}
