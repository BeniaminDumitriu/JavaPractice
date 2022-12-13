package cutii;

import jucarii.Jucarie;

public class Cilindru implements ICutie
{
    double h;
    double raza;

    public Cilindru(double h, double raza)
    {
        this.h = h;
        this.raza = raza;
    }

    @Override
    public double getSuprafataTotala()
    {
        return 2 * Math.PI * raza * h + 2 * Math.PI * Math.pow(raza, 2);
    }

    @Override
    public double getLungimePanglica()
    {
        return Math.ceil(4 * Math.PI * raza + lnod);
    }

    @Override
    public String getDimensiuniToString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Inaltimea = ");
        stringBuilder.append(h);
        stringBuilder.append(", Raza = ");
        stringBuilder.append(raza);

        return stringBuilder.toString();
    }

    @Override
    public double pret()
    {
        return ICutie.super.pret();
    }

    @Override
    public String toString() {
        return "Cutie - Cilindru {" +
                " h = " + h +
                ", raza = " + raza +
                " }";
    }
}
