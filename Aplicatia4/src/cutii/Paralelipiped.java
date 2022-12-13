package cutii;

import jucarii.Jucarie;

public class Paralelipiped implements ICutie
{
    double L;
    double l;
    double h;

    public Paralelipiped(double L, double l, double h)
    {
        this.L = L;
        this.l = l;
        this.h = h;
    }

    @Override
    public double getSuprafataTotala()
    {
        return (L * l + L * h + l * h) * 2;
    }

    @Override
    public double getLungimePanglica()
    {
        return Math.ceil(2 * (L + h) + 2 * (l + L) + lnod);
    }

    @Override
    public String getDimensiuniToString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Lungime = ");
        stringBuilder.append(L);
        stringBuilder.append(", Latime = ");
        stringBuilder.append(l);
        stringBuilder.append(", Inaltime = ");
        stringBuilder.append(h);

        return stringBuilder.toString();
    }

    @Override
    public double pret()
    {
        return ICutie.super.pret();
    }

    @Override
    public String toString() {
        return "Cutie - Paralelipiped { L = " + L + ", l = " + l + ", h = " + h + " }";
    }
}
