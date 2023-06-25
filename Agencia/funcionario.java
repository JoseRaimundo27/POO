public class Funcionario
{
    private String nome, funcao, matricula, departamento;
    private int salario;

    public Funcionario(String nome, String funcao, String matricula, String departamento, int salario){
        this.nome = nome;
        this.funcao = funcao;
        this.matricula = matricula;
        this.departamento = departamento;
        this.salario = salario;
      }
  public String getMatricula(){
    return this.matricula;
  }
  public String getNome(){
    return this.nome;
  }
}
