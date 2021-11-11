import org.junit.Assert;
import org.junit.Test;

public class ItemTest {
    @Test
    public void deveCalcularValorItem(){
        Produto produto1 = new Produto("1234","primeiroProduto",60.50);
        Item item1 = new Item(produto1,5);
        Assert.assertEquals(item1.getValorTotalItem(),302.5,1);
    }
}
