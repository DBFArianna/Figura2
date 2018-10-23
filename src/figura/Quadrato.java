package figura;

//classe concreta
//estende classe astratta figura
public class Quadrato extends Figura {
    
//    costruttore
    public Quadrato() {
        super();
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
//        calcolo perimetro
        return lato1 * 4;
    }
    
//    override metodo area di IFigura
    @Override
    public double area() {
//        calcolo area
        return Math.pow(lato1, 2);
    }

//    metodo toString
    @Override
    public String toString() {
        return "QUADRATO:"
                + "\nPERIMETRO = " + perimetro()
                + "\nAREA = " + area();
    }

}
