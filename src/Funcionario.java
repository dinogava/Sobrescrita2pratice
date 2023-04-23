import java.math.BigDecimal;

public class Funcionario extends PessoaFisica{

   private BigDecimal salarioBruto;
   private BigDecimal salarioLiquido;
   private Double percentualDesconto = 30.00;

    public Funcionario (){

    }
    public Funcionario(int id,String nome,String endereco,String telefone,String cpf,
                       String rg,String sexo,BigDecimal salarioBruto,BigDecimal salarioLiquido){
        this.setID(id);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setCPF(cpf);
        this.setRG(rg);
        this.setSexo(sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;

    }
    public BigDecimal calculaDissidio(Double percentual){
        this.salarioBruto = this.salarioBruto.add(salarioBruto.multiply(BigDecimal.valueOf(percentual/100)));

        return this.salarioBruto;


    }


    public BigDecimal getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(BigDecimal salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public BigDecimal getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(BigDecimal salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                '}';
    }
}
