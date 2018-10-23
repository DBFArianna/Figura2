package figura;

//classe concreta
//estende classe astratta figura
public class TriangoloScaleno extends Figura {

//    variabili globali
    protected double lato2, lato3;

//    GETTERS
    public double getLato2() {
        return lato2;
    }

    public double getLato3() {
        return lato3;
    }

//    SETTERS
    public void setLato2(double lato2) {
        if (lato2 < 0) {
            this.lato2 = 0;
        } else {
            this.lato2 = lato2;
        }
    }

    public void setLato3(double lato3) {
        if (lato3 < 0) {
            this.lato3 = 0;
        } else {
            this.lato3 = lato3;
        }
    }

//    costruttore
    public TriangoloScaleno(double lato1, double lato2, double lato3) {
        super(3, lato1);
        setLato2(lato2);
        setLato3(lato3);
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
//        calcolo perimetro
        return getLato1() + lato2 + lato3;
    }

//    override metodo area di IFigura
    @Override
    public double area() {
//        semiperimetro
        double p = perimetro() / 2;
//        calcolo area
        return Math.sqrt(p * (p - getLato1()) * (p - getLato2()) * (p - getLato3()));
    }

//    metodo toString
    @Override
    public String toString() {
//        controllo se è un triangolo
        if (getLato1() < getLato2() + getLato3()
                && getLato2() < getLato1() + getLato3()
                && getLato3() < getLato1() + getLato2()) {
            return "TRINAGOLO SCALENO"
                    + "\n\tLATO1 = " + getLato1()
                    + "\n\tLATO2 = " + getLato2()
                    + "\n\tLATO3 = " + getLato3()
                    + "\n\tPERIMETRO = " + perimetro()
                    + "\n\tAREA = " + area()
                    + "\n_____________________________________________";
        }
//        else
        return "Non è un triangolo!!";
    }

//    metodo statico di test
    public static void test() {
        TriangoloScaleno scaleno = new TriangoloScaleno(2, 3, 4);
        System.out.println(scaleno);
    }

}
