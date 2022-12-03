public abstract class Conta implements Movimentacoes {

  protected Pessoa titular;
  protected Double saldo;
  
  @Override
  public void consultar() {
    System.out.println(getSaldo());
    
  }
  @Override
  public void depositar(Double valor) {
    this.saldo += valor;
  }

  @Override
  public void sacar(Double valor) {
    if(this.saldo >= valor){
      this.saldo -= valor;
    } else {
      throw new IllegalArgumentException("Saldo Insuficiente");
    }
  }

  @Override
  public void transferir(Double valor, Conta destinatario) {
    if(this.saldo >= valor){
      this.saldo -= valor;
      destinatario.saldo += valor;
    } else {
      throw new IllegalArgumentException("Saldo Insuficiente");
    }
  }

  public Pessoa getTitular() {
    return titular;
  }
  public void setTitular(Pessoa titular) {
    this.titular = titular;
  }
  public Double getSaldo() {
    return saldo;
  }
  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

 
}
