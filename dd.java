import java.util.*;
public class dd {
    
    public static void main(String[] args) {
   
        int number = 99880;
        while (number>0) {
            int lastdigit = number%10;
            System.out.print(lastdigit);
            number = number/10;

        }

        System.out.println();
     

    }
}
