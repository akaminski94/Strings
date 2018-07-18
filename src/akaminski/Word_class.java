package akaminski;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class Word_class {
    Scanner odczyt = new Scanner(System.in);

    //Przeszukwianie array
    public void szukaj(int Wybor, String[] Tabela, String Word){

        switch (Wybor) {

            case 1: //zaczyna sie na poszczególne litery
                for(String w: Tabela) {
                    if (w.startsWith(Word))
                        System.out.println(w + " Zaczyna się na: " + Word);
                }
                break;

            case 2:  //kończy sie na poszczególne litery
                for (String w: Tabela) {
                    if (w.endsWith(Word))
                        System.out.println(w + " kończy się na: " + Word);
                }
                break;

            case 3:  //zawiera poszczególne litery
                for (String w: Tabela) {
                    if (w.contains(Word))
                        System.out.println(w + " Zawiera: " + Word);
                }
                break;

            default:
                System.out.println("nie ma takich słów");
        }

    }

    //Silnia uzywając rekurencji
    public long fact (long n){

        if (n <= 1)
            return 1; //if 0 || 1
        else
            return n * fact(n -1);

    }

    //Dodawanie do list
    public void Dodaj(String[]Tabela, List<String>list){
        for(String x: Tabela)
            list.add(x);
    }

    //Wyswietl
    public void Wyswietl(List<String>list){
        for(int i = 0; i<list.size(); i++){
            System.out.printf("%s ", list.get(i));
        }
    }

    //Edycja (przy uzyciu iteratora) list1, gdy list 2 zawiera takie same wartosci to usuwa je z list 1
    public void Edytuj(List<String>list,List<String>list2){
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if (list2.contains(it.next()))
                it.remove();
        }
    }

    //Dodawanie zawartości pomiędzy list'ami
    public void DodajList(List<String>list,List<String>list2){
        list.addAll(list2);
    }

    //Odwracanie
    public void Reverse(List<String>list){
        ListIterator<String> rev = list.listIterator(list.size());
        while (rev.hasPrevious())
            System.out.printf("%s ", rev.previous());
    }

    //Usuwanie
    public void Usun(List<String>list){
        System.out.println("Który element?");
        int wybor = Integer.parseInt(odczyt.nextLine());
        list.remove(wybor);
    }

    //Konwersja List na Array
    public void Con(List<String>list,String[]Tabela ){
    Tabela = list.toArray(new String[list.size()]);
    }

    //Sortowanie Collections
    public void Sort(List<String>list ){
        Collections.sort(list);//alfabetycznie
    }
    //Kopiowanie Collections
    public void Cop(List<String>listdest,List<String>listsrc ){
        Collections.copy(listdest,listsrc);
    }

    //Wypełnianie Collection
    public void Fill(List<String>list ){
        Collections.fill(list, "X");
    }

    //Addall Collection
    public void addall(List<String>srclist,String[]Tabela ){
        Collections.addAll(srclist,Tabela);
    }

    //Sprawdzanie obu Collections
    public void check(List<String>list,List<String>list2 ){
        boolean ch = Collections.disjoint(list,list2);
        if(ch){
            System.out.println("Nie mają nic wspólnego");
        }
        else
            System.out.println("mają coś wspólnego");
    }

}
