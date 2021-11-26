import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FornecedorDAOTest {
    private FornecedorDAO daoFornecedor;
    @Before
    public void iniciar(){
       daoFornecedor = new FornecedorDAO();
    }
    @After
    public void deletarTudo(){
        daoFornecedor.deletarTodos();

    }
    @Test
    public void deveAdicionarFornecedor(){
        Contato contatoFornecedor1 = new Contato("fornecedor1@gmail.com","51987675466");
        Endereco enderecoFornecedor1 = new Endereco("rua 1","123","bairro 1","bloco A", "90870900","Porto Alegre","RS");
        Fornecedor fornecedor1 = new Fornecedor(contatoFornecedor1,enderecoFornecedor1,"09876789098765","nomeFantasia");
        Assert.assertEquals(fornecedor1.getCnpj(),"09876789098765" );
        Assert.assertEquals(fornecedor1.getNomeFantasia(),"nomeFantasia" );
        Assert.assertEquals(fornecedor1.getContato(),contatoFornecedor1);
        Assert.assertEquals(fornecedor1.getEndereco(),enderecoFornecedor1);
        FornecedorDAO daoFornecedor = new FornecedorDAO();
        daoFornecedor.adicionar(fornecedor1);
    }
}
