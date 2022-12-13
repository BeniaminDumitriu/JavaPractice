package jucarii;

import cutii.TipCutie;

public class Minge extends Jucarie
{
    public Minge(double razaMinge)
    {
        super(razaMinge * 2, 0, 0);
    }

    @Override
    public TipCutie getTipCutie()
    {
        return TipCutie.CUB;
    }

    @Override
    public double getPret()
    {
        return 50;
    }

    @Override
    public String toString()
    {
        return "Minge - " + super.toString();
    }
}

