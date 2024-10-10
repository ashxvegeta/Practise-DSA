public class containsDuplicate {
    
    public static boolean findThedublicate(int numbers[]) {
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                 if (numbers[j] == numbers[i]) {
                    return true;
                 }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(findThedublicate(nums));
    }
}
