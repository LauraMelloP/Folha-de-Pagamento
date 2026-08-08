public class Producao extends Funcionario {

    private int pecas;
    private double valorPeca;

    public Producao(String nome, String matricula, int pecas, double valorPeca) {
        super(nome, matricula);
        this.pecas = pecas;
        this.valorPeca = valorPeca;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (pecas * valorPeca);
    }
}