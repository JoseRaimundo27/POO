
public class Endereco {
  private String rua, cidade = "Salvador", estado = "BA";
  private int numero, cep;
  private static String[] sigla_estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
      "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

  public Endereco(String rua, int numero, int cep, String cidade, String estadoNovo) {
    this.rua = rua;
    this.numero = numero;
    this.cep = cep;
    this.cidade = cidade;
    if (this.checaEstado(estadoNovo)) {
      this.estado = estadoNovo;
    } else {
      System.out.println("Sigla inválida");
    }
  }

  public Endereco(String rua, int numero, int cep) {
    this.rua = rua;
    this.numero = numero;
    this.cep = cep;
  }

  public String getRua() {
    return this.rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getCep() {
    return this.cep;
  }

  public void setCep(int cep) {
    this.cep = cep;
  }

  public String getCidade() {
    return this.cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return this.estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  // Método de atualização de endereço
  public void atualizaEndereco(String rua, String cidade, String estado, int cep, int numero) {
    this.cidade = cidade;
    this.estado = estado;
    this.rua = rua;
    this.cep = cep;
    this.numero = numero;

  }

  public void atualizaEndereco(String rua, int cep, int numero) {
    this.rua = rua;
    this.cep = cep;
    this.numero = numero;

  }

  public boolean checaEstado(String estadoNovo) {
    for (int i = 0; i < sigla_estados.length; i++) {
      if (sigla_estados[i].equals(estadoNovo)) {
        return true;
      }
    }
    return false;
  }
}
