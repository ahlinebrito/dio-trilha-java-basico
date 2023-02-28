import java.util.Scanner; 
    
public class MesadadoSobrinho {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int entrada = leitor.nextInt();
            int mesada = 50;
            
            
             System.out.println(mesada * entrada);
        }



    }
}