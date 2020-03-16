public class Cube extends ThreeDimensional{

    public Cube(double side, double depth){
        this.side = side;
        this.depth = depth;
    }

    private double side;
    private double depth;

    public double getSide() {
        return this.side;
    }

    public double getDepth() {
        return this.depth;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double volume() {
        return ( 3.14 * (Math.pow(getSide(), 2)) * getDepth() ) / 3;
    }
}