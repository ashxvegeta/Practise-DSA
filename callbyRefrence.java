public class callbyRefrence{

    public static void updateMarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {  
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args){
        int marks[] =  {97,98,99};
        updateMarks(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}