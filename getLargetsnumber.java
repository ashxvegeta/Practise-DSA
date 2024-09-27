import java.util.*;
public class getLargetsnumber {
 

    public static int getLargets(int number[]) {
        int largets = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {   
            if (largets< number[i]) {
                largets = number[i];
            }
        }

        return largets;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("the largets numbers is " + getLargets(numbers) );
    }
}
