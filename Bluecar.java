abstract class Car {

    static {
        System.out.println("1");
    }

    {
        System.out.println("3");
    }

    public Car(String name) {
        super();  // this is optional, but fine
        System.out.println("2");
    }
}

public class Bluecar extends Car {

    {
        System.out.println("4");
    }

    public Bluecar() {
        super("blue");
        System.out.println("5");
    }

    public static void main(String[] args) {
        new Bluecar();
    }
}
