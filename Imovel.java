
public class Imovel
{
    private int iptu, numero, cep;
    private String estado, rua, tipo, utilizacao, cidade;
    public Imovel(int iptu,String rua,int numero,int cep, String estado, String cidade,String tipo,String utilizacao)
    {
       this.iptu = iptu; 
       this.rua = rua;
       this.numero = numero;
       this.estado = estado;
       this.cidade = cidade;
       this.tipo = tipo;
       this.utilizacao = utilizacao;  
    }
    public Imovel(int iptu,String rua,int numero,int cep,String tipo,String utilizacao){
        this.iptu = iptu;
       this.cidade = "Salvador";
       this.estado = "Bahia";
       this.rua = rua;
       this.numero = numero;
       this.tipo = tipo;
       this.utilizacao = utilizacao;  }
    
   //GETS E SETS:
   public int getIptu(){
       return this.iptu;
    }
   public String getRua(){
       return this.rua;
    }
   public int getNumero(){
       return this.numero;
    }
   public int getCep(){
       return this.cep;
    }
   public String getEstado(){
       return this.estado;
    }
   public String getCidade(){
       return this.cidade;
}
   public String getTipo(){
       return this.tipo;
}
   public String getUtilizacao(){
       return this.utilizacao;
    }
    
   public void setIptu(int iptu){
       this.iptu = iptu;
    }
   public void setRua(String rua){
       this.rua = rua;
    } 
   public void setNumero(int numero){
       this.numero = numero;
    }
   public void setCep(int cep){
       this.cep = cep;
    }   
   public void setEstado(String estado){
       this.estado = estado;
    } 
   public void setCidade(String cidade){
       this.cidade = cidade;
    }
   public void setTipo(String tipo){
       this.tipo = tipo;
    }
   public void setUtilizacao(String utilizacao){
       this.utilizacao = utilizacao;
    } 
    

}

