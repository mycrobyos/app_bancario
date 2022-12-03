package br.com.ada.bank.model.conta;
import br.com.ada.bank.model.pessoa.Pessoa;

public class ContaPoupanca extends Conta {

  public ContaPoupanca (Pessoa titular, Double saldoInicial) {
    if(titular.getDoc().getType().equals("f")){
      super.titular = titular;
      super.saldo = saldoInicial;
    } else {
      throw new IllegalArgumentException("Pessoa Juridica não pode abrir poupança");
    }
  }

}
