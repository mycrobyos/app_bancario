public class PessoaJuridica extends Pessoa {

  public PessoaJuridica(String name, Documento doc) {
    super.name = name;
    if(doc.type.equals("j")){
      super.doc = doc;
    } else {
      throw new IllegalArgumentException("Você deve usar um CNPJ");
    }
  }
  
}
