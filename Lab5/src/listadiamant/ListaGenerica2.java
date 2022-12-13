package listadiamant;

public class ListaGenerica2<T> extends ListaGenerica<T>
{
    public T eliminaPrimul()
    {
        T first = null;
        if(this.iterator().hasNext())
        {
            first = this.iterator().next();

            primul = primul.getUrm();
            count--;
        }
        return first;
    }

    public T eliminaUltimul()
    {
        T last;

        if(ultimul != null)
        {
            last = ultimul.getInfo();
        }
        else
        {
            return null;
        }

        if(primul != null)
        {
            Element<T> iter = primul;

            if(primul == null) // 0 elem
            {
                return null;
            }

            if (primul == ultimul) // 1 elem
            {
                var temp = ultimul;
                primul = ultimul = null;
                count--;
                return temp.getInfo();
            }

            while (iter.getUrm().getUrm() != null) // 2+ elem
            {
                iter = iter.getUrm();
            }

            ultimul = iter;
            ultimul.setUrm(null);
            count--;

        }
        return last;
    }
}
