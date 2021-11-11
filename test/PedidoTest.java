import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class PedidoTest {
    @Test
    public void deveCriarUmPedido(){
        Contato contatoFornecedor1 = new Contato("fornecedor1@gmail.com","51987675466");
        Endereco enderecoFornecedor1 = new Endereco("rua 1","123","bairro 1","bloco A", "90870900","Porto Alegre","RS");
        Fornecedor fornecedor1 = new Fornecedor(contatoFornecedor1,enderecoFornecedor1,"09876789098765",
                "nomeFantasia");
        Endereco enderecoJoao = new Endereco("Rua 2","centro","90250010","Porto Alegre","RS");
        Contato contatoJoao = new Contato("joao123@gmail.com","51999877877");
        Cliente joao = new Cliente(contatoJoao,enderecoJoao,"Joao Derly","09087862033");
        Produto produto1 = new Produto("1234","primeiroProduto",60.50);
        Produto produto2 = new Produto("produto2","descricao2",37.99    );
        Produto produto3 = new Produto("produto2","descricao3",75.00);
        Item item1 = new Item(produto1,5);
        Item item2 = new Item(produto2,4);
        Item item3 = new Item(produto3, 3);
        Pedido pedido1 = new Pedido(fornecedor1,joao,35.50,StatusPedido.EM_TRANSITO);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        pedido1.adicionarItem(item3);
        Assert.assertEquals(pedido1.getValorTotalItens(),679.46,1);
        Assert.assertEquals(pedido1.getValorTotal(),714.96,1);



    }
}
