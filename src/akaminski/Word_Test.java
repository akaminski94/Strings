package akaminski;

import java.util.*;

public class Word_Test {

    public static void main(String[] args) {

        int Wybor;
        String litera;
        String slowo;
        Scanner odczyt = new Scanner(System.in);
        String[] Rzeczy = {"kalkulator", "drabina", "szafka", "linijka", "telefon"};
        List<String> list1 = new LinkedList<>();
        String[] Rzeczy2 = {"rower", "monitor", "myszka", "kalkulator","linijka"};
        List<String> list2 = new LinkedList<>();

        Word_class word = new Word_class();
       // System.out.println(list1);
       // word.Dodaj(Rzeczy,list1);
       // word.Dodaj(Rzeczy2,list2);
       // word.DodajList(list1,list2);
       // System.out.println(list1);
        //word.Wyswietl(list1);
       //word.Edytuj(list1,list2);
        //System.out.println();
       // word.Reverse(list1);
       // word.Wyswietl(list1);
       // System.out.println();
        //word.Usun(list1);
        word.Dodaj(Rzeczy,list1);
        word.Dodaj(Rzeczy2,list2);
        word.Con(list1,Rzeczy);
        word.Con(list2,Rzeczy2);
        word.Wyswietl(list1);
       System.out.println();
        word.Wyswietl(list2);
        System.out.println();
        word.check(list1,list2);


    }

}
