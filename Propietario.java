import java.util.ArrayList;

public class Propietario {
    private int cpf, rg;
    private Endereco endereco;
    private ArrayList<Imovel> imoveis_do_propietario = new ArrayList<Imovel>();
    public Propietario(int cpf,int rg, String rua, int cep,String cidade, String estado,int numero , Imovel imovel) {
        this.setCpf(cpf);
        this.setRg(rg);
        this.endereco = new Endereco(rua,numero, cep, cidade, estado );//COMPOSIÇÃO FORTE!
        this.imoveis_do_propietario.add(imovel);
    }

    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
    public void adicionaImovel(Imovel imovel) {
    	this.imoveis_do_propietario.add(imovel);
    }
    
    public void listaImoveis(){
    	for(int i=0; i<this.imoveis_do_propietario.size(); i++) {
    		System.out.println(this.imoveis_do_propietario.get(i).toString()); 
    	}
    }
    
    public void listaImoveisPorTipo(String tipo){
    	for(int i=0; i<this.imoveis_do_propietario.size(); i++) {
    		if(this.imoveis_do_propietario.get(i).getTipo().equals(tipo))
    		System.out.println(this.imoveis_do_propietario.get(i).toString()); 
    	}
    }

}
