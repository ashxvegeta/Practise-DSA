public class inheritence{

    public static void main(String args[]){

        fish shark = new fish();
        shark.eat();
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
class fish extends Animal{
  // property
    int fins;

    void swim(){
        System.out.println("fish swim");
    }
}
