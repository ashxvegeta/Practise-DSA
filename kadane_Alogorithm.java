import java.util.*;
public class kadane_Alogorithm {
    
    public static void kadane_Algo(int numbers[]) {
        
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currentsum = currentsum + numbers[i];
            if (currentsum<0) {
                currentsum = 0;
            }
            maxsum = Math.max(currentsum, maxsum);
        }
        System.out.println("the maxsum is "+ maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane_Algo(numbers);

    }
}
