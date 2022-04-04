import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Long id;
    private String nomeCliente;
    private String descricaoVenda;
    private String enderecoEntrega;
    private BigDecimal valorTotal;

    List<Produto> listaProdutos = new ArrayList<Produto>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", descricaoVenda='" + descricaoVenda + '\'' +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", valorTotal='" + valorTotal + '\'' +
                ", listaProdutos=" + listaProdutos +
                '}';
    }

    public double totalVenda() {
        double total = 0.0;

        for (Produto produto:
             listaProdutos) {
            total += produto.getValor().doubleValue();
        }
        return total;
    }

    public void addProduto(Produto produto) {
        this.listaProdutos.add(produto);
    }
}
