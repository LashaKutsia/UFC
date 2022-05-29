package ufc;

public class Rectangle {
    private int x;
    private int y;


    public int getY() {
        return y;
    }

    public void setParam(int x,int y) {
        this.y = y;
        this.x=x;
    }

    public int getX() {
        return x;
    }

    protected int Perimeter(){
       return 2*(x+y);
    }
    public int A(Rectangle a, Rectangle b){
        if(a.Perimeter()>b.Perimeter()){
            return 1;
        }
        else if(a.Perimeter()==b.Perimeter()) {
            return 0;
        }
        else {
            return -1;
        }
    }

}
