package LeetCode;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicate(int[] num){
//        Arrays.sort(num);

        int j = 1; //Constraints 1 <= nums.length <= 3 * 104

        for(int i = 1; i < num.length; i++){
            if(num[i] != num[i-1]){
                num[j] = num[i];
                j++;
            }
        }
        return j;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,5,5,7,3,4};
        System.out.println(removeDuplicate(nums));
    }
}
