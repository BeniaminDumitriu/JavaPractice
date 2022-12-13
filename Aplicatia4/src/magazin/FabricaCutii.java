package magazin;

import cutii.Cilindru;
import cutii.Cub;
import cutii.ICutie;
import cutii.Paralelipiped;
import jucarii.Jucarie;

public class FabricaCutii
{
    public static ICutie getCutie(Jucarie jucarie)
    {
        var j = jucarie.getDimensiuni();
        return switch (jucarie.getTipCutie())
        {
            case CUB -> new Cub(j[0]);
            case CILINDRU -> new Cilindru(j[0], j[1]);
            case PARALELIPIPED -> new Paralelipiped(j[0], j[1], j[2]);
        };
    }

    public static String toString(Jucarie jucarie)
    {
        StringBuilder stringBuilder = new StringBuilder("Fabrica Cutii:\n");

        String tipCutie = jucarie.getTipCutie().toString().toLowerCase();
        tipCutie = tipCutie.substring(0,1).toUpperCase() + tipCutie.substring(1);

        stringBuilder.append("\tPentru jucaria: ");
        stringBuilder.append(jucarie);
        stringBuilder.append("\n\tCutie: ");
        stringBuilder.append(tipCutie);
        stringBuilder.append(": ");
        stringBuilder.append(ICutie.getDimensiuniToString(jucarie));

        return stringBuilder.toString();
    }
}
