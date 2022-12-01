import java.util.List;

public abstract class Pessoa {

  List<IConta> contas;
  String nome;

  public List<IConta> getContas() {
    return contas;
  }

  public void addConta(IConta conta) {
    this.contas.add(conta);
  }

  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
}
