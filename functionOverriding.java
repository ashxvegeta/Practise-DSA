
public class functionOverriding {

    public static void main(String[] args) {
         
        Dear d = new Dear();
        d.eat();
    }
}

class Animal {

    void eat() {
        System.out.println("Animal eats everting");
    }
   
}

class Dear extends Animal{

    void eat(){
        System.out.println("Dear eats grass");
    }
}