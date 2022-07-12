package Lista06.B;

import java.util.Scanner;

public abstract class FiguraGeometrica implements Area {

    Scanner scan = new Scanner(System.in);
   protected int lados = 0;
   protected int i = lados;
   protected double area = 0;

    @Override
    public void areaCirculo(Circulo circulo) {
        System.out.println("_____CIRCULO_____");
        System.out.println("Digite o valor do raio");
        float raio = scan.nextFloat();
        area = raio * 3.14;
        System.out.println("A area e " +area);
    }

    @Override
    public void areaQuadrado(Quadrado quadrado) {
        System.out.println("_____QUADRADO_____");
        System.out.println("Digite o valor do lado");
        float lado = scan.nextFloat();
        area = lado * lado;
        System.out.println("A area e " +area);
    }

    @Override
    public void areaRetangulo(Retangulo retangulo) {
        System.out.println("_____RETANGULO_____");
        System.out.println("Digite o valor do lado");
        float lado = scan.nextFloat();
        System.out.println("Digite o valor da base");
        float base = scan.nextFloat();
        area = base * lado;
        System.out.println("A area e " +area);

    }

    @Override
    public void areaTriangulo(Triangulo triangulo) {
        System.out.println("_____TRIANGULO_____");
        System.out.println("Digite a altura do triangulo");
        float altura = scan.nextFloat();
        System.out.println("Digite o tamanho da base");
        float base = scan.nextFloat();
        area = (base * altura)/2;
        System.out.println("A area e de " +base);
    }
}
