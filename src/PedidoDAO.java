import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PedidoDAO implements GenericDAO<Pedido, String> {

    private Connection conexao;
    public PedidoDAO(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/ecommerce";
            conexao = DriverManager.getConnection (url, "root", "password");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public void adicionar(Pedido model) {

    }

    @Override
    public Pedido buscarPorId(String model) {
        return null;
    }
}
