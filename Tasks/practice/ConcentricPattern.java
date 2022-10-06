package practise;

import java.util.Scanner;

public class ConcentricPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        for(int i = 1-number;i<number;i++){
            for(int j = 1 - number;j<number;j++){
                if(Math.abs(i)>Math.abs(j))
                    System.out.print(Math.abs(i)+1+" ");
                else
                    System.out.print(Math.abs(j)+1+" ");
            }
            System.out.println();
        }
    }
}
