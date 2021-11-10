public interface GenericDAO<K, T> {

    public void adicionar(K model);

    public K buscarPorId(T model);
}
