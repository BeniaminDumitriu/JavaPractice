package jucarii;

import cutii.TipCutie;

public class Racheta extends Jucarie
{

    public Racheta(double h, double raza)
    {
        super(h, raza, 0);
    }

    @Override
    public TipCutie getTipCutie() {
        return TipCutie.CILINDRU;
    }

    @Override
    public double getPret() {
        return 120;
    }

    @Override
    public String toString()
    {
        return "Racheta - " + super.toString();
    }
}
