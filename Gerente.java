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
        // Here, we can't directly access the private 'salario' field from the superclass.
        // A better approach is to return just the bonus, as the salary is part of the Funcionario class.
        // For this specific case, it seems the intention was to calculate the total.
        // We'll fix the Main class to handle this correctly.
        return super.salario + bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("Gerenciando " + equipe + " funcionários");
    }
}
