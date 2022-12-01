public abstract class AbstractConta implements IConta {

  Double taxa;
  Double saldo;
  
  public AbstractConta(Double taxa) {
    this.taxa = taxa;
    this.saldo = 0.0;
  }

  public Double getTaxa() {
    return taxa;
  }

  public void setTaxa(Double taxa) {
    this.taxa = taxa;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  @Override
  public AbstractConta abrir(Pessoa titular) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void consultar() {
    System.out.println(saldo);
  }

  @Override
  public void depositar(Double valor) {
    saldo += valor;    
  }

  @Override
  public void sacar(Double valor) {
    saldo -= (valor*taxa + valor);   
  }

  @Override
  public void transferir(Double valor, AbstractConta contaDestino) {
    saldo -= (valor*taxa + valor);
    contaDestino.depositar(valor);    
  }
  
}
