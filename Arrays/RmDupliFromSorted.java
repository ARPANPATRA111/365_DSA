public class RmDupliFromSorted {
    public static int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }
        k++;
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("No. of unique elements : "+removeDuplicates(nums));
    }
}
