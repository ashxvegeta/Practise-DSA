import java.util.*;
public class stringSubstring {
    


    public static void printSubstring(String str,int si,int ei) {
        
        String Substr = "";
        for (int i=si; i<ei; i++) {
            Substr += str.charAt(i);
        }
        System.out.print(Substr);

    }


    public static void main(String[] args) {
        String str = "helloworld";
        int si =0;
        int ei = 4;
        printSubstring(str, si, ei);
        //inbuilt function
        //System.out.println("inbuilt"+str.substring(si, ei));
    }

}
