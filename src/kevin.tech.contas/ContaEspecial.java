package kevin.tech.contas;

public class ContaEspecial extends Conta{
    private double limite;

    public boolean sacar (double quantidade){
        double QtdEspecial = quantidade * 0.99;
        return super.sacar(QtdEspecial);
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
}
