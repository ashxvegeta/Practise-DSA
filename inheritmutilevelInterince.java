public class inheritmutilevelInterince{

    public static void main(String args[]){

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println("Dobby has " + dobby.legs + " legs");
    }

}

// base class
class Animal{

    // property

    String color; 

    void eat(){
        System.out.println("eating process");
    }

    void breath(){
        System.out.println("breathing process");
    }
}

// derived class
class mammal extends Animal{
    // property
    int legs;

}

class Dog extends mammal{
    String breed;
}
