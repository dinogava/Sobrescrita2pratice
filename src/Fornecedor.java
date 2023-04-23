import java.math.BigDecimal;

public class Fornecedor extends PessoaJuridica{

    private String responsavel;
    private String observacao;
    private BigDecimal margemDeLucro;
    public Fornecedor(){

    }
    public Fornecedor(int ID, String nome, String endereco, String telefone,String CNPJ, String inscricaoEstadual,
                      String CNAE,String responsavel,String observacao,BigDecimal margemDeLucro) {
        this.setID(ID);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setCNPJ(CNPJ);
        this.setInscricaoEstadual(inscricaoEstadual);
        this.setCNAE(CNAE);
        this.responsavel = responsavel;
        this.observacao = observacao;
        this.margemDeLucro = margemDeLucro;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;

    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public BigDecimal getMargemDeLucro() {
        return margemDeLucro;
    }

    public void setMargemDeLucro(BigDecimal margemDeLucro) {
        this.margemDeLucro = margemDeLucro;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "responsavel='" + responsavel + '\'' +
                ", observacao='" + observacao + '\'' +
                '}';
    }

}

