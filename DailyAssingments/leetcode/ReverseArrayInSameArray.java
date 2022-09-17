package practise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInSameArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character Array Size: ");
        int length = input.nextInt();
        char[] character = new char[length];
        System.out.print("Enter the Array elements: ");
        for(int i =0;i<length;i++){
            character[i] = input.next().charAt(0);
        }
        int firstIndex = 0, lastIndex = length-1;
        while(firstIndex < lastIndex) {
            char temp = character[firstIndex];
            character[firstIndex] = character[lastIndex];
            character[lastIndex] = temp;
            firstIndex++;
            lastIndex--;
        }
        System.out.println(Arrays.toString(character));
    }
}
