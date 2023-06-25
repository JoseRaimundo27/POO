import java.util.ArrayList;

public class SetorPessoal{
  private String nomeGerente;
  private ArrayList<Funcionario> funcionarios;
  
  public SetorPessoal(String nomeGerente){
    this.nomeGerente = nomeGerente;
    this.funcionarios = new ArrayList<Funcionario>();
  }
  
  public boolean addFuncionario(String nome, String funcao, String matricula,String departamento, int salario){
  for(Funcionario func : this.funcionarios){
    if(nome.equals(func.getNome()) && matricula.isEqual(func.getMatricula())){
      return false;
    }
  }
  Funcionario funcionario = new Funcionario(nome,funcao,matricula,departamento,salario);
  return funcionarios.add(funcionario);
  }
  //mudarGerente? toString? 
  
}