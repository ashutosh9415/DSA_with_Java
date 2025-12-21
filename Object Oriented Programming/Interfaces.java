public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
        Rook r = new Rook();
        r.move();
        King k = new King();
        k.move();
    }
    
}
interface ChessPlayer{
    void move();
}
class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left, right, diagonal(all directions)");
    }
}
class Rook implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left, right");
    }
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right,diagonal(one step)");
    }
}