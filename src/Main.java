
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(4.5 , "blue" , true);

        Comparator circleComparator = new CircleComparator();
        System.out.println(circleComparator.compare(circles[0],circles[2]));


    }
}
