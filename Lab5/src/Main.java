import listadiamant.ListaGenerica;
import listadiamant.ListaGenerica2;

public class Main {
    public static void main(String[] args) {
        ListaGenerica2<String> lst= new ListaGenerica2<>();

        lst.insertLaUrma("Bucuresti");
        lst.insertInFata("Suceava");
        lst.insertLaUrma("Iasi");

        System.out.println("Nr orase: " + lst.size());
        System.out.println("Orasele din lista:" + lst);
        lst.eliminaToateElementele();

        for(int i=0;i<21;i++) {
            String o=Integer.toString(i); // o=""+i
            if(i%2 !=0)
                lst.insertInFata(o);
            else
                lst.insertLaUrma(o);
        }

        System.out.println("Numerele din lsta:" + lst);
        System.out.print("Intregii din lsta x10: ");
        for(String el : lst){
            System.out.print((Integer.valueOf(el) * 10) + ", ");
        }
        System.out.println("\nLungimea listei de numere este: " + lst.size());

        System.out.println("================ Demo eliminaPrimul() ==================");

        while (lst.size() != 0)
        {
            System.out.println("Numere din lista ( " + lst.size() + " ): " + lst);
            lst.eliminaPrimul();
        }

        lst.eliminaToateElementele();
        for(int i=0;i<21;i++) {
            String o=Integer.toString(i); // o=""+i
            if(i%2 !=0)
                lst.insertInFata(o);
            else
                lst.insertLaUrma(o);
        }

        while(lst.size() != 0)
        {
            System.out.println("Numere din lista ( " + lst.size() + " ): " + lst);
            lst.eliminaUltimul();
        }

        lst.eliminaToateElementele();
        for(int i=0;i<21;i++) {
            String o=Integer.toString(i); // o=""+i
            if(i%2 !=0)
                lst.insertInFata(o);
            else
                lst.insertLaUrma(o);
        }
        System.out.println("================ Demo elimina Primul si Ultimul alternativ =======================");

        while (lst.size() != 0)
        {
            if (lst.size() % 2 == 0)
            {
                lst.eliminaPrimul();
            }
            else
            {
                lst.eliminaUltimul();
            }
            System.out.println("Numere din lista ( " + lst.size() + " ): " + lst);
        }

    }
}