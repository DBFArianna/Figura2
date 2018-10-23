package figura;

//classe concreta
//estende classe astratta figura
public class Pentagono extends Figura {

//    costante privata globale
    private final double COSTANTEAREA;

//    costruttore
    public Pentagono(double lato1) {
        super(5, lato1);
        this.COSTANTEAREA = 1.72;
    }

//    override metodo area di IFigura
    @Override
    public double area() {
//        calcolo area
        return Math.pow(getLato1(), 2) * COSTANTEAREA;
    }

//    metodo toString
    @Override
    public String toString() {
        return "PENTAGONO"
                + "\n\tLATI = " + getLato1()
                + "\n\tPERIMETRO = " + perimetro()
                + "\n\tAREA = " + area()
                + "\n_____________________________________________";
    }

//    metodo statico di test
    public static void test() {
        Pentagono pentagono = new Pentagono(3);
        System.out.println(pentagono);
    }
}
