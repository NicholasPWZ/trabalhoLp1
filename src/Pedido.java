import javax.xml.crypto.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime dataCompra;
    private Fornecedor fornecedor;
    private Cliente cliente;
    private Double valorTotal;
    private Double valorTotalItens;
    private Double valorFrete;
    private List<Item>itens;

    public Pedido(LocalDateTime dataCompra, Fornecedor fornecedor, Cliente cliente, Double valorTotal, Double valorTotalItens,
                  Double valorFrete) {
        this.dataCompra = LocalDateTime.now();
        this.fornecedor = fornecedor;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.valorFrete = valorFrete;
        this.itens =  new ArrayList<Item>();
        this.valorTotalItens = valorTotalItens;
    }
    public void validar(){
        List<String>mensagemErro = new ArrayList<>();
        if(dataCompra == null ){
            mensagemErro.add("Informe uma data");
        }
        if(fornecedor == null){
            mensagemErro.add("Informe o fornecedor");
        }
        if(cliente == null){
            mensagemErro.add("Informe o cliente");
        }
        if (valorTotalItens <= 0) {
            mensagemErro.add("Informe o valor total dos itens");
        }
        if(itens.size()<= 0){
            mensagemErro.add("A lista precisa ter itens");
        }
        if(!mensagemErro.isEmpty()){
            throw new IllegalArgumentException(mensagemErro.toString());
        }
    }
    public void adicionarItem(Item itemAdicionado){
        List<Item>itensAdicionados = new ArrayList<>();
        for (Item itensJaAdicionados : itens){
            if(itensJaAdicionados.getProduto().equals(itemAdicionado.getProduto())){
                throw new IllegalArgumentException("Item já adicionado");
            }
        }
        this.itens.add(itemAdicionado);
    }
    public LocalDateTime getDataCompra() {
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
