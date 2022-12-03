package br.com.ada.bank.model.conta;
import br.com.ada.bank.model.pessoa.Pessoa;

public class ContaCorrente extends Conta {

  public ContaCorrente (Pessoa titular, Double saldoInicial) {
    super.titular = titular;
    super.saldo = saldoInicial;
  }

  @Override
  public void sacar(Double valor) {
    if (super.saldo < (valor + valor * 0.05)) {
      throw new IllegalArgumentException("Saldo insuficiente");
    } else if (titular.getDoc().getType().equals("j")) {
      super.saldo -= valor * 0.05;
    }
    super.saldo -= valor;
  }

  @Override
  public void transferir(Double valor, Conta destinatario) {
    if (super.saldo < (valor + valor * 0.05)) {
      throw new IllegalArgumentException("Saldo insuficiente");
    } else if (titular.getDoc().getType().equals("j")) {
      super.saldo -= valor * 0.05;
    }
    super.saldo -= valor;
    destinatario.saldo += valor;
  }

}
