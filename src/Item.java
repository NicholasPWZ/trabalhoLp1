public class Item {
    private Produto produto;
    private int qtd;
    private Double valorTotalItem;

    public Item(Produto produto, int qtd, Double valorTotalItem) {

        this.produto = produto;
        this.qtd = qtd;
        this.valorTotalItem = valorTotalItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtd() {
        return qtd;
    }

    public Double getValorTotalItem() {
        return valorTotalItem;
    }
}
