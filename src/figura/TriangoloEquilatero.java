package figura;

//classe concreta
//estende classe Figura
public class TriangoloEquilatero extends Figura {

//    costruttore
    public TriangoloEquilatero() {
        super();
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
//        calcolo perimetro
        return lato1 * 3;
    }

//    override metodo area di IFigura
    @Override
    public double area() {
//        semiperimetro
        double p = perimetro() / 2;
//        caloclo area
        return Math.sqrt(p * Math.pow((p - lato1), 3));

    }

//    metodo toString
    @Override
    public String toString() {
        return "TRINAGOLO EQUILATERO"
                + "\nPERIMETRO = " + perimetro()
                + "\nAREA = " + area();
    }

}
