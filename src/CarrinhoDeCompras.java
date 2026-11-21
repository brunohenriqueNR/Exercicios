
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public double calcularTotalPedido() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        return total;
    }

    public void exibirCarrinho() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println();
        }

        System.out.println("Total do pedido: R$ " + calcularTotalPedido());
    }
}
