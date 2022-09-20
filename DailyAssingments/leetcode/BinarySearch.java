package leetcode;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {-1,0,3,4,5,7,9};
        System.out.print("Enter The Element to Search: ");
        int target = input.nextInt();
        System.out.println(search(array,target));
    }
    public static int search(int[] array, int target) {
        int start = 0, end = array.length-1, middle;

        while(start<=end){
            middle = (start + end)/2;
            if(target> array[middle])
                start = middle +1;
            else if(target< array[middle])
                end = middle -1;
            else
                return middle;
        }
        return -1;
    }
}
