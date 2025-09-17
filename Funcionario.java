public Funcionario extends Pessoa {
  private String cargo;
  private String dataAdmissao;
  private double salario;

  public Funcionario(String nome, int idade, String cpf,
                     String cargo, String dataAdmissao, double salario) {
    this.cargo = cargo;
    this.dataAdmissao = dataAdmissao;
    this.salario = salario;

    @Override
      public String mostrarDados() {
      return "Funcionario{" + "nome='" + nome + '\'' + ", idade=" + idade + ", cpf='" + cpf + '\'' + 
        ", salario=" + salario + ", dataAdmissao='" + dataAdmissao + '\'' + cargo='" + cargo + '\'' + '}'
      }

    public double calcularSalarioAnual(){
      return salario * 12;
    }

    public void receberAumento(){
      double percentual = 0.0;
      salario += salario * (percentual / 100);
      }
    }
}
