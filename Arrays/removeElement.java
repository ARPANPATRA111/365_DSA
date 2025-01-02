/*LeetCode link:- https://leetcode.com/problems/remove-element/ */

public class removeElement {
    public static int removeElementt(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        System.out.println("total length is: "+removeElementt(arr,3));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
