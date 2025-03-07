public class copyconstructortwo{

    public static void main(String args[]){
       //this is Non paramter Constructor
        Student s1 = new Student();
        s1.name = "Ashu";
        s1.roll = 101;
        s1.password = "abcd";
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;


        Student s2 = new Student(s1);
        s2.password = "ab";
       //after sometime we want to change the marks of s1 but it should not affect s2 but it will affect
        s1.marks[1] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }

}

class Student{

    String name;
    int roll;
    String password;
    int marks[];


    //this is copy constructor  copied all the preperties of s1 to s2
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
        System.out.println("Copy Constructor called with " + s1.name + " " + s1.roll);
    }

    //this is Non paramter Constructor
    Student(){
        marks = new int[3];
        System.out.println("Non paramter Constructor called");
    }

    Student(String name){
      marks = new int[3];
      this.name = name;
    }

    Student(int roll){
      marks = new int[3];
      this.roll = roll;
    }

   
}