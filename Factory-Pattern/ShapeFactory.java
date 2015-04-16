/**
 * Created by Jiazhang_Liu on 4/16/2015.
 */
public class ShapeFactory {
    Shape c;
    public ShapeFactory(String shape) {
        if(shape.equalsIgnoreCase("CIRCLE")) {
            c = new Circle();
        } else if (shape.equalsIgnoreCase("TRIANGLE")) {
            c = new Triangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            c = new Square();
        }
    }

    public void action(){c.draw();}
}
