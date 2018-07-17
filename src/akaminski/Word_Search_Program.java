package akaminski;

import java.util.Scanner;

public class Word_Search_Program {


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


        switch (Wybor) {

            case 1: //zaczyna sie na poszczególne litery
                for(String w: Rzeczy) {
                    if (w.startsWith(litera))
                        System.out.println(w + " Zaczyna się na: " + litera);
                }
                break;

            case 2:  //kończy sie na poszczególne litery
                for (String w: Rzeczy) {
                    if (w.endsWith(litera))
                        System.out.println(w + " kończy się na: " + litera);
                }
                break;

            case 3:  //zawiera poszczególne litery
                for (String w: Rzeczy) {
                    if (w.contains(litera))
                        System.out.println(w + " Zawiera: " + litera);
                }
                break;

            default:
                System.out.println("nie ma takich słów");
        }

    }
}

