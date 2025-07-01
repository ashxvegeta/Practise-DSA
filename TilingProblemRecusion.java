public class TilingProblemRecusion {
    
    public static int TilingProblem(int n){


        //base case 

        if(n==1 || n==0){
            return 1;
        }

        //first kaam kr lete hai
        //placing the tile vertically
        int fnm1 = TilingProblem(n-1);

        //placing the tile horizoltally
        int fnm2 = TilingProblem(n-2);

        //combilng all the ways
        int totalways = fnm1+fnm2;

        return totalways;
    }

    public static void main(String args[]){

        System.out.println(TilingProblem(2));
    }
}
