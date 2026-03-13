package CadastroPessoas;
import CadastroPessoas.Funcionario;
import CadastroPessoas.Cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Cliente cliente = new Cliente();

        System.out.println("=== Cadastro Funcionários ===");
        System.out.println("\nInforme o nome do Funcionário");
        funcionario.setNome(scanner.next());
        System.out.println("Informe a idade do Funcionário");
        funcionario.setIdade(scanner.nextInt());
        System.out.println("Informe o cargo do Funcionário");
        funcionario.setCargo(scanner.next());

        funcionario.exibirDados();

        System.out.println("=== Cadastro Clientes ===");
        System.out.println("\nInforme o nome do Cliente");
        cliente.setNome(scanner.next());
        System.out.println("Informe a idade do Cliente");
        cliente.setIdade(scanner.nextInt());
        System.out.println("Informe o email do Cliente");
        cliente.setEmail(scanner.next());

        cliente.exibirDados();




    }

}
