package br.com.ada.bank.model.conta;

public interface Movimentacoes {
  
  void sacar(Double valor);
  void depositar(Double valor);
  void transferir(Double valor, Conta destinatario);
  void consultar();

}