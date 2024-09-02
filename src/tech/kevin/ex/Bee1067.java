package tech.kevin.ex;

import java.util.Scanner;

public class Bee1067 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valorX = leitor.nextInt();
        for (int i = 1; i <= valorX; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }else {
                break;
            }
        }
    }
}

