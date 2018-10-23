package figura;

//classe astratta
//implementa interfaccia
abstract public class Figura implements IFigura {

//    variabili globali
    private int nLati;
    private double lato1;

//    costruttore con parametri
    public Figura(int nLati, double lato1) {
        this.nLati = nLati;
        this.lato1 = lato1;
    }

//    GETTERS
    public int getNlati() {
        return nLati;
    }

    public double getLato1() {
        return lato1;
    }

//    SETTERS
    public void setLato1(double lato1) {
        if (lato1 <= 0) {
            this.lato1 = 0;
        } else {
            this.lato1 = lato1;
        }
    }

    public void setnLati(int nLati) {
        if (nLati < 3) {
            this.nLati = 3;
        } else {
            this.nLati = nLati;
        }
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
//        calcolo perimetro figure regolari
        return lato1 * nLati;
    }

//    metodo toString
    @Override
    public String toString() {
        return "Figura regolare di " + nLati
                + " lunghi " + lato1;
    }
}
