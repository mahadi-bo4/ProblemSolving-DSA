package LeetCode;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int j = 0;   //Constraints 0 <= nums.length <= 100
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,2,3,3};
        System.out.println(nums.length);
        System.out.println(removeElement(nums,3));
    }
}
