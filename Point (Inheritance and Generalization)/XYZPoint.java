import java.lang.Math;

public class XYZPoint extends XYPoint {
    private double z;

    public XYZPoint () {
        super();
        this.z = 0.0;
    }

    public XYZPoint (double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void setZ (double z) {
        this.z = z;
    }

    public double getZ () {
        return this.z;
    }

    public double distance3D (XYZPoint point) {
        double sum = Math.pow((point.getX() - this.getX()), 2) + Math.pow((point.getY() - this.getY()), 2) + Math.pow((point.getZ() - this.getZ()), 2);
        double distance = Math.sqrt(sum);
        return distance;
    }
}