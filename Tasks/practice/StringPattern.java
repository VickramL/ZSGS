package practise;

public class StringPattern {


    public static void main(String[] args) {

        String s = "bharat";
        int mid = s.length() / 2, mid1=s.length()/2-1;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 != 0) {
                if (i <= mid) {
                    for (int j = 0; j <= mid - i; j++)
                        System.out.print(s.charAt(i));
                }
                if (i > mid) {
                    for (int j = 0; j <= i - mid; j++)
                        System.out.print(s.charAt(i));
                }
            } else {
                if (i <= mid1) {
                    for (int j = 0; j <= mid1 - i; j++)
                        System.out.print(s.charAt(i));

                }

                else {
                    for (int j = 0; j < i - mid1; j++)    ///bharat     bbbhharaattt
                        System.out.print(s.charAt(i));
                }
            }
        }
    }
}