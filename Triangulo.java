package br.com.exercicio5;

public class Triangulo extends PoligonoRegular {

  public Triangulo(int numLados, float tamLados) {
    super(numLados, tamLados);    
  }
  
  @Override
  public float calcularArea() {
    
    return (getTamLados() * getNumLados()) / 2;
  }
}
