import java.awt.*;

public class primref {
    public static void main(String[]agrs){
        System.out.println("PrimRef");
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
