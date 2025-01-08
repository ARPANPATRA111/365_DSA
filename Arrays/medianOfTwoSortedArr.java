/*LeetCode link:- https://leetcode.com/problems/median-of-two-sorted-arrays/ */

public class medianOfTwoSortedArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[] = new int[n+m];
        int a=0;
        int b=0;
        for(int i=0;i<n+m;i++){
            if(a == n){
                arr[i] = nums2[b];
                b++;
            }
            else if(b == m){
                arr[i] = nums1[a];
                a++;
            }
            else if(nums1[a] < nums2[b]){
                arr[i] = nums1[a];
                a++;
            }
            else{
                arr[i] = nums2[b];
                b++;
            }
        }
        int mid = arr.length/2;
        if(arr.length % 2 == 0){
            return (arr[mid-1] + arr[mid]) / 2.0;
        }
        else{
            return arr[mid];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,8,9};
        int[] nums2 = {2,5,6,8};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
