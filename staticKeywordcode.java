public class staticKeywordcode {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        // s1.setName("abc");
        // System.out.println(s1.getName());

        s1.schoolname = "ABC School";
        System.out.println(s1.schoolname);
       
        Student s2 = new Student();   // in here it should print empty string but it will print s1 school name
        System.out.println(s2.schoolname);

       Student s3 = new Student();
        s3.schoolname = "XYZ School"; // in here it should print empty string but it will print s1 school name
        System.out.println(s1.schoolname);
        System.out.println(s2.schoolname);
        System.out.println(s3.schoolname);

        // static variable is shared among all the objects of the class
        // so if we change the value of static variable in one object, it will be changed in all the objects
        // so if we want to use static variable, we should use class name to access it
        // so we can use class name to access static variable
        System.out.println(Student.schoolname); 

    }
}

class Student{

    // static functions marks is diffrent values will diffrent but logic is same for everyone so we can use static function
    // static function is used to call the function without creating the object of the class
    static int countPercent(int math, int english, int science){
        return (math + english + science) / 3;

    }


    int rollno;
    String name;

    static String schoolname;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
