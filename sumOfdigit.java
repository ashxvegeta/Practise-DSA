public class sumOfdigit {
    


    public  static int computeSum(int n){

        int num = n;
        int sum = 0;

        while(num>0){
            int lastdigit = num%10;
            sum+=lastdigit;
            num = num/10    ;
        }

        return sum;
    }

    public static void main(String[] args) {
        int num =  12345;
      
        System.out.println("the sum is "+ computeSum(num));
    }
}
