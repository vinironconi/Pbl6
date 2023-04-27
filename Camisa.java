public class Camisa extends Roupa{
    public Camisa(String tamanho, String cor, String nome, String marca, float preco){
        super(tamanho, cor, nome, marca, preco);
    }
    public float precoFinal(float preco){
        preco = preco - (preco*(10/100));
        return preco;
    }
}
