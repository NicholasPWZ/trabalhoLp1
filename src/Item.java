import java.util.ArrayList;
import java.util.List;

public class Item {
    private Produto produto;
    private int qtd;
    private Double valorTotalItem;

    public Item(Produto produto, int qtd) {

        this.produto = produto;
        this.qtd = qtd;

        validar();
    }
    public void  validar(){
        List<String>mensagemErro = new ArrayList<>();
        if(produto == null ){
            mensagemErro.add("Informe o produto");
        }
        if(qtd <= 0){
           mensagemErro.add("Informe um quantidade válida");
        }

        if(!mensagemErro.isEmpty()){
        throw new IllegalArgumentException(mensagemErro.toString());
    }}

    public Produto getProduto() {
        return produto;
    }

    public int getQtd() {
        return qtd;
    }

    public Double getValorTotalItem() {
        valorTotalItem = produto.getValorUnitario() * getQtd();
        return valorTotalItem;
    }
}
