public class Comissionado extends Funcionario {

    private double vendas;
    private double percentual;

    public Comissionado(String nome, String matricula, double vendas, double percentual) {
        super(nome, matricula);
        this.vendas = vendas;
        this.percentual = percentual;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * percentual / 100);
    }
}
