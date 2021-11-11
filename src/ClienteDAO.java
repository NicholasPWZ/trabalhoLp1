import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ClienteDAO implements GenericDAO<Cliente, String> {


    private Connection conexao;
    public ClienteDAO() {
        try {
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
    public void adicionar(Cliente model) {
        try {
            String sql = "INSERT INTO cliente(nome,cpf,email,telefone,rua,numero,bairro,complemento,cep,cidade,estado) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1,model.getNome());
            preparedStatement.setString(2,model.getCpf());
            preparedStatement.setString(3,model.getContato().getEmail());
            preparedStatement.setString(4,model.getContato().getTelefone());
            preparedStatement.setString(5,model.getEndereco().getRua());
            preparedStatement.setString(6,model.getEndereco().getNum());
            preparedStatement.setString(7,model.getEndereco().getBairro());
            preparedStatement.setString(8,model.getEndereco().getComplemento());
            preparedStatement.setString(9,model.getEndereco().getCep());
            preparedStatement.setString(10,model.getEndereco().getCidade());
            preparedStatement.setString(11,model.getEndereco().getEstado());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deletarTodos(){
        try{
            PreparedStatement preparedStatement = conexao.prepareStatement("Delete FROM cliente");
            preparedStatement.execute();
        }

        catch(SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public Cliente buscarPorId(String model) {return null;}
}
