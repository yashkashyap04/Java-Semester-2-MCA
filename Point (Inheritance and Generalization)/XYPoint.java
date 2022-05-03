import java.lang.Math;

public class XYPoint {
    private double x, y;

    public XYPoint () {
        this.x = 0.0;
        this.y = 0.0;
    }

    public XYPoint (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX (double x) {
        this.x = x;
    }
    
    public void setY (double y) {
        this.y = y;
    }

    public double getX () {
        return this.x;
    }

    public double getY () {
        return this.y;
    }

    public double distance (XYPoint point) {
        double sum = Math.pow((point.getX() - this.getX()), 2) + Math.pow((point.getY() - this.getY()), 2);
        double distance = Math.sqrt(sum);

        return distance;
    }
}