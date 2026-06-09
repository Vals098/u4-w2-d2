package Es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserisci il numero di elementi:");
            int N = Integer.parseInt(scanner.nextLine());

            Set<String> parole = new HashSet<>();
            Set<String> duplicate = new HashSet<>();

            System.out.println("Inserisci " + N + " parole:");
            for (int i = 0; i < N; i++) {
                String parola = scanner.nextLine();
                boolean isAdded = parole.add(parola);

                if (!isAdded) {
                    duplicate.add(parola);
                } else {
                    parole.add(parola);
                }
                ;

            }
            
            System.out.println("Parole duplicate: " + duplicate);
            System.out.println("Parole distinte: " + parole);
            System.out.println("Numero parole distinte: " + parole.size());

        } catch (NumberFormatException e) {
            System.out.println("Inserisci un valore numerico");
        }

    }


}
