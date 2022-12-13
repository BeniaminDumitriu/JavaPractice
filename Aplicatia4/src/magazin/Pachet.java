package magazin;

import cutii.ICutie;
import jucarii.Jucarie;

public class Pachet
{
    ICutie cutie;
    Jucarie jucarie;

    double lungimePanglica = 0;

    public Pachet(Jucarie jucarie, boolean cereCutie, boolean cerePanglica)
    {
        this.jucarie = jucarie;

        if(cereCutie)
        {
            cutie = FabricaCutii.getCutie(jucarie);

            if(cerePanglica)
            {
                lungimePanglica = cutie.getLungimePanglica();
                if(!RolaPanglica.getRolaPanglica().getPanglica(lungimePanglica))
                {
                    System.out.println("Rola Panglica insuficienta");
                    lungimePanglica = 0;
                }
            }
        }
        // nu se poate cere Panglica daca nu avem cutie
    }

    public double pretPachet(boolean GetPretAndBuy)
    {
        return jucarie.getPret() + (cutie != null ? cutie.pret() : 0) + RolaPanglica.getRolaPanglica().getPret(lungimePanglica, GetPretAndBuy);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Pachet - ");
        stringBuilder.append(jucarie);

        if(cutie != null) // cere cutie
        {
            stringBuilder.append(", impachetat in ");
            stringBuilder.append(cutie.getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append(ICutie.getDimensiuniToString(jucarie));

            if(lungimePanglica != 0) //cere panglica
            {
                stringBuilder.append(", lunime Panglica = ");
                stringBuilder.append(cutie.getLungimePanglica());
            }
        }

        stringBuilder.append(", Pret = ");
        stringBuilder.append(pretPachet(true));


        return stringBuilder.toString();
    }
}
