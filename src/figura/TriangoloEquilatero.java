package figura;

//classe concreta
//estende classe Figura
public class TriangoloEquilatero extends Figura {

//    costruttore
    public TriangoloEquilatero(double lato1) {
        super(3, lato1);
    }

//    override metodo area di IFigura
    @Override
    public double area() {
//        semiperimetro
        double p = perimetro() / 2;
//        caloclo area
        return Math.sqrt(p * Math.pow((p - getLato1()), 3));
//        OPPURE
//////        return (Math.sqrt(3) / 4) * Math.pow(getLato1(), 2);
    }

//    metodo toString
    @Override
    public String toString() {
        return "_____________________________________________"
                + "\nTRINAGOLO EQUILATERO"
                + "\n\tLATI = " + getLato1()
                + "\n\tPERIMETRO = " + perimetro()
                + "\n\tAREA = " + area()
                + "\n_____________________________________________";
    }

//    metodo statico di test
    public static void test() {
        TriangoloEquilatero equilatero = new TriangoloEquilatero(3);
        System.out.println(equilatero);
    }
}
