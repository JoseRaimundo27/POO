public class UnidadeCompartilhada extends Imovel {
    private String casa, unidade, flores;
    private Condominio condominio;

    public UnidadeCompartilhada(int iptu, String tipo, String utilizacao, String rua, int numero, int cep,
            String cidade, String estado, String casa, String unidade, String flores, Condominio condominio) {
        super(iptu, tipo, utilizacao, rua, numero, cep, cidade, estado);
        this.casa = casa;
        this.unidade = unidade;
        this.flores = flores;
        this.condominio = condominio;


    }
    public int valorReferencia(){
        return getIptu()*condominio.qntdLazer();
    }
    public int qntdLazer(){
        return condominio.qntdLazer();
    }

}
