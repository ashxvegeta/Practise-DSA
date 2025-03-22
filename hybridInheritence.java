public class hybridInheritence{

    public static void main(String args[]){

        Fish Fish = new Fish();
        Fish.swim();
        Fish.eat();//common method
        Fish.breath();//common method

        Bird Bird = new Bird();
        Bird.fly();
        Bird.eat();//common method
        Bird.breath();//common method

        cat cat = new cat();
        cat.meow();
        cat.walk();

        peacock peacock = new peacock();
        peacock.talk();
        peacock.fly();
        

        shark shark = new shark();
        shark.kill();
        shark.swim();
        
      
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

class cat extends mammal{
    void meow(){
        System.out.println("meow");
    }
}

class dog extends mammal{
    void bark(){
        System.out.println("bark");
    }
}


// class fish
class Fish extends Animal{
    
    void swim(){
        System.out.println("swim process");
    }

}

class shark extends Fish{
    
    void kill(){
        System.out.println("kill other fish");
    } 
}

class tuna extends Fish{

    void humankill(){
    System.out.println("human kills");
    }
}

// class bird
class Bird extends Animal{
    
    void fly(){
        System.out.println("fly process");
    }

}
class peacock extends Bird{
      
    void talk(){
        System.out.println("can speak also");
    }
}





