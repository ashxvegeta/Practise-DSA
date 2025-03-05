public class Construtor_type{

    public static void main(String args[]){
       //this is Non paramter Constructor
        Student s1 = new Student();

        Student s2 = new Student("Ashu");

        Student s3 = new Student(101);
    }

}

class Student{

    String name;
    int roll;

    //this is Non paramter Constructor
    Student(){
        System.out.println("Non paramter Constructor called");
    }

    Student(String name){
        System.out.println("Paramter Constructor called");
    }

    Student(int roll){
        System.out.println("Paramter Constructor called");
    }
}