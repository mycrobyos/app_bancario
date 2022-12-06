package br.com.ada.fila;

public class TesteFilas {

  public static void main(String[] args) {

    // FilaProf filaP = new FilaProf();

    // filaP.inserir(1);
    // filaP.inserir(2);
    // filaP.inserir(3);
    // filaP.inserir(4);
    // filaP.inserir(5);



    // for (int i=0;i<filaP.get().length; i++){
    //   System.out.println(filaP.get()[i]);
    // }

    FilaColega filaC = new FilaColega(20);
    filaC.add(1);
    filaC.add(2);
    filaC.add(3);
    filaC.add(4);
    filaC.add(5);

    for (int i=0;i<filaC.get().length; i++){
      System.out.println(filaC.get()[i]);
    }

  }

}
