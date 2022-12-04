package br.com.ada.bank.model.doc;

public abstract class Documento {

  private String id;

  public Documento(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
