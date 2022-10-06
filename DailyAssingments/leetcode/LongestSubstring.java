package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "sbhfkshbdfhfbhj";
        int c = lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
            return s.length();
        int count =0;
        int i =1;
        List<Character> array = new ArrayList<>();
        array.add(s.charAt(0));
        while(i<s.length()){
            for(char val:array){
                if(val==s.charAt(i)){
                    if(count<array.size())
                        count = array.size();
                    array.clear();
                    array.add(s.charAt(i));
                }
                else
                    array.add(s.charAt(i));
            }
            i++;
        }
        return count;
    }
}
