package br.com.ada.bank.model.doc;

import br.com.ada.bank.model.pessoa.Pessoa;
import br.com.ada.bank.model.pessoa.PessoaFisica;
import br.com.ada.bank.model.pessoa.PessoaJuridica;

public class ClienteFactory {

  public static Pessoa cadastrarCliente(Documento doc) {

    if(doc.getClass().getSimpleName().equals("Cnpj")){
      return new PessoaJuridica();
    } else if(doc.getClass().getSimpleName().equals("Cpf")){
      return new PessoaFisica();
    }
    throw new IllegalArgumentException("Tipo de documento não contemplado");
  }
  
}
