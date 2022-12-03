public class ContaPoupanca extends Conta {

  public ContaPoupanca (Pessoa titular, Double saldoInicial) {
    if(titular.doc.type.equals("f")){
      super.titular = titular;
      super.saldo = saldoInicial;
    } else {
      throw new IllegalArgumentException("Pessoa Juridica não pode abrir poupança");
    }
  }

}
