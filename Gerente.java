public class Gerente extends Funcionario {
    private int equipe;
    private double bonus;

    public Gerente(String nome, int idade, String cpf,
                   String cargo, String dataAdmissao, double salario,
                   int equipe, double bonus) {
        super(nome, idade, cpf, cargo, dataAdmissao, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Equipe: " + equipe + " funcionários");
        System.out.println("Bônus: R$ " + bonus);
    }

    public double calcularSalarioComBonus() {
        return super.salario + bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("Gerenciando " + equipe + " funcionários");
    }
}
