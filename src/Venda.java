import java.math.BigDecimal;
import java.time.LocalDate;

public class Venda {

    private Integer cod;
    private Funcionario funcionario;
    private Cliente cliente;
    private Boolean vendaFuncionario;
    private BigDecimal valorTotalVenda;
    private Integer quantidade;
    private LocalDate dataDaVenda;
    private Produto produto;

    public Venda(Integer cod, Integer quantidade, LocalDate data) {
        this.cod = cod;
        this.quantidade = quantidade;
        this.dataDaVenda = data;
    }

    public Venda(Integer cod, Funcionario funcionario, Boolean vendaFuncionario, Integer quantidade, LocalDate dataDaVenda, Produto produto) {
        this.cod = cod;
        this.funcionario = funcionario;
        this.vendaFuncionario = vendaFuncionario;
        this.quantidade = quantidade;
        this.dataDaVenda = dataDaVenda;
        this.produto = produto;
    }

    public Venda(Integer cod, Funcionario funcionario, Cliente cliente, Boolean vendaFuncionario, Integer quantidade, LocalDate dataDaVenda, Produto produto) {
        this.cod = cod;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.vendaFuncionario = vendaFuncionario;
        this.quantidade = quantidade;
        this.dataDaVenda = dataDaVenda;
        this.produto = produto;
    }

    public BigDecimal valorTotalVenda (){

        BigDecimal valorSDesc = BigDecimal.valueOf(this.quantidade).multiply(produto.valorDeVenda(produto.getPrecoUnitario()));

        if(vendaFuncionario == true){
           this.valorTotalVenda = valorSDesc.subtract(valorSDesc.multiply(BigDecimal.valueOf(30/100)));

        } else if (vendaFuncionario == false) {
            this.valorTotalVenda = valorSDesc.subtract(valorSDesc.multiply(cliente.getPercentualDesconto().divide(new BigDecimal(100.00))));

        }

        return this.valorTotalVenda;
    }





    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public BigDecimal getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(BigDecimal valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return dataDaVenda;
    }

    public void setData(LocalDate data) {
        this.dataDaVenda = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Boolean getVendaFuncionario() {
        return vendaFuncionario;
    }

    public void setVendaFuncionario(Boolean vendaFuncionario) {
        this.vendaFuncionario = vendaFuncionario;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVendas(LocalDate dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cod=" + cod +
                ", funcionario=" + funcionario +
                ", cliente=" + cliente +
                ", vendaFuncionario=" + vendaFuncionario +
                ", valorTotalVenda=" + valorTotalVenda +
                ", quantidade=" + quantidade +
                ", dataDaVenda=" + dataDaVenda +
                ", produto=" + produto +
                '}';
    }
}

