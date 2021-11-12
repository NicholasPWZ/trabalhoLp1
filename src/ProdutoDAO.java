import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
    public class ProdutoDAO implements GenericDAO<Produto,String> {
    private Connection conexao;
    public ProdutoDAO(){
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
        public void adicionar(Produto model) {
            try{
                String sql ="INSERT INTO produto(nome,descricao,valorUnitario)";
                PreparedStatement preparedStatement = conexao.prepareStatement(sql);
                preparedStatement.setString(1,model.getNome());
                preparedStatement.setString(2,model.getDescricao());
                preparedStatement.setDouble(3,model.getValorUnitario());
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        @Override
        public Produto buscarPorId(String model) {
            return null;
        }
    }
