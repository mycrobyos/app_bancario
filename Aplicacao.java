public class Aplicacao {

  public static void main(String[] args) {

    Documento cpfDoJoao = new Cpf("123.456.789-10");
    Documento cpfDoJose = new Cpf("321.654.987-11");
    Documento cnpjDaOficina = new Cnpj("100.100.100/0001-10");

    Pessoa joao = new PessoaFisica("joao", cpfDoJoao);
    Pessoa jose = new PessoaFisica("jose", cpfDoJose);
    Pessoa oficina = new PessoaJuridica("oficina", cnpjDaOficina);

    Conta contaCorrenteDoJoao = new ContaCorrente(joao, 1000.0);

    Conta contaPoupancaDoJose = new ContaPoupanca(jose, 1000.0);

    Conta contaInvestimentoDaOficina = new ContaInvestimento(oficina, 1000.0);

    contaCorrenteDoJoao.depositar(50.0);
    contaCorrenteDoJoao.sacar(50.0);
    contaCorrenteDoJoao.consultar();

    contaPoupancaDoJose.depositar(60.0);
    contaPoupancaDoJose.sacar(100.0);
    contaPoupancaDoJose.consultar();

    contaInvestimentoDaOficina.depositar(50.0);
    contaInvestimentoDaOficina.sacar(5000.0);
    contaInvestimentoDaOficina.consultar();

    contaInvestimentoDaOficina.transferir(1000.0, contaCorrenteDoJoao);
    contaInvestimentoDaOficina.consultar();
    contaCorrenteDoJoao.consultar();
  }

  
}
