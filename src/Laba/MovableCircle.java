package Laba;

/**
 * Created by student on 29.04.2015.
 */
public class MovableCircle implements Movable {
    private MoveablePoint center;
    private int radius;

    public MovableCircle(int x,int y, int xSpeed, int ySpeed, int radius) {
        center=new MoveablePoint(x, y,  xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
    @Override
    public void moveUp(){
        center.y-=center.ySpeed;
    }
    @Override
    public void moveDown(){
        center.y+=center.ySpeed;
    }
    @Override
    public void moveRight(){
        center.x-=center.xSpeed;
    }
    @Override
    public void moveLeft(){
        center.x+=center.xSpeed;
    }
}
