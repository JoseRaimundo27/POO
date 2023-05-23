import java.util.Scanner;

public class Aplicacao {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menuPrincipal();
        }
    }

    private static void menuPrincipal() {
        System.out.println("Defina a opção: \na) cadastrar imóvel \nb) cadastrar propietário");
        String opcao = in.nextLine();
        if (opcao.equals("a")) {
            System.out.println("Qual o nome da rua? \n");
            String rua = in.nextLine();
            System.out.println("Qual o tipo de imóvel? \n");
            String tipo = in.nextLine();
            System.out.println("Qual a utilização? \n");
            String utilizacao = in.nextLine();
            System.out.println("Qual a cidade? \n");
            String cidade = in.nextLine();
            System.out.println("Qual o estado? \n");
            String estado = in.nextLine();
            System.out.println("Qual o valor do IPTU? \n");
            Integer iptu = in.nextInt();
            System.out.println("Qual o CEP? \n");
            Integer cep = in.nextInt();
            System.out.println("Qual o número da casa? \n");
            Integer numero = in.nextInt();
            cadastrarImovel(iptu, tipo, utilizacao, rua, numero, cep, cidade, estado);
        } else if (opcao.equals("b")) {
            System.out.println("Qual o nome do propietario? \n");
            String nome = in.nextLine();
            System.out.println("Qual o cpf do propietario? \n");
            String cpf = in.nextLine();
            System.out.println("Qual o nome da rua de residência propietario? \n");
            String rua = in.nextLine();
            System.out.println("Qual a cidade de residência do propietario? \n");
            String cidade = in.nextLine();
            System.out.println("Qual o estado de residência do propietario? \n");
            String estado = in.nextLine();
            System.out.println("Qual o RG do propietario? \n");
            Integer rg = in.nextInt();
            System.out.println("Qual o numero da casa do propietario? \n");
            Integer numero = in.nextInt();
            System.out.println("Qual o cep de residência do propietario? \n");
            Integer cep = in.nextInt();

            cadastrarPropietario(nome, cpf, rg, rua, cep, cidade, estado, numero);
            
        }

    }

    private static void cadastrarPropietario(String nome, String cpf, int rg, String rua, int cep, String cidade,
            String estado, int numero) {
        Propietario propietario = new Propietario(nome, cpf, rg, rua, cep, cidade, estado, numero);
        listaPropietario(propietario);
    }

    private static void listaPropietario(Propietario propietario) {
        System.out.println(propietario.toString());
    }

    private static void cadastrarImovel(int iptu, String tipo, String utilizacao, String rua, int numero, int cep,
            String cidade, String estado) {
        Imovel imovel = new Imovel(iptu, tipo, utilizacao, rua, numero, cep, cidade, estado);
        listaImovel(imovel);
    }

    private static void listaImovel(Imovel imovel) {
        System.out.println(imovel.toString());
    }

}
