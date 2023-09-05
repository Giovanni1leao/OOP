package listaPOO;
import java.util.Scanner;

public class Booking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos quartos vão ser alugados: ");
        int tam = scanner.nextInt();

        Hospede[] hospedes = new Hospede[10];

        for (int i = 0; i < tam; i++) {
        	System.out.println();
            System.out.println("#Aluguel " + (i + 1) + ":");
            scanner.nextLine(); // Limpar o buffer do Enter
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Numero do quarto: ");
            int quarto = scanner.nextInt();
            hospedes[i] = new Hospede(nome, email, quarto);
        }
        System.out.println();
        System.out.println("Informacoes dos hospedes: ");
        System.out.println();
        for (int j = 0; j < 10; j++) {
        	if(hospedes[j]!=null) {
            System.out.println(hospedes[j].getQuarto() + ": " + hospedes[j].getNome() + " - " + hospedes[j].getEmail());
            System.out.println();
        }
       }

        scanner.close();
    }
}
