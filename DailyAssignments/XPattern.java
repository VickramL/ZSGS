import java.util.Scanner;

public class XPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        for(int i = 0; i<str.length();i++){
            for(int j =0;j<str.length();j++){
                if(i==j || i+j == str.length()-1){
                    System.out.print(str.charAt(i));
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
