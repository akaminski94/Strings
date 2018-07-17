package akaminski;

public class Word_class {
    //Przeszukwianie tabeli
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
}
