package Lista06.B;

public class Main {
    public static void main(String[] args) {

        //Criando objetos
        Circulo circulo = new Circulo(0);
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo(0);
        Retangulo retangulo = new Retangulo(0);

        //Instanciando objetos
        circulo.areaCirculo(circulo);
        quadrado.areaQuadrado(quadrado);
        triangulo.areaTriangulo(triangulo);
        retangulo.areaRetangulo(retangulo);

    }
}
