import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String nome;
    private String cpf;

    public Cliente(Contato contato, Endereco endereco, String nome, String cpf) {
        super(contato, endereco);
        this.nome = nome;
        this.cpf = cpf;
    }
    public void validar(){
        List<String> mensagemErro = new ArrayList<String>();
        if(nome == null || nome.isBlank()) {
            mensagemErro.add("Insira o nome");
        }
        if(nome.length() <= 5){
            mensagemErro.add("Insira um nome válido");
        }
        if(cpf == null || cpf.isBlank()){
            mensagemErro.add("Insira o CPF");
        }
        if(cpf.length() != 11){
            mensagemErro.add("Insira um CPF valido")  ;
        }
        if(!mensagemErro.isEmpty()){
                    throw new IllegalArgumentException(mensagemErro.toString());
    }           }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

