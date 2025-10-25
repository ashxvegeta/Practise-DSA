public class TowerofHonai {
    

    public static void  solveTowerOfHanoi(int n,char source,char destination,char auxiliary){
        
        if(n>0){
            solveTowerOfHanoi(n - 1, source, auxiliary, destination);
            System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
            solveTowerOfHanoi(n - 1, auxiliary, destination, source);
        }
    }
    public static void main(String[] args) {
        int n = 3; // Number of disks
        char source = 'A'; // Source rod
        char auxiliary = 'B'; // Auxiliary rod
        char destination = 'C'; // Destination rod

        
        solveTowerOfHanoi(n, source, destination, auxiliary);
    }
}
