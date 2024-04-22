class Triangle extends GeometricFigure{
    Triangle(){}
    Triangle( double sideA, double sideB,double sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    void area(double sideA, double sideB,double sideC)
    {
        double k ,p;
        p = (sideA + sideB + sideC)/2;
        k=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        System.out.println("Triangle yuzasi: "+ k);
    }
    public void perimetr(double sideA, double sideB,double sideC){
        System.out.println("Perimetri:  "+(sideA+sideB+sideC));
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area(3.0,4.0,5.0);
        triangle.perimetr(3.0,4.0,5.0);
    }
}
