package Laba;

/**
 * Created by student on 29.04.2015.
 */
public class Test {
    public static void main(String[] args) {
        Movable m1 = new MoveablePoint(5, 6, 10,9); // upcast

        System.out.println(m1);

        m1.moveLeft();

        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 1, 2, 20,7); // upcast

        System.out.println(m2);

        m2.moveRight();

        System.out.println(m2);
    }
}
