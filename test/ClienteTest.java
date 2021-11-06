import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
    @Test
    public void deveCriarCliente(){
        Endereco enderecoJoao = new Endereco("Rua 2",null,"centro","bloco 4","90250010","Porto Alegre","RS");
        Contato contatoJoao = new Contato("joao123@gmail.com","51999877877");
        Cliente joao = new Cliente(contatoJoao,enderecoJoao,"Joao Derly","09087862033");
        Assert.assertEquals(joao.getContato(),contatoJoao);
        Assert.assertEquals(joao.getEndereco(),enderecoJoao);
        Assert.assertEquals(joao.getNome(),"Joao Derly");
        Assert.assertEquals(joao.getCpf(),"09087862033");
    }
    @Test
    public void deveCriarClienteVazio(){
       try {
           Cliente errado = new Cliente(null, null, " ", "1233213212323");

       }catch (Exception e){
           Assert.assertEquals("[Informe um nome válido, Informe um CPF valido]", e.getMessage());
       }
    }
}
