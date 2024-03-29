package LeetCode;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap<>();

        for (int i = 0; i< nums.length; i++){

            int result = target - nums[i];
            if(map.containsKey(result)){
               return new int[]{map.get(result),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;


        for(int n : twoSum(nums,target)){
            System.out.println(n);
        }
    }

}


