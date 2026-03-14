import java.util.Scanner;

public class es3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        System.out.println("Ciao " + nome + ", hai " + eta + " anni");

        scanner.close();
    }

}