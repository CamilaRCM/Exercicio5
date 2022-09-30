package br.com.exercicio5;

public abstract class PoligonoRegular {
  public int numLados;
  public float tamLados;

  public PoligonoRegular(int numLados, float tamLados) {
    this.numLados = numLados;
    this.tamLados = tamLados;
  }

  public int getNumLados() {
    return numLados;
  }

  public void setNumLados(int numLados) {
    this.numLados = numLados;
  }

  public float getTamLados() {
    return tamLados;
  }

  public void setTamLados(float tamLados) {
    this.tamLados = tamLados;
  }

  public float calcularPerimetro(){
    return 0;
  }

  public abstract float calcularArea();
}
