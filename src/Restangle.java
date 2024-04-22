public class Restangle extends GeometricFigure{
    Restangle(){}
    Restangle( double sideA, double sideB)
    {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public void area(double sideA, double sideB)
    {
        System.out.println("To'rburchak yuzi: "+ sideA*sideB);
    }
    public void perimetr(double sideA, double sideB){
        System.out.println("To'rtburchak perimetri: "+2*(sideA+sideB));
    }

    public static void main(String[] args) {
        Restangle restangle = new Restangle();
        restangle.area(2 ,3);
        restangle.perimetr(2,3);
    }

}
