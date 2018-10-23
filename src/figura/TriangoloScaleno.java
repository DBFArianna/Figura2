package figura;

//classe concreta
//estende classe astratta figura
public class TriangoloScaleno extends Figura {

//    variabili globali
    protected double lato2, lato3;

//  costruttore
    public TriangoloScaleno(double lato2, double lato3) {
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

//    GETTERS
    public double getLato2() {
        return lato2;
    }

    public double getLato3() {
        return lato3;
    }

//    SETTERS
    public void setLato2(double lato2) {
        if (lato2 > 0) {
            this.lato2 = lato2;
        }
    }

    public void setLato3(double lato3) {
        if (lato3 > 0) {
            this.lato3 = lato3;
        }
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
//        calcolo perimetro
        return lato1 + lato2 + lato3;
    }

//    override metodo area di IFigura
    @Override
    public double area() {
//        semiperimetro
        double p = perimetro() / 2;
//        calcolo area
        return Math.sqrt(p * (p - lato1) * (p - lato2) * (p - lato3));
    }

//    metodo toString
    @Override
    public String toString() {
//        controllo se è un triangolo
        if (lato1 < lato2 + lato3
                && lato2 < lato1 + lato3
                && lato3 < lato1 + lato2) {
            return "TRINAGOLO SCALENO"
                    + "\nPERIMETRO = " + perimetro()
                    + "\nAREA = " + area();
        }
//        else
        return "Non è un triangolo!!";
    }

}
