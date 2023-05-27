package numeropar;

public class NumeroPar {

    public static void main(String[] args) {

        Numero n = new Numero();

       

        do {
             n.SetA();

            if (n.GetA() >= 0) {
                n.SetPar();
                
            } else {
                n.SetImpar();
                
            }

        } while (n.GetA() != 0);

    }

}
