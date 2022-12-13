package jucarii;

import cutii.TipCutie;

public class Avion extends Jucarie
{
    public Avion(double L, double l, double h)
    {
        super(L, l, h);
    }

    @Override
    public TipCutie getTipCutie()
    {
        return TipCutie.PARALELIPIPED;
    }

    @Override
    public double getPret()
    {
        return 100;
    }

    @Override
    public String toString()
    {
        return "Avion - " + super.toString();
    }
}
