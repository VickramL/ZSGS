import java.util.Scanner;

public class OddEvenUsingAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

       if(num != 0){
           if((num&1) == 0) //if num = 23 --> 00010111 & 00000001 it gives 1. so, if won't execute.
               System.out.println("Even");
           else
               System.out.println("Odd"); // 00010111 & 00000001 it gives 1. so, else part will execute and print odd.
       }
       else
           System.out.println("Neutral");
    }
}
