class Quadrado extends FiguraGeometrica {

    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}