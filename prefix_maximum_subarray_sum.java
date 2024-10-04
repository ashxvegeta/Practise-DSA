import java.util.*;
public class prefix_maximum_subarray_sum {
 

    public static void prefixsum(int numbers[]) {
     
        
        int maxsum = Integer.MIN_VALUE;
        //we will create prefix array before
        int prefixarray[] = new int[numbers.length];
         prefixarray[0] = numbers[0];
         for (int i = 1; i < prefixarray.length; i++) {
            prefixarray[i] = prefixarray[i-1] + numbers[i];
         }


        for (int i = 0; i < numbers.length; i++) {
            int start  = i;
            for (int j = i; j < numbers.length; j++) {
                int end  = j;
                //we have change here 
                int  currentsum =  start==0?prefixarray[end]: prefixarray[end] - prefixarray[start]-1;
               
                if (maxsum<currentsum) {
                    maxsum = currentsum;
                }
            }
        }

        System.out.println("the maximum subbaray sum = " + maxsum);

    }
    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        prefixsum(numbers);

    }
}
