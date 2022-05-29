package ge;

public class Rectangle {
            private int x;
            private int y;

            public void setParam(int x, int y){
                this.x = x;
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }
            protected int Area(){
                int k = x*y/2; //##5 k გამოყენება Area და Perimeter-ში არ გვაძლევს კომპილაციის  შეცდომას რომ "ცვლადი უკვე არსებობს".
                return x*y;
            }
            protected int Perimeter(){
                int k = x+y;
                return 2*(x+y);
            }
            public int A(Rectangle b){
                if(this.Area()>b.Area()){
                    return 1;
                }
                else if(this.Area()==b.Area()) {
                    return 0;
                }
                else {
                    return -1;
                }
            }


}
