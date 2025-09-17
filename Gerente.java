public class Gerente extends Funcionario {
  private int equipe;
  private double bonus;

  public Gerente (String nome, int idade, String cpf,
                 String cargo, String dataAdmissao, double salario,
                 int equipe, double bonus) {
    this.equipe = equipe;
    this.bonus = bonus;
    }
  @Override
  public String mostrarDados(){
    super.mostrarDados();
    System.out.println("Equipe " + equipe + " funcionarios");
    System.out.println("Bônus= R$ " + bonus);
    return null;
  }

  public double calcularSalarioComBonus(){
    double salario = 0.0;
    return salario + bonus;
  }

  publlic void gerenciarEquipe(){
    System.out.println("Gerenciando " + equipe + "funcionarios");
  }
}
