package br.com.ada.bank.model.pessoa;
import br.com.ada.bank.model.doc.Documento;

public abstract class Pessoa {

  private String name;
  private Documento doc;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Documento getDoc() {
    return doc;
  }
  public void setDoc(Documento doc) {
    this.doc = doc;
  }
  

  
}
