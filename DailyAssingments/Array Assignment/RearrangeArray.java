import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int size = input.nextInt();

        System.out.print("Enter The Array Elements: ");
        int[] array = new int[size];

        for(int i =0;i<size;i++)
            array[i] = input.nextInt();

        Arrays.sort(array);
        int middle = 0;
        if(size%2==0)
            middle = size/2 - 1;
        else
            middle = size/2;
        System.out.print(array[middle]+" ");
        for(int i =1;i<=middle;i++)
            System.out.print(array[middle+i]+" "+array[middle-i]+" ");
        if(size%2==0){
            System.out.println(array[size-1]);
        }

    }
}
