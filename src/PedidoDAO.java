import com.mysql.cj.xdevapi.Result;

import java.sql.*;
import java.time.LocalDateTime;
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
        try{
            String sql = "INSERT INTO pedido(dataCompra,id_fornecedor,id_cliente,valorFrete,valorTotal) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setObject(1,model.getDataCompra());
            preparedStatement.setLong(2,model.getFornecedor().getId_fornecedor());
            preparedStatement.setLong(3,model.getCliente().getId_cliente());
            preparedStatement.setDouble(4,model.getValorFrete());
            preparedStatement.setDouble(5,model.getValorTotal());
            preparedStatement.execute();

            long pedido_id = 0;
            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    pedido_id = (generatedKeys.getLong(1));
                }
                else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            for(Item item:model.getItens()) {
                try {
                    String sqlItem = "INSERT INTO item(id_produto, id_pedido, quantidade) VALUES(?,?,?)";
                    PreparedStatement preparedStatement1 = conexao.prepareStatement(sqlItem, Statement.RETURN_GENERATED_KEYS);
                    preparedStatement1.setLong(1, item.getProduto().getId_produto());
                    preparedStatement1.setLong(2, pedido_id);
                    preparedStatement1.setLong(3, item.getQtd());
                    preparedStatement1.execute();

                } catch (SQLException e) {
                    e.printStackTrace();
                    ;
                }
            }
        }catch(SQLException exception){
            exception.printStackTrace();}
    }
    public void deletarTodos(){
        try{
            PreparedStatement preparedStatement = conexao.prepareStatement("Delete FROM pedido");
            preparedStatement.execute();
        }

        catch(SQLException e){
            e.printStackTrace();
        }}
    @Override
    public Pedido buscarPorId(String model) {
           try{
            String sql = "select * from pedido p " +
                    "inner join fornecedor f " +
                    "on f.id_fornecedor = p.id_fornecedor " +
                    "inner join cliente c on " +
                    "c.id_cliente = p.id_cliente " +
                    "inner join item i on " +
                    "i.id_pedido = p.id_pedido " +
                    "inner join produto pr on " +
                    "pr.id_produto = i.id_produto " +
                    "where p.id_pedido = "+model;
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
               ResultSet results = preparedStatement.executeQuery();
            if(results.next()){
                int id_pedido = results.getInt("id_pedido");
                LocalDateTime dataCompra = results.getObject("dataCompra", LocalDateTime.class);
                long id_fornecedor = results.getLong("id_fornecedor");
                long id_cliente = results.getLong("id_cliente");
                double valorFrete = results.getDouble("valorFrete");
                double valorTotal = results.getDouble("valorTotal");

            }



        }catch (SQLException e){
               e.printStackTrace();
    }
           return null;
}}
