package cutii;

import jucarii.Jucarie;

public class Cub implements ICutie
{
    double latura;

    public Cub(double latura)
    {
        this.latura = latura;
    }

    @Override
    public double getSuprafataTotala()
    {
        return 6 * Math.pow(latura, 2);
    }

    @Override
    public double getLungimePanglica()
    {
        return Math.ceil(8 * latura + lnod);
    }

    @Override
    public String getDimensiuniToString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Latura = ");
        stringBuilder.append(latura);

        return stringBuilder.toString();
    }

    @Override
    public double pret()
    {
        return ICutie.super.pret();
    }

    @Override
    public String toString() {
        return "Cutie - Cub { l = " + latura + " }";
    }
}
