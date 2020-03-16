public class Sphere extends ThreeDimensional {
    private double radius;

    public Sphere (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume(){
        return ( 4 * 3.14 * Math.pow(getRadius(), 3) / 3 );
    }
}