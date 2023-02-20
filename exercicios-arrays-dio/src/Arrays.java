

/*Crie um veotr de 6 números inteiros e mostre-os na ordem inversa. */


public class Arrays {
    public static void main(String[] args) {

        int[] vetor = { 4, 6, 9, 17, 25, 34 };

        // System.out.printIn(vetor.length);

        System.out.print("Vetor: ");

        int count = 0;
        while (count < (vetor.length)) {

            System.out.print(vetor[count] + "  ");
            count++;

        }

        System.out.print("\nVetor:  ");
        
        for(int i = (vetor.length - 1); i >= 0; i--) {

            System.out.print(vetor[i] + "  ");

        }
    }
}
