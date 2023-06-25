import java.util.*;
class AplicacaoSetorPessoal{
   
  public static void main(String[] args){
     SetorPessoal sp ;
    System.out.println("Digite o nome do gerente: ");
    Scanner in = new Scanner(System.in);  
    sp = new SetorPessoal(in.nextLine());
    //chamar menu principal. Este menu deve contratar qtos func o
    //gerente deseja
    //dentro do menu principal chamar o contrata funcionario
  
  }
  public static void contrataFun(SetorPessoal sp){
    //Ler dados de entrada:
    // consistencia dos dados
    //chamar add funnario

    sp.addFuncionario();
  }
  public static void demiteFun(SetorPessoal sp){
    //Ler dados de entrada:
    // consistencia dos dados
    //chamar add funnario
  }
  public static void menuPrincipal(){
    //Menu que vai contratar (chamar funções de contratação e demissao de funcionários!)
  }
}