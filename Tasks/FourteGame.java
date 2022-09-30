package assignment;

import java.util.Scanner;

public class FourteGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[] values = new int[4];
        for(int i =0;i<4;i++){
            values[i] = input.nextInt();
        }
        System.out.println("Target : "+target);
        System.out.printf("\n");
        for(int value:values){
            System.out.print(value+" ");
        }
        System.out.print("\n+ - x /\n");
        tryDifferentNumberCombinations(values,target);


    }
    public static void possibilities(int[] array,int target){
        String[] operators = {"+","-","x","/"};
        String resultantPosibilities = "";

        for(int i = 0;i<4;i++){
            for(int j =0;j<4;j++){
                for(int  k = 0;k<4;k++){
                    try {
                        int solution = calculateTheValues(operators[i], calculateTheValues(operators[j],
                                calculateTheValues(operators[k], array[0], array[1]), array[2]), array[3]);
                        if (solution == target) {
                            resultantPosibilities = "" + array[0] + operators[k] + array[1] + operators[j]
                                    + array[2] + operators[i] + array[3]+" = "+target;
                            System.out.println(resultantPosibilities);
                        }
                    }catch (Exception ignored){}
                }
            }
        }
    }
    private static void tryDifferentNumberCombinations(int[] values, int target){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                for (int k=0; k<4; k++){
                    int l=0;
                    while(l<4){
                        if(i != j && i != k && i != l && j != k && j!= l && k != l)
                            possibilities(new int[]{values[i], values[j], values[k], values[l]}, target);
                        l++;
                    }
                }
            }
        }
    }
    public static int calculateTheValues(String operator,int value1,int value2) throws Exception {

        switch (operator){
            case "+": value1 +=value2;
            break;

            case "-": value1 -= value2;
            break;

            case "x":
                if(value2 == 0){
                    throw new Exception("InfiniteValueException");
                }
                value1 *= value2;
            break;

            case "/":
                if(value1 == 0 || value2 == 0){
                    throw new Exception("ArithmeticException");
                }
                value1 /= value2;
            break;
            case "":
                value1 = Integer.parseInt(value1+""+value2);
                break;
        }
        return value1;

    }
}
