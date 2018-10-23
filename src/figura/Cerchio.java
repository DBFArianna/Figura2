package figura;

//classe concreta 
import static figura.IFigura.PIGRECO;

//estende classe astratta figura
public class Cerchio extends Figura {

//    costruttore
    public Cerchio(double raggio) {
        super(0, raggio);
    }

//    override metodo perimetro di IFigura    
    @Override
    public double perimetro() {
//        calcolo circonferenza
        return 2 * PIGRECO * getLato1();
    }

//    override metodo area di IFigura
    @Override
    public double area() {
//        calcolo area
        return Math.pow(getLato1(), 2) * PIGRECO;
    }

    @Override
    public String toString() {
        return "CERCHIO"
                + "\n\tRAGGIO = " + getLato1()
                + "\n\tCIRCONFERENZA = " + perimetro()
                + "\n\tAREA = " + area()
                + "\n_____________________________________________";
    }

    public static void test() {
        Cerchio cerchio = new Cerchio(2);
        System.out.println(cerchio);
    }

}
