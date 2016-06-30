package Movement;

/**
 * Created by spirit on 6/30/16.
 */
public class Movement {

    public String name;
    public int xp, axisX, axisY;
    public  double rockets;


    public void moveUp(){
        if (this.axisY < 10) {
            this.axisY = axisY + 1;
            System.out.println(axisX + "      " + axisY);
        }
    }
    public void moveDown(){
        if (this.axisY > 1) {
            this.axisY = axisY - 1;
            System.out.println(axisX + "      " + axisY);
        }
    }
    public void moveLeft() {
        if (this.axisX > 1) {
            this.axisX = axisX - 1;
            System.out.println(axisX + "      " + axisY);
        }
    }
    public void moveRight(){
        if (this.axisX < 10) {
            this.axisX = axisX + 1;
            System.out.println(axisX + "      " + axisY);
        }
    }

}
