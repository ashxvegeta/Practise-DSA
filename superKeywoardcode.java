public class superKeywoardcode {
    
    public static void main(String[] args) {
        
        Horse h = new Horse();
        System.out.println(h.color); // this will print black because we have set the color in the constructor of Horse class
    
    }
}


class Animal {

   String color;
   Animal() {
      System.out.println("Animal constructor called");
   }    
    
}


class Horse extends Animal {

   Horse() {
      // super(); // this is optional, if we don't use it, it will call the parent constructor by default
      super.color = "black"; // this is used to access the parent class variable
      System.out.println("Horse constructor called");
   }    
    
}

