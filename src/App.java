
import java.util.ArrayList;

public class App {

    // Função para verificar o acesso
    public static void verificarAcesso(Autenticavel usuario, String credencial) {

        if (usuario.autenticar(credencial)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }

    public static void main(String[] args) {

        // Exercício 8 - Polimorfismo e Coleções
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for (Animal animal : animais) {
            animal.emitirSom();
        }


        // Exercício de Livros
        Livro livro1 = new Livro();
        Livro livro = new Livro("O conde de monte cristo", "Edmond Dante", 20.0);
        Livro livro2 = new Livro("Titulo", "Autor");


        // Exercício 4 e 5 - Herança e Sobrescrita
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.salarioBase = 2000;

        Gerente gerente = new Gerente();
        gerente.nome = "Carlos";
        gerente.salarioBase = 5000;
        gerente.setBonusEscopo(1000);

        funcionario.imprimirFicha();

        System.out.println();

        gerente.imprimirFicha();


        // Exercício 6 - Classes Abstratas
        Quadrado quadrado = new Quadrado();
        quadrado.cor = "Azul";
        quadrado.lado = 5;

        Circulo circulo = new Circulo();
        circulo.cor = "Vermelho";
        circulo.raio = 3;

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());


        // Exercício 7 - Interfaces
        Diretor diretor = new Diretor();
        Cliente cliente = new Cliente();

        verificarAcesso(diretor, "12345");
        verificarAcesso(cliente, "abc123");
        verificarAcesso(cliente, "senhaerrada");


        // Exercício 9 - Tratamento de Exceções
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Bruno");
        conta.setSaldo(1000);

        try {
            conta.sacar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo atual: R$ " + conta.getSaldo());


        // Exercício 10 - Carrinho de Compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        try {
            LivroProduto livroProduto = new LivroProduto(
                "O Conde de Monte Cristo",
                50.0,
                "Alexandre Dumas"
            );

            EletronicoProduto eletronico = new EletronicoProduto(
                "Notebook",
                3000.0,
                12
            );

            carrinho.adicionarProduto(livroProduto);
            carrinho.adicionarProduto(eletronico);

            carrinho.exibirCarrinho();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
