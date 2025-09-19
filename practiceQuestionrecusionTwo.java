public class practiceQuestionrecusionTwo {
    


    public static void numberToWords(String[] arr, int num) {
        if(num == 0){
            return;
        }
        int lastDigit = num % 10;
        numberToWords(arr, num / 10);
        System.out.print(arr[lastDigit] + " ");
    }
    public  static void main(String args[]){
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num = 1947;
        numberToWords(arr, num);
    }

    
}
