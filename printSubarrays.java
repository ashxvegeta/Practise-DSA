public class printSubarrays {

    public static void subarraysprint(int numbers[]) {
        
        int ts= 0;
        //for taking out the start
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            //for taking out the end 
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                //now print all the elmements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the sum of subarrays is - "+ ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarraysprint(numbers);
    }
}
