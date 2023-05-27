package numeropar;

import java.util.Scanner;

public class Numero {

    Scanner entrada = new Scanner(System.in);

    private Double a;

    public void SetA() {
        System.out.println("Digite um Número: ");
        this.a = entrada.nextDouble();

    }

    public Double GetA() {
        return this.a;
    }

    public void SetPar() {
        System.out.println("PAR ");

    }

    public void SetImpar() {
        System.out.println("IMPAR");

    }

}
