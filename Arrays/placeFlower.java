/*LeetCode link:- https://leetcode.com/problems/can-place-flowers/description/ */

public class placeFlower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (flowerbed.length == 0) return false;
        if (flowerbed.length == 1) return flowerbed[0] == 0 && n <= 1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean prevEmpty = i == 0 || flowerbed[i - 1] == 0;
                boolean nextEmpty = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                if (prevEmpty && nextEmpty) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) return true;
                }
            }
        }
        return count >= n;
    }
    
    public static void main(String[] args) {
        int flowers[]= {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowers, 1));
    }
}
