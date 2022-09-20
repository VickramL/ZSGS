package leetcode;

import java.util.Scanner;

public class LargestOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        String string = input.next();
        System.out.println(largestOddNumber(string));
    }
    public static String largestOddNumber(String string) {

        int end = string.length()-1;

        boolean isEven =true;

        while(isEven &&end>=0){
            if((string.charAt(end)-'0')%2 !=0)
                isEven = false;
            else
                end--;
        }

        return string.substring(0,end+1);

    }
}
