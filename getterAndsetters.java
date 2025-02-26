public class getterAndsetters{
  
    public static void main(String[] args) {
        Pen p1 = new Pen(); //create a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        p1.setColor("Gellow");
        System.out.println(p1.getColor());

    }
}

class Pen{
    // prop & fun
   private String color;
   private int tip;

   String getColor(){
       return color;
    }

    int getTip(){
        return tip;
    }

    void setColor(String newColor){
        color = newColor;
        // this.color = newColor;  we can write this also
    }

    void setTip(int newTip){
        tip = newTip;
        // this.tip = newTip;  we can write this also
    }
}

