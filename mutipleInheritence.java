public class mutipleInheritence {

    public static void main(String[] args) {

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
            
    }
    
}


interface Hervivor {
 
    void eatGrass();
}   

interface Carnivor {
    
    void eatMeat();
}


class Bear implements Carnivor, Hervivor {

   public void  eatGrass(){
       System.out.println("Bear eats grass");
   }

    public void eatMeat(){
         System.out.println("Bear eats meat");
    }

}
