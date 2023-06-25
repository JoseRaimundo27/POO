import java.util.ArrayList;

class SetorPessoal {
  private String nomeGerente;
  private ArrayList<Funcionario> funcionarios;

  public SetorPessoal(String nomeGerente) {
    this.nomeGerente = nomeGerente;
    this.funcionarios = new ArrayList<Funcionario>();
  }

  public boolean addFuncionario(String nome, String funcao, String matricula, String departamento, int salario) {
    for (Funcionario func : this.funcionarios) {
      if (nome.equals(func.getNome()) && matricula.equals(func.getMatricula())) {
        return false;
      }
    }
    Funcionario funcionario = new Funcionario(nome, funcao, matricula, departamento, salario);
    return funcionarios.add(funcionario);
  }

  public boolean demiteFuncionario(String nome) {
    for (Funcionario func : this.funcionarios) {
      if (nome.equals(func.getNome())) {
        funcionarios.remove(func);
        return true;
      }
    }
    return false;
  }

  public String toString() {
    return "Gerente: " + this.nomeGerente + funcionarios.toString();
  }
  // mudarGerente? toString?

}