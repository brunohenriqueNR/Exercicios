class Funcionario {

    String nome;
    double salarioBase;

    public void imprimirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
    }
}

class Gerente extends Funcionario {

    private double bonusEscopo;

    public void setBonusEscopo(double bonusEscopo) {
        this.bonusEscopo = bonusEscopo;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();

        System.out.println("Cargo: Gerente");
        System.out.println("Bônus de escopo: R$ " + bonusEscopo);
    }
}