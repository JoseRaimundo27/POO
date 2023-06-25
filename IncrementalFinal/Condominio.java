import java.util.*;
public class Condominio  {
    private Endereco endereco;
    private ArrayList<String> lazer = new ArrayList<String>();
    public Condominio(Endereco endereco, String itens){
        this.lazer.add(itens);
        this.endereco = endereco;
    }

    public int qntdLazer(){
        return this.lazer.size();
    }


}
