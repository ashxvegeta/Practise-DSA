public class Construtor_type{

    public static void main(String args[]){
       //this is Non paramter Constructor
        Student s1 = new Student();

        Student s2 = new Student("Ashu");

        Student s3 = new Student(101);

        Student s4 = new Student(s1);
    }

}

class Student{

    String name;
    int roll;

    //this is Non paramter Constructor
    Student(){
        //this is set for copy constructor
        this.name = "Ashu";
        this.roll = 101;
        // end of copy constructor

        System.out.println("Non paramter Constructor called");
    }

    Student(String name){
        System.out.println("Paramter Constructor called with "+name);
    }

    Student(int roll){
        System.out.println("Paramter Constructor called with "+roll);
    }

    Student(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        System.out.println("Copy Constructor called with " + other.name + " " + other.roll);
    }
}