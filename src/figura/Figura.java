package figura;

//classe astratta
//implementa interfaccia
abstract public class Figura implements IFigura {

//    variabili globali
    protected int nLati;
    protected int latiUguali;
    protected double lato1;

//    costruttore standard
    public Figura() {
        nLati = 3;
        lato1 = 3;
        latiUguali = 3;
    }

//    costruttore con parametri
    public Figura(int nLati, double lato1, int latiUguali) {
        this.nLati = nLati;
        this.lato1 = lato1;
        this.latiUguali = latiUguali;
    }

//    GETTERS
    public int getLatiUguali() {
        return latiUguali;
    }

    public int getNlati() {
        return nLati;
    }

    public double getLato1() {
        return lato1;
    }

//    SETTERS
    public void setLato1(double lato1) {
        if (lato1 > 0) {
            this.lato1 = lato1;
        }
    }

    public void setnLati(int nLati) {
        if (nLati > 0) {
            this.nLati = nLati;
        }
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
        double perimetro = 0;
        return perimetro;
    }

}
