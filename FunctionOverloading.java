public class FunctionOverloading {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum((float)1.0, (float)2.0));
        System.out.println(calc.sum(10, 20, 30)); 
    }
}

class Calculator {

   int sum(int a, int b) {
       return a + b;
   }
   float sum(float a, float b) {
       return a + b;
   }
   int sum(int a , int b , int c) {
       return a + b + c;
   }
}