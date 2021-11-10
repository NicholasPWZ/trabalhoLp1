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
        validar();
    }
    public void validar(){
        List<String>mensagemErro = new ArrayList<>();
        if(rua == null || rua.length() >=100 ){
            mensagemErro.add("Informe uma rua válida");
        }
        if(num.length() > 6){
            mensagemErro.add("Informe um numero válido");
        }
        if(bairro == null || bairro.length() >= 50){
            mensagemErro.add("Informe um bairro válido");
        }
        if(complemento.length()>= 120){
            mensagemErro.add("Informe um complemento válido");
        }
        if(cep == null || cep.length() > 10){
            mensagemErro.add("Informe um CEP válido");
        }
        if(cidade == null || cidade.length()>50){
            mensagemErro.add("Informe uma cidade válida");
        }
        if(estado == null || estado.isBlank()){
            mensagemErro.add("Informe um estado válido");
        }
        if(cep.length() != 8){
            mensagemErro.add("Informe um CEP válido");
        }
        if(estado.length() != 2){
            mensagemErro.add("Informe um estado válido");
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
