package kevin.tech.contas;

public class App {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta c2 = new Conta(1, 5000);
        ContaEspecial contaE1 = new ContaEspecial(2, 2000, 3000);
        ContaInvestimento contaI1 = new ContaInvestimento();

        c.saldo = 5000;
        c.numero = 01;

        c.sacar(650);
        c2.sacar(100);

        contaI1.aplicarRendimento(1000);
        contaI1.sacar(100);
        contaI1.depositar(50);

        contaE1.sacar(1500);

    }
}
