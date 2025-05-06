public class RecursiveBasics{


    public static void printDescending(int n){

        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDescending(n-1);
        
    }

    public static void main(String[] args){

        int n = 10;
        printDescending(n);

    }

}