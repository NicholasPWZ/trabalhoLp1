import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends Pessoa {
    private long id_fornecedor;
    private String cnpj;
    private String nomeFantasia;

    public Fornecedor(Contato contato, Endereco endereco, String cnpj, String nomeFantasia) {
        super(contato, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.id_fornecedor = 0;
        validar();
    }
    public Fornecedor(long id_fornecedor,Contato contato, Endereco endereco, String cnpj, String nomeFantasia) {
        super(contato, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.id_fornecedor = id_fornecedor;
        validar();
    }
    public void  validar(){
        List<String> mensagemErro = new ArrayList<>();
        if(cnpj == null ||cnpj.length() != 14){
            mensagemErro.add("Informe um CNPJ valido");
        }
        if(nomeFantasia == null || nomeFantasia.length()>=100){
            mensagemErro.add("Informe um nome fantasia valido");
        }
        if(!mensagemErro.isEmpty()){
            throw new IllegalArgumentException(mensagemErro.toString());
        }
    }
    public String getCnpj() {
        return cnpj;
    }

    public long getId_fornecedor() {
        return id_fornecedor;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
}
