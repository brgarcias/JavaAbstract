public class Square extends Quadrilateral implements Diagonal{

    public Square (double base, double height) {
        super(base, height);
    }

    @Override
    public double area(){
        return getBase() * getHeight();
    }

    public float diagonal() {
        double catOp = Math.pow(getBase(), 2);
        double catAdj = Math.pow(getHeight(), 2);
        double diagonal = Math.sqrt(catOp + catAdj);
        return (float) diagonal;
    }
}