public class SumOfComplexNumbers{


    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        c1.add(c2);
        c1.sub(c2);
        c1.mul(c2);
    }
}
    

class Complex{

    int real;
    int imaginary;

    Complex(int r,int img){
        this.real = r;
        this.imaginary = img;

    }

    void  add(Complex  c2){
       int realsum = this .real+ c2.real;
       int imgSum = this.imaginary + c2.imaginary;
       System.out.println("Sum of complex numbers is: " + realsum + " + " + imgSum + "i");
    }

    void  sub(Complex c2){
       int realsub = this.real - c2.real;
       int imgSub = this.imaginary - c2.imaginary;
       System.out.println("Subtraction of complex numbers is: " + realsub + " + " + imgSub + "i");
    }
    void  mul(Complex c2){
       int realmul = this.real * c2.real;
       int imgMul = this.imaginary * c2.imaginary;
       System.out.println("Multiplication of complex numbers is: " + realmul + " + " + imgMul + "i");
    }
}