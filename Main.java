public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("André", 20, "123.456.789-00",
                                        "Dev Senior", "01/01/2025", 6000.00);

        Gerente g = new Gerente("Felipe", 20, "052.633.841-57",
                                "Gerente de TI", "17/09/2025", 8500.00, 5, 820.00);

        System.out.println("==Funcionário==");
        f.mostrarDados();
        System.out.println("Salário anual: R$ " + f.calcularSalarioAnual());

        System.out.println("\n==Gerente==");
        g.mostrarDados();
        System.out.println("Salário com bônus: R$ " + g.calcularSalarioComBonus());
        g.gerenciarEquipe();
    }
}
