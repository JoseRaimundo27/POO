public class UnidadeAutonoma extends Imovel{
    private int areaUtil, areaConstruida;

    public UnidadeAutonoma(int iptu,String tipo,String utilizacao, String rua, int numero, int cep, String cidade, String estado,int areaUtil, int areaConstruida){
        super(iptu, tipo, utilizacao, rua, numero, cep, cidade, estado);
        this.areaConstruida = areaConstruida;
        this.areaUtil = areaUtil;
        
    }

    public int valorReferencia(){
        return  this.areaConstruida*15;
    }
    
}
