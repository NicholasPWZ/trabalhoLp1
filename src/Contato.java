import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String email;
    private String telefone;

    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }
    public void validar(){
        List<String>mensagemErro = new ArrayList<>();
        if(email == null || email.isBlank()){
            mensagemErro.add("Informe o email");
        }
        if(telefone == null || telefone.isBlank()){
            mensagemErro.add("Informe o numero de telefone");
        }
        if(!email.contains("@")){
            mensagemErro.add("Informe um email valido");
        }
        if(telefone.length() < 8 || telefone.length() > 9){
            mensagemErro.add("Informe um numero de telefone valido");
        }
        if(!mensagemErro.isEmpty()){
            throw new IllegalArgumentException(mensagemErro.toString());
        }
    }
    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
