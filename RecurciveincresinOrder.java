public class RecurciveincresinOrder{


    public static void printincreasing(int n){

        if(n==1){
            System.out.print(n + " ");
            return;
        }
       
        printincreasing(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args){

        int n = 5;
        printincreasing(n);

    }

}