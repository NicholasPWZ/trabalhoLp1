import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements GenericDAO<Cliente, String> {

    public List<Cliente> clientes;

    @Override
    public void adicionar(Cliente model) {
            for(Cliente clienteAdicionado : clientes){
                if(model.getCpf().equals(clienteAdicionado.getCpf())){
                    throw new IllegalArgumentException("Cliente já cadastrado");
                }
            }
        this.clientes.add(model);
    }

    @Override
    public Cliente buscarPorId(String model) {
            for(Cliente clientesSalvos : clientes){
                if (model.equals(clientesSalvos.getCpf())){
                    return clientesSalvos;
                }
            }
            throw new IllegalArgumentException("Cliente não cadastrado");
    }
}
