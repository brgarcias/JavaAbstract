public class Circle extends Figure {
    private double radius;
    private double circumference;

    public Circle(double radius, double circumference) {
        this.radius = radius;
        this.circumference = circumference;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getCircumference(){
        return this.circumference;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCircumference(double cincumference) {
        this.circumference = cincumference;
    }

    @Override
    public double area() {
        return (3.14 * Math.pow(getRadius(), 2));
    }

    @Override
    public double perimeter() {
        return circumference;
    }
    
}
