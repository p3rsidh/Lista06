package Lista06.B;

import java.util.Scanner;

public class Circulo extends FiguraGeometrica{

    float raio;
    Scanner scan = new Scanner(System.in);

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }



}
