public class Pessoa {
  protected String nome; 
  protected int idade;
  protected String cpf;

  public Pessoa(String nome, int idade, String cpf) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
}
  public String mostrarDados(){
    System.out.println("Nome: " + nome);
    System.out.println("idade: " + idade);
    System.out.println("CPF: ");
  }
}
