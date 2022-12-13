package cutii;

import jucarii.Avion;
import jucarii.Jucarie;
import jucarii.Minge;
import jucarii.Racheta;

public interface ICutie
{
    public static double pretUnitateDeSuprafata = 0.05;

    public static double lnod=20;

    abstract public double getSuprafataTotala();

    abstract public double getLungimePanglica();

    abstract public String getDimensiuniToString();
    static String getDimensiuniToString(Jucarie jucarie)
    {
        if(jucarie instanceof Avion)
        {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("Lungime = ");
            stringBuilder.append(jucarie.getDimensiuni()[0]);
            stringBuilder.append(", Latime = ");
            stringBuilder.append(jucarie.getDimensiuni()[1]);
            stringBuilder.append(", Inaltime = ");
            stringBuilder.append(jucarie.getDimensiuni()[2]);

            return stringBuilder.toString();
        }
        else if (jucarie instanceof Minge)
        {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("Latura = ");
            stringBuilder.append(jucarie.getDimensiuni()[0]);

            return stringBuilder.toString();
        }
        else if (jucarie instanceof Racheta)
        {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("Inaltimea = ");
            stringBuilder.append(jucarie.getDimensiuni()[0]);
            stringBuilder.append(", Raza = ");
            stringBuilder.append(jucarie.getDimensiuni()[1]);

            return stringBuilder.toString();
        }
        return "\n --- Jucarie fara dimensiuni (Not implemented) --- \n";
    }

    public default double pret()
    {
        return getSuprafataTotala() * pretUnitateDeSuprafata;
    }

    public String toString();
}