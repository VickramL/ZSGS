import java.util.Scanner;

public class ArrayRightRotation {
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
            int j, lastElement = array[size-1];
            for(j=size-1; j>0; j--){
                array[j] = array[j-1];
            }
            array[j] = lastElement;
        }
        for(int i =0; i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
