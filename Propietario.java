
public class Propietario {
    private int cpf, rg, numero, cep;
    private String cidade,estado, rua;
    
    public Propietario(int cpf, String rua,int rg,  int numero, int cep, String cidade, String estado) {
        this.setCpf(cpf);
        this.setRua(rua);
        this.setNumero(numero);
        this.setCep(cep);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setRg(rg);
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Método de atualização de endereço
    public void atualizaEndereco(String rua,String cidade, String estado, int cep, int numero){
        this.cidade = cidade;
        this.estado = estado;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        
        }
    public void atualizaEndereco(String rua, int cep, int numero){
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        
        }

    

}
