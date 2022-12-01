public class Aplicacao {

  public static void main(String[] args) {

    PessoaFisica joao = new PessoaFisica();
    PessoaFisica jose = new PessoaFisica();
    PessoaJuridica antonio = new PessoaJuridica();

    jose.addConta(contaDoJose);
    jose.addConta(contaDoJose2);

    ContaCorrente contaCorrenteDoJoao = ContaCorrente.abrir(joao, 1000.0); //armazenar o saldo

    ContaPoupanca contaPoupancaDoJoao = ContaPoupanca.abrir(joao, 1000.0); //validar se não é PJ

    ContaInvestimento contaInvestimentoDoJoao = ContaInvestimento.abrir(joao, 1000.0);
    //validar rendimento do PF
    //validar rendimento do PJ

    ContaCorrente contaCorrenteDoAntonio = ContaCorrente.abrir(antonio, 1000.0);
    ContaInvestimento contaInvestimentoDoAntonio = ContaInvestimento.abrir(antonio, 1000.0);

    ContaCorrente contaCorrenteDoJose = ContaCorrente.abrir(jose, 1000.0);

    contaCorrenteDoJoao.sacar(50.0); //subtrair do saldo o valor + 0.5%
    contaCorrenteDoJoao.saldo(); // sysout
    contaCorrenteDoJoao.depositar(50,0); //acrescentar no saldo
    contaCorrenteDoJoao.transferir(50,0, contaCorrenteDoJose); 
    //deve descontar o valor + 0.5%
    //acrescentar valor ao saldo da conta destino

    contaInvestimentoDoAntonio.investir(1000.00);

   

    contaInvestimentoDoAntonio.rendimento?


    





  }
  
}
