import java.util.Scanner;

public class UsePoint {

    public static void main (String args[]) {
        XYPoint a = new XYPoint();
        XYPoint b = new XYPoint(1.2, 0.9);
        a.setX(0.1); a.setY(0.6);
        System.out.println("Distance b/w (" + a.getX() + ", " + a.getY() + ") and (1.2, 0.9) = " + a.distance(b));

        XYZPoint c = new XYZPoint();
        XYZPoint d = new XYZPoint(0.5, 1.2, 0.9);
        c.setX(0.6); c.setY(1.3); c.setZ(1.0);
        System.out.println("Distance b/w (" + c.getX() + ", " + c.getY() + ", " + c.getZ() + ") and (0.5, 1.2, 0.9) = " + c.distance3D(d));
        
    }
}