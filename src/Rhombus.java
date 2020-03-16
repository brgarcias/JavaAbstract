public class Rhombus extends Quadrilateral {
    public Rhombus(double base, double height){
        super(base, height);
    }

    @Override
    public double area(){
        return getBase() * getHeight();
    }
}