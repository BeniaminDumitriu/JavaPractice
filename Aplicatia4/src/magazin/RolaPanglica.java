package magazin;

import cutii.ICutie;

public class RolaPanglica
{
    private double costUnitateLungime = 0.01;
    private double disponibil;
    private static RolaPanglica rolaPanglica = new RolaPanglica();

    private RolaPanglica()
    {
        disponibil = 10000;
    }

    public static RolaPanglica getRolaPanglica()
    {
        return rolaPanglica;
    }

    public boolean getPanglica (double d)
    {
        if(d < disponibil)
        {
            disponibil -= d;
            return true;
        }
        System.out.println("No more Panglica, Aducem alta :)"); // DEBUG
        rolaPanglica = new RolaPanglica();

        disponibil -= d;
        return true;
    }

    public String getDisponibilToString()
    {
        return "Rola Panglica - " + disponibil;
    }

    public String getDisponibilAfterToString(double d)
    {
        return "Rola Panglica - " + (disponibil - d);
    }

    public String toString(ICutie cutie)
    {
        var stringBuilder = new StringBuilder();

        stringBuilder.append("Pentru cutia: Cutie - ");
        stringBuilder.append(cutie.getClass().getSimpleName());
        stringBuilder.append(", ");
        stringBuilder.append(cutie.getDimensiuniToString());
        stringBuilder.append(", necesar panglica: ");
        stringBuilder.append(cutie.getLungimePanglica());
        stringBuilder.append(", a mai ramas: ");
        stringBuilder.append(getDisponibilAfterToString(cutie.getLungimePanglica()));
        if(!getPanglica(cutie.getLungimePanglica()))
        {
            stringBuilder.append(" - insuficient!");
        }


        return stringBuilder.toString();
    }

    public double getPret(double d, boolean GetPriceAndBuy)
    {
        if(GetPriceAndBuy)
        {
            getPanglica(d);
        }

        return d * costUnitateLungime;
    }

}
