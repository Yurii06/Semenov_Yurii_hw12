import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Введите 5 имён для списка A:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список A: " + listA);

        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите 5 имён для списка B:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
        }

        System.out.println("Список B: " + listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Объединенный список C: " + listC);

        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Отсортированный список C: " + listC);
    }
}