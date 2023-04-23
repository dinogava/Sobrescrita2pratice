public class Pessoa {

   private Integer ID;
   private String nome;
   private String endereco;
   private String telefone;

   public Pessoa(){

   }

    public Pessoa(Integer ID, String nome, String endereco, String telefone) {
        this.ID = ID;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getDocumentoPrincipal(){

       return "";

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
