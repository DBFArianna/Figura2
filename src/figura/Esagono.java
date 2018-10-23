package figura;

public class Esagono extends Figura {

//    costante privata globale
    private final double COSTANTEAREA;

//    costruttore
    public Esagono(double lato1) {
        super(6, lato1);
        this.COSTANTEAREA = 2.598;
    }

//    override metodo area di IFigura
    @Override
    public double area() {
//        calcolo area
        return Math.pow(getLato1(), 2) * COSTANTEAREA;
//        OPPURE
//////        return (Math.sqrt(3) / 4) * Math.pow(getLato1(), 2) * 6;
    }

//    metodo toString
    @Override
    public String toString() {
        return "ESAGONO"
                + "\n\tLATI = " + getLato1()
                + "\n\tPERIMETRO = " + perimetro()
                + "\n\tAREA = " + area()
                + "\n_____________________________________________";
    }

//    metodo statico di test
    public static void test() {
        Esagono esagono = new Esagono(4);
        System.out.println(esagono);
    }

}
