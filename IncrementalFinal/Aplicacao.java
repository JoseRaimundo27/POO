import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Utilizando herança para Unidades autonomas e compartilhadas:
        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
        imoveis.add(new UnidadeAutonoma(500, "campo", "aluguel", "Rua Colmar", 25, 4170, "Salvador", "Bahia", 300,
                200));
        Condominio condominio = new Condominio(null, "Piscina");
        imoveis.add(new UnidadeCompartilhada(500, "rural", "pousada", "Rua Alexandre", 19, 2130, "Lauro de freitas",
                "Bahia", "Primeira casa", "Centro", "rosas", condominio));
        System.out.println("Defina a sazonalidade");
        float sazon = indiceSazonalidade(in.nextInt()); // Sazonalidade de carnaval

        for (Imovel im : imoveis) {
            if (im instanceof UnidadeAutonoma) {
                UnidadeAutonoma temp = (UnidadeAutonoma)im; //Realizando downcast para utilizar metodo valor de ref
                System.out.println("Valor de referencia básico:" + temp.valorReferencia()); // Utilização de
                                                                                          // polimorfismo
                float valorFinal = temp.valorReferencia() + temp.valorReferencia() * sazon;
                System.out.println("Valor de referencia com sazonalidade:" + valorFinal);
            } else if (im instanceof UnidadeCompartilhada) {
                UnidadeCompartilhada temp = (UnidadeCompartilhada)im; //Realizando downcast para utilizar metodo valor de ref
                if (temp.qntdLazer() == 0) {
                    float valorReferenciaNovo = temp.valorReferencia() * 0.9f;
                    System.out.println("Valor de referencia básico:" + valorReferenciaNovo);
                    float valorFinal = valorReferenciaNovo + valorReferenciaNovo * sazon;
                    System.out.println("Valor de referencia com sazonalidade:" + valorFinal);
                } else {
                    System.out.println("Valor de referencia básico:" + temp.valorReferencia());
                    float valorFinal = temp.valorReferencia() + temp.valorReferencia() * sazon;
                    System.out.println("Valor de referencia com sazonalidade:" + valorFinal);
                }
            }

            while (true) {
                menuPrincipal();
            }
        }
    }

    private static void menuPrincipal() {
        System.out.println("Defina a opção: \na) cadastrar imóvel \nb) cadastrar propietário \n c) valores de ref");
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

    private static float indiceSazonalidade(int i) {
        if (i == 1) {
            return 0.2f;
        } else if (i == 2) {
            return 0.15f;
        } else if (i == 3) {
            return 0.10f;
        } else if (i == 4) {
            return 0.05f;
        } else {
            return 1;
        }
    }

}
