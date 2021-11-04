import java.util.ArrayList;
import java.util.List;

public class Endereco {
    private String rua;
    private String num;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String rua, String num, String bairro, String complemento, String cep, String cidade, String estado) {
        this.rua = rua;
        this.num = num;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
    public void validar(){
        List<String>mensagemErro = new ArrayList<>();
        if(rua == null || rua.isBlank()){
            mensagemErro.add("Informe a rua");
        }
        if(bairro == null || bairro.isBlank()){
            mensagemErro.add("Informe o bairro");
        }
        if(cep == null || cep.isBlank()){
            mensagemErro.add("Informe o CEP");
        }
        if(cidade == null || cidade.isBlank()){
            mensagemErro.add("Informe a cidade");
        }
        if(estado == null || estado.isBlank()){
            mensagemErro.add("Informe o estado");
        }
        if(cep.length() != 8){
            mensagemErro.add("Informe um CEP valido sem caracteres");
        }
        if(estado.length() != 2){
            mensagemErro.add("Informe a sigla valida do Estado");
        }
        if(!mensagemErro.isEmpty()){
            throw new IllegalArgumentException(mensagemErro.toString());
        }
    }
    public String getRua() {
        return rua;
    }

    public String getNum() {
        return num;
    }

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
