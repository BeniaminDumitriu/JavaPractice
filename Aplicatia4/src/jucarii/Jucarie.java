package jucarii;

import cutii.TipCutie;

import java.util.Arrays;

public abstract class Jucarie
{
    private double dimensiuni[] = new double[3];

    public abstract TipCutie getTipCutie();
    public abstract double getPret();

    public Jucarie(double l1, double l2, double l3)
    {
        this.dimensiuni[0] = l1;
        this.dimensiuni[1] = l2;
        this.dimensiuni[2] = l3;
    }

    public double[] getDimensiuni()
    {
        return dimensiuni;
    }

    public String getDimensiuniToString()
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 3; i++)
        {
            if(dimensiuni[i] != 0)
            {
                stringBuilder.append("l");
                stringBuilder.append(i);
                stringBuilder.append(" = ");
                stringBuilder.append(dimensiuni[i]);
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString().substring(0, stringBuilder.length() - 2);
    }

    @Override
    public String toString()
    {
        return "Cutie recomandata: " + getTipCutie() + ", " + getDimensiuniToString();
    }
}
