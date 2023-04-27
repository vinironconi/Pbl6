public class Vestido extends Roupa{
    public Vestido(String tamanho, String cor, String nome, String marca, float preco){
        super(tamanho, cor, nome, marca, preco);
    }
    public float precoFinal(float preco){
        preco = preco - (preco*(20/100));
        return preco;
    }
}
