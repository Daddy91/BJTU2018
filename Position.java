/**
 * What a fanstastic class
 * @author s.p.bradley@durham.ac.uk
 **/
public class Position
{
    private int x;
    private int y;
    
    //Create Position Constructor
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Position(){
        x = 5;
        y = 7;
    }

    public void Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int setToFive(){
        x=5;
        return ++x;
    }

    public void print(){
        System.out.println("x is " + x);
    }

    public boolean xIsSmall(){
        return !(x>3 || y/0>100);
        
    }
}
