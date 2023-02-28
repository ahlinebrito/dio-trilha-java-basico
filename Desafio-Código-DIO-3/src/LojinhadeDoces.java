import java.util.Scanner;

public class LojinhadeDoces {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int doce = leitor.nextInt();
             int quantidadeDoce = 0;

             quantidadeDoce = doce * 2;

             System.out.println("O cliente obteve " + quantidadeDoce + " doces");
        }



    }
}