
public class abstractClasscode {

    public static void main(String[] args) {
         
        Horse Hor = new Horse();
        Hor.eat();
        Hor.walk();
        System.out.println("Horse color is: " + Hor.color);

        Chiken clik = new Chiken();
        clik.eat();
        clik.walk();


        Mutang mut = new Mutang();
        // animal -> horse -> mutangabstractClasscode.java
    }
}

abstract class Animal {

    // crate a constructor
    // to initialize the color of the animal
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal construtor called " );
    }

    public void eat() {
        System.out.println("Animal eats everting");
    }

    abstract void walk();
   
}

class Horse extends Animal{


    Horse(){
        System.out.println("Horse constructor called " );
    }

    void  changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mutang extends Horse{

    Mutang(){
        System.out.println("Mutang constructor called " );
    }
}


class Chiken extends Animal{
 
    void  changeColor(){
        color = "dark red";
    }
 
    void walk(){
        System.out.println("walks on 2 legs");
    }
}