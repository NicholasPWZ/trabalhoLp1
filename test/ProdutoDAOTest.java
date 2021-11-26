import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProdutoDAOTest {
    private ProdutoDAO produtoDao;

    @Before
    public void iniciar(){
        produtoDao=new ProdutoDAO();
    }
    @After
    public void deletarTodos(){
        produtoDao.deletarTodos();
    }
    @Test
    public void deveAdicionarProduto(){
        Produto produto1 = new Produto("produto1","Descricao",66.50);
        ProdutoDAO daoprod = new ProdutoDAO();
        daoprod.adicionar(produto1);
    }
}
