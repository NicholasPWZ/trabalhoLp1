import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private ClienteDAO clienteDAO;

    @Before
    public void iniciarDao(){clienteDAO = new ClienteDAO();}
    @After
    public void deletarDao(){clienteDAO.deletarTodos();}

    @Test
    public void deveAdicionarCliente(){
        Endereco enderecoJoao = new Endereco("Rua 2","centro","90250010","Porto Alegre","RS");
        Contato contatoJoao = new Contato("joao123@gmail.com","51999877877");
        Cliente joao = new Cliente(contatoJoao,enderecoJoao,"Joao Derly","09087862033");
        Assert.assertEquals(joao.getContato(),contatoJoao);
        Assert.assertEquals(joao.getEndereco(),enderecoJoao);
        Assert.assertEquals(joao.getNome(),"Joao Derly");
        Assert.assertEquals(joao.getCpf(),"09087862033");
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.adicionar(joao);
    }
}
