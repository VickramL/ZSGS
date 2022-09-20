package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i =0;i<num;i++){
            array.add(input.nextInt());
        }
        int time = input.nextInt();
        for(int i =0;i<time;i++){
            String string = input.next();
            if(string.equals("Insert")){
                array.add(input.nextInt(), input.nextInt());
            }
            else if(string.equals("Delete")){
                array.remove(input.nextInt());
            }

        }

        for(int arr:array){
            System.out.print(arr+" ");
        }
    }
}
