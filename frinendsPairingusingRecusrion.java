public class frinendsPairingusingRecusrion {


    public static int  countPairings(int n){

        if(n==1 || n==2){
            return n;
        }

        //single
        int fnm1 =  countPairings(n-1);
        //pairing with one friend
        int fnm2 = countPairings(n-2);

        int pairways =  n-1 * fnm2;
        return fnm1 + pairways;
        
    }
   
    public static void main(String[] args) {
        int n = 4; // Number of friends
        System.out.println("Total ways to pair " + n + " friends: " + countPairings(n));
    }
}