package magazin;

import java.util.ArrayList;

public class Magazin
{
    private ArrayList<Pachet> listaVanzari;

    public Magazin()
    {
        listaVanzari = new ArrayList<Pachet>();
    }

    public void afisVanzari()
    {
        double pretTotal = 0;
        System.out.println("Vanzari efectuate:\n");
        for (int i = 0; i < listaVanzari.size(); i++)
        {
            System.out.println(i + ". " + listaVanzari.get(i));
            pretTotal += listaVanzari.get(i).pretPachet(false);
        }
        System.out.println("Suma totala incasata = " + pretTotal);
    }

    public void afisPacheteDupaPret(boolean descrescator)
    {
        System.out.println("Afisare " + (descrescator? "descrescator" : "crescator") + "\n");

        listaVanzari.sort((o1, o2) -> {
            var p1 = o1.pretPachet(false);
            var p2 = o2.pretPachet(false);

            return descrescator? -Double.compare(p1,p2) : Double.compare(p1,p2);
        });

        for (int i = 0; i < listaVanzari.size(); i++)
        {
            System.out.println(i + ". " + listaVanzari.get(i));
        }
    }

    public ArrayList<Pachet> getListaVanzari()
    {
        return listaVanzari;
    }
}
