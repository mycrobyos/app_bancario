package br.com.ada.bank.model.conta;

import br.com.ada.bank.model.pessoa.Pessoa;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(Pessoa titular, Double saldoInicial) {
    super.titular = titular;
    super.saldo = saldoInicial;
  }


}
