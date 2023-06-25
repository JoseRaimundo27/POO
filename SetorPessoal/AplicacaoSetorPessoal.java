import java.util.*;

class AplicacaoSetorPessoal {
  private static String nomeFunc, funcaoFunc, matriculaFunc, departamentoFunc, nomeAuxiliar;
  private static int salarioFunc;
  private static Scanner in = new Scanner(System.in);

  public static void contrataFun(SetorPessoal sp, String nome, String funcao, String matricula, String departamento,
      int salario) {
    sp.addFuncionario(nome, funcao, matricula, departamento, salario);
  }

  public static void demiteFunByName(SetorPessoal sp, String nomeAuxiliar) {
    if (sp.demiteFuncionario(nomeAuxiliar)) {
      System.out.println("Funcionário demitido com sucesso");
    }else{
      System.out.println("Não há funcionário com esse nome");
    }
    // Ler dados de entrada: (idade<18)
    // consistencia dos dados
    // chamar add funnario
  }

  public static boolean checaEntrada(String nomeFunc, int salarioFunc) {
    if (nomeFunc.equals(null)) {
      System.out.println("Digite um nome válido");
      return false;
    } else if (salarioFunc <= 0) {
      System.out.println("Digite um salário válido");
      return false;
    }
    return true;
  }

  public static void listaFuncionarios(SetorPessoal sp){
           System.out.println(sp.toString());
  }

  public static boolean menuPrincipal(SetorPessoal sp) {
    System.out.println("---------------------------------------------");
    System.out.println("O que deseja fazer? \n a) contratar funcionário \n b) demitir funcionario \n c) lista funcionários \n d) sair");
    String opcao = in.nextLine();
    if (opcao.equals("a")) {
      System.out.println("Nome do funcionario: ");
      nomeFunc = in.nextLine();
      System.out.println("Função do funcionário:  ");
      funcaoFunc = in.nextLine();
      System.out.println("Matricula do funcionario: ");
      matriculaFunc = in.nextLine();
      System.out.println("Departamento: ");
      departamentoFunc = in.nextLine();
      System.out.println("Salario ");
      salarioFunc = in.nextInt();

      if (!checaEntrada(opcao, salarioFunc)) {
        menuPrincipal(sp); // Reinicia aplicação
      } else {
        contrataFun(sp, nomeFunc, funcaoFunc, matriculaFunc, departamentoFunc, salarioFunc);
        System.out.println("Funcionário contratado ");

      }

    } else if (opcao.equals("b")) {
      System.out.println("b: Digite o nome do funcionário a ser demitido: ");
      nomeAuxiliar = in.nextLine();
      if (checaEntrada(nomeAuxiliar, 1)) {
        demiteFunByName(sp, nomeAuxiliar);
      }
    } else if (opcao.equals("c")) {
      listaFuncionarios(sp);
      
    }else if(opcao.equals("d")){
      System.out.println("Finalizando programa...");
      return false;
    }
    System.out.println("---------------------------------------------");
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Digite o nome do gerente: ");
    SetorPessoal sp = new SetorPessoal(in.nextLine());
    // chamar menu principal. Este menu deve contratar qtos func o
    // gerente deseja
    while (menuPrincipal(sp)) {
      menuPrincipal(sp);
    }

    // dentro do menu principal chamar o contrata funcionario

  }
}