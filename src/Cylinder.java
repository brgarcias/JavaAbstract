public class Cylinder extends ThreeDimensional {
    private double base;
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }


    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return ( 3.14 * (Math.pow(getRadius(),2)) * getHeight() );
    }
}