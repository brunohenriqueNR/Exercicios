
public class Calculadora {

    // Soma de dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Soma de dois números decimais
    public double somar(double a, double b) {
        return a + b;
    }

    // Soma de três números inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Soma de inteiros: " + calc.somar(10, 20));

        System.out.println("Soma de decimais: " + calc.somar(5.5, 2.5));

        System.out.println("Soma de três inteiros: " + calc.somar(10, 20, 30));
    }
}
