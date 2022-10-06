package practise;

import java.util.Scanner;

public class HappyString {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the loop time ");
        int value = input.nextInt();
        for(int i =0;i<value;i++){
            System.out.println("Enter the String");
            String str = input.next();
            int length = 0;
            int j = 0;
            boolean flag = false;
            while(j<str.length()){
                char ch = str.charAt(j);
                if(ch == 'a'||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    length++;
                    if(length == 3){
                        flag = true;
                        break;
                    }
                }
                else{

                    length = 0;
                }
                j++;
            }
            System.out.println(flag?"Happy":"Sad");
        }
    }
}


