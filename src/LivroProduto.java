
class LivroProduto extends Produto {

    private String autor;

    public LivroProduto(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + getNome());
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + getPreco());
    }
}
