import java.util.Scanner;
/* a & b
   a | b
   a ^ b
 */

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("a = "+a+", b = "+b);
        System.out.println("a & b = "+(a&b));
        System.out.println("a | b = "+(a|b));
        System.out.println("a ^ b = "+(a^b));
        System.out.println("~a = "+(~a));
        System.out.println("b << 1 = "+(b<<1));
        System.out.println("b >> 1 = "+(b>>1));
    }
}
