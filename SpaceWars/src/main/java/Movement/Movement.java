package Movement;

/**
 * Created by spirit on 6/30/16.
 */
public class Movement {
    public String key;
    int axisY, axisX;

    public void movement(String key){
        if ((this.axisY < 5)&&(this.key.equals("w"))){
    this.axisY = axisY + 1;
        }
        else if ((this.axisX >= 1)&&(this.key.equals("s"))){
            this.axisY = axisY - 1;
        }
        else if ((this.axisX < 10)&&(this.key.equals("d"))){
            this.axisX = axisX + 1;
        }
        else if ((this.axisX >= 10)&&(this.key.equals("a"))){
            this.axisX = axisX - 1;
        }
    }
}
