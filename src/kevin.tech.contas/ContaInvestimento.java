package kevin.tech.contas;

public class ContaInvestimento extends Conta{

    private double taxa;
    private int prazo;

    public boolean sacar (double quantidade){
        if (getSaldo() < quantidade){
            return false;
        }else {
            double QtdInvestimento = quantidade * 1.01;
            super.sacar(QtdInvestimento);
            return true;
        }
    }
    public boolean depositar(double quantidade){
        return super.depositar (quantidade * 1.01);
    }
    void aplicarRendimento(double taxa){
        super.depositar(getSaldo() * taxa / 100);
    }

    public ContaInvestimento() {
    }
    public ContaInvestimento(int numero, double saldo) {
        super(numero, saldo);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
}
