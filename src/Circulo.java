class Circulo extends FiguraGeometrica {

    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}