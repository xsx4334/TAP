import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți textul:");
        String text = scanner.nextLine();

        String[] propozitii = text.split("[.!?]");

        for (String propozitie : propozitii) {
            propozitie = propozitie.trim();

            //litere, vocale și consoane
            int numarLitere = 0;
            int numarVocale = 0;
            int numarConsoane = 0;

            // Parcurgerea
            for (int i = 0; i < propozitie.length(); i++) {
                char caracter = Character.toLowerCase(propozitie.charAt(i));
                if (Character.isLetter(caracter)) {
                    numarLitere++;
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                        numarVocale++;
                    } else {
                        numarConsoane++;
                    }
                }
            }

            // Afișarea
            System.out.println("Propoziție: " + propozitie);
            System.out.println("Numărul total de litere: " + numarLitere);
            System.out.println("Numărul total de vocale: " + numarVocale);
            System.out.println("Numărul total de consoane: " + numarConsoane);
            System.out.println();
        }
    }
}
