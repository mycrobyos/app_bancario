package br.com.ada.bank.model.pessoa;

import br.com.ada.bank.model.doc.Documento;

public class CadastroFactory {

  public static Pessoa fichaDeCadastro(Documento doc) {

    if(doc.getClass().getSimpleName().equals("Cnpj")){
      return new PessoaJuridica();
    } else if(doc.getClass().getSimpleName().equals("Cpf")){
      return new PessoaFisica();
    }
    throw new IllegalArgumentException("Tipo de documento não contemplado");
  }
  
}
