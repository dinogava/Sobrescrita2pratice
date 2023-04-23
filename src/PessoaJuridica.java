public class PessoaJuridica extends Pessoa{
   private String CNPJ;
   private String inscricaoEstadual;
   private String CNAE;

    public PessoaJuridica (){

    }

    public PessoaJuridica(String CNPJ, String inscricaoEstadual, String CNAE) {
        this.CNPJ = CNPJ;
        this.inscricaoEstadual = inscricaoEstadual;
        this.CNAE = CNAE;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCNAE() {
        return CNAE;
    }

    public void setCNAE(String CNAE) {
        this.CNAE = CNAE;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.CNPJ;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", CNAE='" + CNAE + '\'' +
                '}';
    }
}
