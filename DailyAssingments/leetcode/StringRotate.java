package practise;

public class StringRotate {
    public static void main(String[] args) {
        String stringValue = "abcde";
        String goal = "cdeab";
//        String check = "";

        for(int i = 0;i<stringValue.length();i++){
            char tempChar = stringValue.charAt(0);
            stringValue = stringValue.substring(1,stringValue.length())+tempChar;
            if(stringValue.equals(goal)){
                System.out.println("True");
                break;
            }
        }
        System.out.println("False");
    }
}
