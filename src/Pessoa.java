import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private Contato contato;
    private Endereco endereco;

    public Pessoa(Contato contato, Endereco endereco) {
        this.contato = contato;
        this.endereco = endereco;


    }
    public void validar(){
        List<String>mensagemErro = new ArrayList<>();
        if(contato == null){
            mensagemErro.add("Insira um contato");
        }
        if(endereco == null){
            mensagemErro.add("Insitra um endereco");
        }
        if(!mensagemErro.isEmpty()){
            throw new IllegalArgumentException(mensagemErro.toString());
        }
    }
    public Contato getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
