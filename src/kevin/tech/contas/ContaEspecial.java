package kevin.tech.contas;

public class ContaEspecial extends Conta{
    double limite;

    boolean sacar (double quantidade){
        if (this.saldo < quantidade){
            return false;
        }else {
            this.saldo = this.saldo - (quantidade * 0.99);
            return true;
        }
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
}
