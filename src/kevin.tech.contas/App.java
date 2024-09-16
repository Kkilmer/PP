package kevin.tech.contas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        valor = 

        Conta c = new Conta();
        Conta c2 = new Conta(1, 5000);
        ContaEspecial contaE1 = new ContaEspecial(2, 2000, 3000);
        ContaInvestimento contaI1 = new ContaInvestimento();

        System.out.println("Informe o valor inicial de" + "deposito:");
        valor = leitor.nextDouble();
        c.depositar(valor);

        c.sacar(650);
        c2.sacar(100);

        contaI1.aplicarRendimento(1000);
        contaI1.sacar(100);
        contaI1.depositar(50);

        contaE1.sacar(1500);

    }
}
