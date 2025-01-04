/*LeetCode link:- https://leetcode.com/problems/trapping-rain-water/ */

public class trappingRainwater {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, ans = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                ans += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                ans += rightMax - height[right];    
                right--;
            }
            
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
