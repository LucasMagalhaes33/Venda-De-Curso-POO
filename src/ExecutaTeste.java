import java.math.BigDecimal;

public class ExecutaTeste {

    public static void main(String[] args) {

        Venda venda = new Venda();

        venda.setDescricaoVenda("Venda curso formação java");
        venda.setEnderecoEntrega("Entrega pelo email");
        venda.setId(10L);
        venda.setNomeCliente("Lucas Magalhães");
        venda.setValorTotal(BigDecimal.valueOf(197.00));

        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Módulo Orientação Objetos");
        produto1.setValor(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setNome("Modulo de Spring API REST");
        produto2.setId(2L);
        produto2.setValor(BigDecimal.valueOf(300));

        Produto produto3 = new Produto();
        produto3.setNome("Módulo de threads");
        produto3.setId(3L);
        produto3.setValor(BigDecimal.valueOf(500));

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);
        venda.addProduto(produto3);

        System.out.println("Descrição da venda " + venda.getDescricaoVenda() + " e o total " + venda.totalVenda());


        for (Produto produto:
             venda.getListaProdutos()) {
            System.out.println("Descrição Produto " + produto);
        }

        System.out.println("Descrição venda " + venda);
    }
}
