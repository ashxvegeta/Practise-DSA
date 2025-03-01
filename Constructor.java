public class Constructor{

    public static void main(String args[]){
        // Student s1 = new Student("ashu");
        // System.out.println(s1.name);

        //we can write this also

        Student s1 = new Student();
    }

}

class Student{

    String name;
    int roll;

    // Student(String name){
    //     this.name = name;
    // }

    Student(){
        System.out.println("Constructor called");
    }
}