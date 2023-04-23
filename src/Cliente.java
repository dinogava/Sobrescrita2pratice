import java.math.BigDecimal;

public class Cliente extends PessoaFisica{

   private BigDecimal limiteCrediario;
   private BigDecimal limiteUtilizado;
   private Double percentualDesconto;
    public Cliente (){

    }
    public  Cliente(Integer id,String nome,String endereco,String telefone,String cpf,String rg,
                    String sexo,BigDecimal limiteCrediario,BigDecimal limiteUtilizado,Double percentualDesconto){

        this.setID(id);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setCPF(cpf);
        this.setRG(rg);
        this.setSexo(sexo);
        this.limiteCrediario = limiteCrediario;
        this.limiteUtilizado = limiteUtilizado;
        this.percentualDesconto = percentualDesconto;
    }
    public void aumentaLimiteCrediario(BigDecimal valorAumento){
        this.limiteCrediario = this.limiteCrediario.add(valorAumento);
    }
    public void abaixaLimiteCrediario(BigDecimal reducao){
      this.limiteCrediario = this.limiteCrediario.subtract(reducao);
    }

    @Override
    public BigDecimal desconto() {
        BigDecimal totalDesc = BigDecimal.valueOf(this.percentualDesconto);

        return totalDesc;
    }

    public BigDecimal getLimiteCrediario() {
        return limiteCrediario;
    }

    public void setLimiteCrediario(BigDecimal limiteCrediario) {
        this.limiteCrediario = limiteCrediario;
    }

    public BigDecimal getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(BigDecimal limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "limiteCrediario=" + limiteCrediario +
                ", limiteUtilizado=" + limiteUtilizado +
                '}';
    }
}
