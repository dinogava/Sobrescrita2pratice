import java.math.BigDecimal;

public class PessoaFisica extends Pessoa{
   private String CPF;
   private String RG;
   private String sexo;
   private BigDecimal percentualDesconto;





    public PessoaFisica(){

    }
    public PessoaFisica(String cpf, String rg, String sexo){

           this.CPF = cpf;
           this.RG = rg;
           this.sexo = sexo;

    }
    public BigDecimal desconto (){

        BigDecimal totalDesc= this.percentualDesconto;

        return totalDesc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public BigDecimal getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(BigDecimal percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }


    @Override
    public String getDocumentoPrincipal() {
        return this.CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
