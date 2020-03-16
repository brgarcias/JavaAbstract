public class Pyramid extends ThreeDimensional {
    private double baseArea;
    private double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    public double getBaseArea(){
        return this.baseArea;
    }

    public double getHeight() {
        return this.height;
    }

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double volume() {
        return ( getBaseArea() * getHeight() ) / 3;
    }
}