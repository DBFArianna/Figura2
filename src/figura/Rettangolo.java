package figura;

//classe concreta
//estende classe astratta figura
public class Rettangolo extends Figura {

//    variabile globale
    public double lato2;

//    GETTERS
    public double getLato2() {
        return lato2;
    }

//    SETTERS
    public void setLato2(double lato2) {
        if (lato2 < 0) {
            this.lato2 = 0;
        } else {
            this.lato2 = lato2;
        }
    }

//    costruttore
    public Rettangolo(double lato1, double lato2) {
        super(4, lato1);
        setLato2(lato2);
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
        return (getLato1() * 2) + (getLato2() * 2);
    }

//    override metodo area di IFigura
    @Override
    public double area() {
        return getLato1() * getLato2();
    }

//    metodo toString
    @Override
    public String toString() {
        return "RETTANGOLO"
                + "\n\tLATO1 = " + getLato1()
                + "\n\tLATO2 = " + getLato2()
                + "\n\tPERIMETRO = " + perimetro()
                + "\n\tAREA = " + area()
                + "\n_____________________________________________";
    }

//    metodo statico di test
    public static void test() {
        Rettangolo rettangolo = new Rettangolo(3, 5);
        System.out.println(rettangolo);
    }

}
