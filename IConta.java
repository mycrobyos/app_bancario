public interface IConta {

  public AbstractConta abrir(Pessoa titular);

  public void sacar(Double valor);

  public void depositar(Double valor);

  public void transferir(Double valor, AbstractConta contaDestino);

  public void consultar();
  
}
