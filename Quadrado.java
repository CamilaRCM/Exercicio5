package br.com.exercicio5;

public class Quadrado extends PoligonoRegular{

  public Quadrado(int numLados, float tamLados) {
    super(numLados, tamLados);    
  }

  @Override
  public float calcularArea() {    
    return getNumLados() * getTamLados();
  }
  
}
