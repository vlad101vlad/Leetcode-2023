package p242_ValidAnagram;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] cs = new char[s.length()];
        char[] ct = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            cs[i] = s.charAt(i);
            ct[i] = t.charAt(i);
        }
        Arrays.sort(cs);
        Arrays.sort(ct);
        for(int i = 0; i < s.length(); i++){
            if(cs[i] != ct[i])
                return false;
        }
        return true;
    }
}
