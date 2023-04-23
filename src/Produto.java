import java.math.BigDecimal;

public class Produto {
    private Integer id;
    private String descricao;
    private Fornecedor fornecedor;
    private BigDecimal precoUnitario;
    private BigDecimal valorvenda;

    public Produto (){

    }
    public Produto(Integer id, String descricao, Fornecedor fornecedor, BigDecimal precoUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.precoUnitario = precoUnitario;
    }
    public BigDecimal valorDeVenda(BigDecimal precoUnitario){
       BigDecimal valorVen = precoUnitario.add(precoUnitario.multiply(fornecedor.getMargemDeLucro().divide(BigDecimal.valueOf(100.00))));
        this.valorvenda = valorVen;
        return this.valorvenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", fornecedor=" + fornecedor +
                ", precoUnitario=" + precoUnitario +
                '}';
    }
}
