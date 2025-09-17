public class Main {
  publlic static void main (String[] args) {
     Funcionario f = new Funcionario("André", 20, "123.456.789-00",
                                     "Dev Senior", "01/01/2025", 6000.00);

    Gerente g = new Gerente("Felipe", 20, "052.633.841-57",
                            "Gerente de TI", "17/09/2025", 8500.00, 5, 820.00);

    System.out.println("==Funcinário==");
    f.mostrarDados();
    System.out.println("Salário atual: R$ " + f.calcularSalarioAnual());

    System.out.println("==Gerente==");
    g.mostrarDados();
    System.out.println("Salário bõnus: R$ " + g.calcularSalarioCOmBonus());
    g.gerenciarEquipe();
                            
  }
}
