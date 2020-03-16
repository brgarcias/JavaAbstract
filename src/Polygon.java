public class Polygon extends Figure {
    private double base;
    private double height;

    public Polygon(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return this.base;
    }

    public double getHeight(){
        return this.height;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setHeight(double height){
        this.height = height;
    }

    
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}