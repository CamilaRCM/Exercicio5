package br.com.exercicio5;

public class Main {
  public static void main(String[] args) {
    Quadrado quadrado1 = new Quadrado(2, 5);
    System.out.println(quadrado1.calcularArea());    

    Triangulo triangulo = new Triangulo(2, 10);
    System.out.println(triangulo.calcularArea());
  }
}
