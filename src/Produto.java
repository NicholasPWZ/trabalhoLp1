import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private String descricao;
    private Double valorUnitario;

    public Produto(String nome, String descricao, Double valorUnitario) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
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

    public Double getValorUnitario() {
        return valorUnitario;
    }
}
