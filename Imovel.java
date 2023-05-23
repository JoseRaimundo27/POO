
public class Imovel
{
    private int iptu;
    private String tipo, utilizacao;
    public Endereco endereco_imovel;
    public Imovel(int iptu,String tipo,String utilizacao, String rua, int numero, int cep, String cidade, String estado)
    {
       this.iptu = iptu; 
       this.tipo = tipo;
       this.utilizacao = utilizacao;
       this.endereco_imovel = new Endereco(rua,numero, cep, cidade, estado );//COMPOSIÇÃO FORTE!
    }
    
   //GETS E SETS:
   public int getIptu(){
       return this.iptu;
    }
   public void setIptu(int iptu){
       this.iptu = iptu;
    }
   public String getTipo(){
       return this.tipo;
    }
   public void setTipo(String tipo){
       this.tipo = tipo;
    }
   public String getUtilizacao(){
       return this.utilizacao;
    }
   public void setUtilizacao(String utilizacao){
       this.utilizacao = utilizacao;
    }
    
   public String toString() {
	   return "--------------------" + "\n iptu = " + this.iptu + "\n tipo = "+this.tipo+ "\n utilização = " + this.utilizacao + "\n rua = " + endereco_imovel.getRua()+ "\n numero = "+ endereco_imovel.getNumero() + "\n cep = " + endereco_imovel.getCep() + "\n cidade = " + endereco_imovel.getCidade() + "\n estado = " + endereco_imovel.getEstado() + "\n --------------------";
   }
   
   
   
    
    

}

