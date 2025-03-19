public class hierarcialInheritence{

    public static void main(String args[]){

        Fish Fish = new Fish();
        Fish.swim();
        Fish.eat();//common method
        Fish.breath();//common method

        Bird Bird = new Bird();
        Bird.fly();
        Bird.eat();//common method
        Bird.breath();//common method
      
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
    
    void walk(){
        System.out.println("walking process");
    }

}

class Fish extends Animal{
    
    void swim(){
        System.out.println("swim process");
    }

}

class Bird extends Animal{
    
    void fly(){
        System.out.println("fly process");
    }

}


