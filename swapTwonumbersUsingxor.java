public class swapTwonumbersUsingxor{

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("Before swapping: x = " + x + ", y = " + y);

        x = x^y;  //3^4 = 7
        y = x^y;  //7^4 = 3
        x = x^y;  //4^3 =  4

        System.out.println("after swapping: x = " + x + ", y = " + y);

    }
}