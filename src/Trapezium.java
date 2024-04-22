public class Trapezium extends GeometricFigure{
    Trapezium(){}
    Trapezium( double sideA, double sideB,double high)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }
    void area(double sideA, double sideB,double high){
        double tr = (sideA+sideB)*high/2;
        System.out.println("Trapezium yuzasi: "+ tr);
    }
    void perimetr(double sideA, double sideB,double high){
        System.out.println("Perimetri: "+ (sideA+sideB+2*(Math.sqrt(high*high+ ((sideB-sideA)/2)*((sideB-sideA)/2)))));
    }

    public static void main(String[] args) {
        Trapezium trapezium = new Trapezium();
        trapezium.area(3,9,4);
        trapezium.perimetr(3,9,4);
    }
}
