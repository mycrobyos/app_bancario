public class PessoaFisica extends Pessoa{

  public PessoaFisica(String name, Documento doc) {
    super.name = name;
    if(doc.type.equals("f")){
      super.doc = doc;
    } else {
      throw new IllegalArgumentException("Você deve usar um CPF");
    }
  }
  
}
