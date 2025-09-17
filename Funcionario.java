public class Funcionario extends Pessoa {
    private String cargo;
    private String dataAdmissao;
    private double salario;

    public Funcionario(String nome, int idade, String cpf,
                       String cargo, String dataAdmissao, double salario) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Salário: R$ " + salario);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void receberAumento(double percentual) {
        salario += salario * (percentual / 100);
        System.out.println("Novo salário com aumento: R$ " + salario);
    }
}
