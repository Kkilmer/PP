import java.util.Scanner;

public class Bee1035 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valorA = leitor.nextInt();
        int valorB = leitor.nextInt();
        int valorC = leitor.nextInt();
        int valorD = leitor.nextInt();

        if ((valorB > valorA) && (valorD > valorA)
                && ((valorC + valorD) > (valorA + valorB))
                && (valorC > 0) && (valorD > 0)
                && (valorA % 2 == 0)){
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores não aceitos");
        }
    }
}