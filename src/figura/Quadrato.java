package figura;

//classe concreta
//estende classe astratta figura
public class Quadrato extends Figura {

//    costruttore
    public Quadrato(double lato1) {
        super(4, lato1);
    }

//    override metodo area di IFigura
    @Override
    public double area() {
//        calcolo area
        return Math.pow(getLato1(), 2);
    }

//    metodo toString
    @Override
    public String toString() {
        return "QUADRATO"
                + "\n\tLATI = " + getLato1()
                + "\n\tPERIMETRO = " + perimetro()
                + "\n\tAREA = " + area()
                + "\n_____________________________________________";
    }

//    metodo statico di test
    public static void test() {
        Quadrato quadrato = new Quadrato(6);
        System.out.println(quadrato);
    }

}
