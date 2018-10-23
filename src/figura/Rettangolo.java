package figura;

//classe concreta
//estende classe astratta figura
public class Rettangolo extends Figura {

//    variabile globale
    public double lato2;

//    costruttore
    public Rettangolo(double lato2) {
        this.lato2 = lato2;
    }

//    GETTERS
    public double getLato2() {
        return lato2;
    }

//    SETTERS
    public void setLato2(double lato2) {
        if (lato2 > 0) {
            this.lato2 = lato2;
        }
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
        return (lato1 * 2) + (lato2 * 2);
    }

//    override metodo area di IFigura
    @Override
    public double area() {
        return lato1 * lato2;
    }

//    metodo toString
    @Override
    public String toString() {
        return "RETTANGOLO"
                + "\nPERIMETRO = " + perimetro()
                + "\nAREA = " + area();
    }

}
