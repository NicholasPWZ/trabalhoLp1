import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PedidoDAOTest {
    private ClienteDAO daoCliente;
    private FornecedorDAO daoFornecedor;
    private ProdutoDAO daoProduto;
    private PedidoDAO daoPedido;
    @Before
    public void iniciarDao(){
        daoCliente = new ClienteDAO();
        daoFornecedor = new FornecedorDAO();
        daoProduto = new ProdutoDAO();
        daoPedido = new PedidoDAO();
    }
    @After
    public void deletarTodos(){
        daoCliente.deletarTodos();
        daoFornecedor.deletarTodos();
        daoProduto.deletarTodos();
        daoPedido.deletarTodos();
    }
    @Test
    public void deveAdicionarPedido(){
        Endereco enderecoJoao = new Endereco("Rua 2","centro","90250010","Porto Alegre","RS");
        Contato contatoJoao = new Contato("joao123@gmail.com","51999877877");
        Cliente joao = new Cliente(1,contatoJoao,enderecoJoao,"Joao Derly","09087862033");
        Contato contatoFornecedor1 = new Contato("fornecedor1@gmail.com","51987675466");
        Endereco enderecoFornecedor1 = new Endereco("rua 1","123","bairro 1","bloco A", "90870900","Porto Alegre","RS");
        Fornecedor fornecedor1 = new Fornecedor(1,contatoFornecedor1,enderecoFornecedor1,"09876789098765","nomeFantasia");
        Produto produto1 = new Produto("produto1TP","ProdutoTestePedido1",600.50);
        Produto produto2 = new Produto("produto2TP","ProdutoTestePedido2",20.99);
        Produto produto3 = new Produto("produto3TP","ProdutoTestePedido3",70.50);
        Produto produto4 = new Produto("produto4TP","ProdutoTestePedido4",66.19);
        Item item1 = new Item(produto1,2);
        Item item2 = new Item(produto2,12);
        Item item3 = new Item(produto3,4);
        Item item4 = new Item(produto4, 9);
        Pedido pedidoTeste = new Pedido(fornecedor1,joao,20.37);
        daoCliente.adicionar(joao);
        daoFornecedor.adicionar(fornecedor1);
        daoProduto.adicionar(produto1);
        daoProduto.adicionar(produto2);
        daoProduto.adicionar(produto3);
        daoProduto.adicionar(produto4);
        pedidoTeste.adicionarItem(item1);
        pedidoTeste.adicionarItem(item2);
        pedidoTeste.adicionarItem(item3);
        pedidoTeste.adicionarItem(item4);
        daoPedido.adicionar(pedidoTeste);

    }
}
