package Movement;

/**
 * Created by spirit on 6/30/16.
 */
public class Movement {

    public String name;
    public int xp, axisX, axisY;
    public  double rockets;


    public void movement(String key){
        if ((this.axisY < 5)&&(key.equals("w"))){
    this.axisY = axisY + 1;
        }
        else if ((this.axisX >= 1)&&(key.equals("s"))){
            this.axisY = axisY - 1;
        }
        else if ((this.axisX < 10)&&(key.equals("d"))){
            this.axisX = axisX + 1;
        }
        else if ((this.axisX >= 1)&&(key.equals("a"))){
            this.axisX = axisX - 1;
        }
        System.out.println(axisX + "      " + axisY);
    }
}
