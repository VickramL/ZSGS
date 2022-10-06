package practise;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        for(int i =0; i< value;i++){
            ArrayList<Integer> firstArray = new ArrayList<>();
            ArrayList<Integer> secondArray = new ArrayList<>();
            int size1 = input.nextInt();
            for(int j = 0; j<size1;j++){
                firstArray.add(input.nextInt());
            }
            int size2 = input.nextInt();
            for(int k = 0; k<size2;i++){
                secondArray.add(input.nextInt());
            }

            for(int val : secondArray){
                firstArray.add(val);
            }


        }
    }
}
