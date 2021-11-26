import java.util.ArrayList;
import java.util.List;

public class Produto {
    private long id_produto;
    private String nome;
    private String descricao;
    private Double valorUnitario;

    public Produto( String nome, String descricao, Double valorUnitario) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        validar();
    }
    public void validar(){
        List<String>mensagemErro = new ArrayList<>();
        if(nome == null || nome.isBlank()){
            mensagemErro.add("Informe um nome");
        }

    }
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getId_produto() {
        return id_produto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }
}
