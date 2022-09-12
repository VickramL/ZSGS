import java.awt.*;

public class SwapUsingXor {
    public static void main(String[] args) {
        int x=10,y=15;
        x = x^y; // x is 6
        y = x^y; // y = 10
        x = x^y; // x = 15
        System.out.print("The value of 'X' is "+x+" and 'Y' is "+y);
    }
}
