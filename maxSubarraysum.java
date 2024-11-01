import java.util.*;
public class maxSubarraysum {
    
    public static void printMaxSubarrysum(int numbers[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentsum=0;
                for(int k = start; k<=end;k++){
                    currentsum = currentsum + numbers[k];   
                }
                System.out.println(currentsum);
                if(maxsum < currentsum){
                    maxsum = currentsum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("the maxmimun subaary sum is `"+maxsum);
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        printMaxSubarrysum(numbers);
    }
}
