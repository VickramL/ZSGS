import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.print("Enter the Array Elements: ");
        for(int i =0; i<size;i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter the No of times Array should rotate: ");
        int n = input.nextInt();
        for(int i=0; i<n;i++){
            int j,firstElement = array[0];
            for(j=0; j<size-1; j++){
                array[j] = array[j+1];
            }
            array[j] = firstElement;
        }
        for(int i =0; i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
