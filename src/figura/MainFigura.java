package figura;

public class MainFigura {

    public static void main(String[] args) {
//        TriangoloEquilatero.test();
//        TriangoloScaleno.test();
//        Quadrato.test();
//        Rettangolo.test();
//        Pentagono.test();
//        Cerchio.test();

//        Nuovo vettore
        Figura[] f = new Figura[7];

//        Riempimento vettore
        f[0] = new TriangoloEquilatero(4);
        f[1] = new TriangoloScaleno(3, 4, 5);
        f[2] = new Quadrato(4);
        f[3] = new Rettangolo(3, 5);
        f[4] = new Pentagono(4);
        f[5] = new Esagono(5);
        f[6] = new Cerchio(3);
        

//        Stampa contenuto vettore
        for (Figura e : f) {
            System.out.println(e);
        }

    }
}
