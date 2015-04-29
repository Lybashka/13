package Laba;

/**
 * Created by student on 29.04.2015.
 */
public class MoveablePoint implements Movable {
  protected  int x,y,xSpeed,ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp(){
        y-=ySpeed;
    }
    @Override
    public void moveDown(){
       y+=ySpeed;
    }
    public void moveRight(){
        x-=xSpeed;
    }
    public void moveLeft(){
        x+=xSpeed;
    }

}
