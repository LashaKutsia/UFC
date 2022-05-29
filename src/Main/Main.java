package Main;

import ge.Rectangle;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle11 = new Rectangle();
        ufc.Rectangle rectangle2 = new ufc.Rectangle();
        ufc.Rectangle rectangle22 = new ufc.Rectangle();

        rectangle1.setParam(15,20);
        rectangle11.setParam(10,5);

        rectangle2.setParam(5,5);
        rectangle22.setParam(7,8);

        System.out.println(rectangle1.A(rectangle11));
        System.out.println(rectangle2.A(rectangle2,rectangle22));

    }

}
