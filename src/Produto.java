
abstract class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;

        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido!");
        }

        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void exibirDetalhes();
}
