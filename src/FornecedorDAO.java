import java.util.List;

public class FornecedorDAO implements GenericDAO<Fornecedor, String>{

   public List<Fornecedor>fornecedores;

    @Override
    public void adicionar(Fornecedor model) {
        for (Fornecedor fornecedorSalvo : fornecedores){
            if(fornecedorSalvo.getCnpj().equals(model.getCnpj())){
                throw new IllegalArgumentException("Fornecedor já cadastrado");
            }
        }
        this.fornecedores.add(model);
    }

    @Override
    public Fornecedor buscarPorId(String model) {
        for(Fornecedor fornecedorSalvo : fornecedores){
            if(fornecedorSalvo.getCnpj().equals(model)){
                return fornecedorSalvo;
            }
        }
        throw new IllegalArgumentException("Fornecedor não cadastrado");
    }
}
