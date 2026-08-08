public class Funcionario {

    protected String nome;
    protected String matricula;
    protected double salarioBase = 2000;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário final: " + calcularSalario());
        System.out.println("-------------------");
    }
}
