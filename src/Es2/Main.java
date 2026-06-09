package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        int N = Integer.parseInt(scanner.nextLine());

        List<Integer> numeri = getOrderedNumbers(N);
        System.out.println(numeri);

        List<Integer> reversed = getReversednumbers(numeri);
        System.out.println(reversed);

    }

    public static List<Integer> getOrderedNumbers(int N) {

        List<Integer> numeri = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numeri.add((int) (Math.random() * 100) + 1);
        }
        Collections.sort(numeri);

        return numeri;
    }

    public static List<Integer> getReversednumbers(List<Integer> list) {

        List<Integer> reversed = new ArrayList<>(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    ;

}
