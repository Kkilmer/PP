package kevin.tech.contas;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(){
        System.out.println("Conta VAZIA criada!");
    }
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    boolean sacar (double quantidade){
        if (this.saldo < quantidade){
            return false;
        }else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }
    boolean depositar(double quantidade){
        if (quantidade == 0 || quantidade < 0){
            return false;
        }else {
            this.saldo = this.saldo + quantidade;
            return true;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
