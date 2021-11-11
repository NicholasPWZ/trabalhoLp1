import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String email;
    private String telefone;

    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
        validar();
    }
    public void validar(){
        List<String>mensagemErro = new ArrayList<>();
        if(email == null || email.length() >=100){
            mensagemErro.add("Informe um email válido");
        }

        if(telefone == null || telefone.isBlank()){
            mensagemErro.add("Informe um numero de telefone válido");
        }
        if(!email.contains("@")){
            mensagemErro.add("Informe um email válido");
        }
        if(telefone.length() < 8 || telefone.length() > 11){
            mensagemErro.add("Informe um numero de telefone válido");
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
