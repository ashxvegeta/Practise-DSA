public class interFacasesimplemention {
    
    public static void main(String[] args) {
        
        Queen q = new Queen();
        q.move();

        Kings k = new Kings();
        k.move();
    }
}

interface ChessPlayer {

    void move();
    

}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up,down,right,left,diagonal (in all drims)");
    }
}

class Rook implements ChessPlayer{
    public void move() {
        System.out.println("up,down,right,left");
        
    }
}

class Kings implements ChessPlayer{
    public void move() {
        System.out.println("up,down,right,left,digonal (by 1 step)");
        
    }
}
