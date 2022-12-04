package br.com.ada.bank.model.conta;

public class ContaFactory {

  public static Conta abrirConta(Conta conta) {

    if(conta.getTitular().getClass().getSimpleName().equals("PessoaJuridica")
        && conta.getClass().getSimpleName().equals("ContaPoupanca")){
      throw new IllegalArgumentException("Empresas não podem abrir poupança");
    }
    return conta;
  }
  
}
