import java.util.ArrayList;

public class Geometry {
    public static void main(String args[]) {
    	
        Square square = new Square(20, 25);
        Triangle triangle = new Triangle(10, 15);
        Rectangle rectangle = new Rectangle(14, 28);
        Rhombus rhombus = new Rhombus(8, 7);
        Circle circle = new Circle(15, 80);

        Cube cube = new Cube(12, 4);
        Pyramid pyramid = new Pyramid(6, 12);
        Sphere sphere = new Sphere(9);
        Cylinder cylinder = new Cylinder(12, 4);

        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(square);
        figures.add(triangle);
        figures.add(rectangle);
        figures.add(rhombus);
        figures.add(circle);

        String names[] = {"Square", "Triangle", "Rectangle", "Rhombus", "Circle"};
        int i = 0;
        
        System.out.println("~~~~ Plane Geometry: ~~~~");
        for (Figure f : figures) {
            System.out.println(names[i] +":");
            System.out.println("    Area: " +f.area());
            System.out.println("    Perimeter: " +f.perimeter());
            
            if (names[i].equals("Square"))
                System.out.println("    Diagonal: " +square.diagonal());

            if (names[i].equals("Rectangle"))
                System.out.println("    Diagonal: " +rectangle.diagonal());

            i++;
        }

        System.out.println("\n~~~~ Spatial Geometry: ~~~~");

        ArrayList<ThreeDimensional> figThreeDimensional = new ArrayList<ThreeDimensional>();
        figThreeDimensional.add(cube);
        figThreeDimensional.add(cylinder);
        figThreeDimensional.add(sphere);
        figThreeDimensional.add(pyramid);

        String NamesFig[] = {"Cube", "Cylinder", "Sphere", "Pyramid"};

        for(int b = 0; b < figThreeDimensional.size(); b++) {
            System.out.println(NamesFig[b] +": " + figThreeDimensional.get(b).volume());
        }
    }
}