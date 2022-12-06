package br.com.ada.fila;

public class FilaProf {

  static final int MAX = 20;
  int inicio;
  int fim;
  int tamanho = MAX;
  int[] vetor = new int[tamanho];

  public void inserir(int valor) {

    
    if (fim == inicio) {
      System.out.println("Fila cheia");
      return;
    }
    int prox = proximo(fim);
    fim = prox;
    vetor[prox] = valor;
  }

  public int remover() {

    if (isVazia()) {
      System.out.println("Fila vazia");
      return 0;
    }

    int primeiro = vetor[inicio];

    if (inicio < tamanho) {
      vetor[inicio] = 0;
      inicio++;
    } else {
      inicio = 0;
    }
    return primeiro;
  }

  public int[] get() {
    return this.vetor;
  }

  private int proximoComMod() {
    return (fim + 1) % tamanho;
  }

  private int proximo(int ponteira) {
    if (ponteira < tamanho) {
      return ponteira + 1;
    } else {
      return -1;
    }
  }

  private boolean isVazia() {
    return inicio == fim;
  }

}
