package DSA.array;

import java.util.ArrayList;

public class FindDuplicates {

    /*Given an array of n elements that contains elements from 0 to n-1,
    with any of these numbers appearing any number of times.
    Find these repeating numbers in O(n) and use only constant memory space.
    Note: The repeating element should be printed only once.
     */

    public static ArrayList<Integer> findDulicates(int[] nums, int n){

        int dupli;
        ArrayList<Integer> dulicates = new ArrayList<>();

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n-1; j++){
                if(nums[i] == nums[j]){
                    dupli = nums[i];
                    dulicates.add(dupli);
                }
            }
        }
        return dulicates;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 6, 3, 1, 3, 6, 6 };
        int n = nums.length;

        System.out.println(findDulicates(nums,n));

    }

}
