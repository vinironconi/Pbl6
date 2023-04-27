public class Roupa{
    private String tamanho;
    private String cor;
    public float preco;
    public String marca;
    public String nome;

    public Roupa(String tamanho, String cor, String nome, String marca, float preco){
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
        this.marca = marca;
        this.nome = nome;

    }
    public float precoFinal(){
        return 0f;
    }
}
