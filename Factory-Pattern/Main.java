/**
 * Created by Jiazhang_Liu on 4/16/2015.
 */
public class Main {
    public static void main(String args[]) {
        ShapeFactory sf = new ShapeFactory("triangle");
        sf.action();

        sf = new ShapeFactory("circle");
        sf.action();

        sf = new ShapeFactory("square");
        sf.action();
    }

}
