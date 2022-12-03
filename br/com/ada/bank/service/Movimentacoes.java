package br.com.ada.bank.service;
import br.com.ada.bank.model.conta.Conta;

public interface Movimentacoes {
  
  void sacar(Double valor);
  void depositar(Double valor);
  void transferir(Double valor, Conta destinatario);
  void consultar();

}