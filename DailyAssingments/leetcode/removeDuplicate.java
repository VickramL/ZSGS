package leetcode;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,3,3,3,4,5};
        int length = nums.length-1;
        int i = 0;
        while (i<nums.length-2){
            if(nums[i]==nums[i+1]){
                if(nums[i+1]==nums[i+2]){
                    System.out.println("Equal Value");
                    for(int j = i+2;j<nums.length-1;j++){
                        nums[j] = nums[j+1];
                    }
                    length--;
                    i++;
                }
                else{
                    System.out.println("Not Equal value");
                    i = i+2;
                }
            }
            else{
                System.out.println("Printing");
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
