import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private String nomeFantasia;

    public Fornecedor(Contato contato, Endereco endereco, String cnpj, String nomeFantasia) {
        super(contato, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
    public void  validar(){
        List<String> mensagemErro = new ArrayList<>();
        if(cnpj == null || cnpj.isBlank()){
            mensagemErro.add("Informe o CNPJ");
        }
        if(nomeFantasia == null || nomeFantasia.isBlank()){
            mensagemErro.add("Informe o nome fantasia");
        }
        if(cnpj.length() != 14){
            mensagemErro.add("Informe um CNPJ valido");
        }
        if(!mensagemErro.isEmpty()){
            throw new IllegalArgumentException(mensagemErro.toString());
        }
    }
    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
}
