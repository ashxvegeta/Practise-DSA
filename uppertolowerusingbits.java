public class uppertolowerusingbits {
    

    public static char tolower(char c) {
      return (char) (c | ' ');   
    }

    public static void main(String[] args) {
        System.out.println(tolower('M'));
    }
}
