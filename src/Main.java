import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1,"joao","rua tal","34364567","3453453534534","rgfgrgr",
                "masculino",BigDecimal.valueOf(3600.00),BigDecimal.valueOf(1000.00), 10.00);

        Fornecedor fornecedor = new Fornecedor(1,"jose da silva","rua tal tal","345677880","4493939339393",
                "e39339393393","ramo de pia","joao da cunha","atende de seg/sex",BigDecimal.valueOf(50.00));

        Produto produto = new Produto(1,"tabua de passar arno",fornecedor,BigDecimal.valueOf(59.90));

        produto.valorDeVenda(produto.getPrecoUnitario());

        Funcionario funcionario = new Funcionario(1,"luis goveia","rua alfosods","34336789","484843993393","484843938",
                "masculino",BigDecimal.valueOf(3400.00),BigDecimal.valueOf(2900.00));

        Venda venda = new Venda(1,funcionario,cliente,false,5, LocalDate.of(2022,04,29),produto);

        Venda venda2 = new Venda(2,funcionario,true,5,LocalDate.of(2022,04,28),produto);


        System.out.println(venda2);
        System.out.println(venda);
        System.out.println(produto.getPrecoUnitario());
        System.out.println(produto.valorDeVenda(produto.getPrecoUnitario()));
        System.out.println(venda2.getValorTotalVenda());
        System.out.println(venda.getValorTotalVenda());




    }
}