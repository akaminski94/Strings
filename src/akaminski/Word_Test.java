package akaminski;

import java.util.Scanner;

public class Word_Test {

    public static void main(String[] args) {

        int Wybor;
        String litera;
        String slowo;
        Scanner odczyt = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");
        String[] Rzeczy = {"kalkulator", "drabina", "szafka", "linijka", "telefon"};

        System.out.println("Co chcesz zrobić? ");
        System.out.println("1.Zaczyna," + newLine + "2.Kończy," + newLine + "3.Zawiera ");
        Wybor = Integer.parseInt(odczyt.nextLine());
        System.out.println("Podaj litere: ");
        litera = odczyt.nextLine();

        Word_class Word = new Word_class();
        Word.szukaj(Wybor,Rzeczy,litera);

    }

}
