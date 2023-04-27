public class Calca extends Roupa{
    public Calca(String tamanho, String cor, String nome, String marca, float preco){
        super(tamanho, cor, nome, marca, preco);
    }
    public float precoFinal(float preco){
        preco = preco - (preco*(15/100));
        return preco;
    }
}
