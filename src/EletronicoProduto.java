
class EletronicoProduto extends Produto {

    private int mesesGarantia;

    public EletronicoProduto(String nome, double preco, int mesesGarantia) {
        super(nome, preco);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Eletrônico: " + getNome());
        System.out.println("Garantia: " + mesesGarantia + " meses");
        System.out.println("Preço: R$ " + getPreco());
    }
}
