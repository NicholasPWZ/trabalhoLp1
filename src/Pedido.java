import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Data dataCompra;
    private Fornecedor fornecedor;
    private Cliente cliente;
    private Double valorTotal;
    private Double valorTotalItens;
    private Double valorFrete;
    private List<Item>itens;

    public Pedido(Data dataCompra, Fornecedor fornecedor, Cliente cliente, Double valorTotal, Double valorTotalItens,
                  Double valorFrete, List<Item> itens) {
        this.dataCompra = dataCompra;
        this.fornecedor = fornecedor;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        new ArrayList<Item>();
        this.valorFrete = valorFrete;
        this.itens = itens;
    }

    public Data getDataCompra() {
        return dataCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Double getValorTotalItens() {
        return valorTotalItens;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public List<Item> getItens() {
        return itens;
    }
}
