package br.com.ada.bank;
import br.com.ada.bank.model.conta.Conta;
import br.com.ada.bank.model.conta.ContaCorrente;
import br.com.ada.bank.model.conta.ContaFactory;
import br.com.ada.bank.model.conta.ContaInvestimento;
import br.com.ada.bank.model.conta.ContaPoupanca;
import br.com.ada.bank.model.doc.Cnpj;
import br.com.ada.bank.model.doc.Cpf;
import br.com.ada.bank.model.doc.Documento;
import br.com.ada.bank.model.pessoa.CadastroFactory;
import br.com.ada.bank.model.pessoa.Pessoa;

public class Aplicacao {

  public static void main(String[] args) {

    //clientes apresentam documentos

    Documento cpfDoJoao = new Cpf("123.456.789-10");
    Documento cpfDoJose = new Cpf("321.654.987-11");
    Documento cnpjDaOficina = new Cnpj("100.100.100/0001-10");

    //pessoas criadas com factory/!!!

    Pessoa joao = CadastroFactory.fichaDeCadastro(cpfDoJoao);
    Pessoa jose = CadastroFactory.fichaDeCadastro(cpfDoJose);
    Pessoa oficina = CadastroFactory.fichaDeCadastro(cnpjDaOficina);

    //sao pessoas fisicas pq clientes apresentaram cpf
    joao.setName("joao");
    joao.setDoc(cpfDoJoao);

    jose.setName("jose");
    jose.setDoc(cpfDoJose);

    //é uma pessoa juridica pq cliente apresentou cnpj

    oficina.setName("oficina");
    oficina.setDoc(cnpjDaOficina);

    //factory de contas valida se pessoas e contas são compatíveis

    Conta contaDoJoao = ContaFactory.abrirConta(new ContaCorrente(joao, 1000.0));
    Conta contaDoJose = ContaFactory.abrirConta(new ContaPoupanca(jose, 1000.0));
    Conta contaDaOficina = ContaFactory.abrirConta(new ContaInvestimento(oficina, 1000.0));

    //realizar movimentações


  }

  
}
