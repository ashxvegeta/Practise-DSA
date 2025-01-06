import java.util.*;
public class stringanagrams {
    

    public static void main(String[] args) {
        
        String str1 = "race";
        String str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length()==str2.length()) {
            
            char[] str1array = str1.toCharArray();
            char[] str2array = str2.toCharArray();

            Arrays.sort(str1array);
            Arrays.sort(str2array);

            if(Arrays.equals(str1array, str2array)){
               System.out.println("strings are anagram");
            }else{
                System.out.println("strings are not anagram");
            }
        }else{
            System.out.println("both strings is not a anagram");
        }
    }
}
