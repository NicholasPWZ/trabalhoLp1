import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private long id_cliente;
    private String nome;
    private String cpf;

    public Cliente(Contato contato, Endereco endereco, String nome, String cpf) {
        super(contato, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.id_cliente = 0;
        validar();
    }
    public Cliente(long id_cliente,Contato contato, Endereco endereco, String nome, String cpf) {
        super(contato, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.id_cliente = id_cliente;
        validar();
    }
    public void validar(){
        List<String> mensagemErro = new ArrayList<String>();

        if(nome == null || nome.isBlank()) {
            mensagemErro.add("Informe um nome válido");
        }
        if(nome.length() >=100 ){
            mensagemErro.add("Informe um nome válido");
        }
        if(cpf == null || cpf.isBlank()){
            mensagemErro.add("Informe um CPF valido");
        }
        if(cpf.length() != 11){
            mensagemErro.add("Informe um CPF valido")  ;
        }
        if(!mensagemErro.isEmpty()){
                    throw new IllegalArgumentException(mensagemErro.toString());
    }           }
    public String getNome() {
        return nome;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public String getCpf() {
        return cpf;
    }
}

