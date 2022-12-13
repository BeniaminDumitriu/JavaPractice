import cutii.Cilindru;
import cutii.Cub;
import cutii.ICutie;
import cutii.Paralelipiped;
import jucarii.Avion;
import jucarii.Jucarie;
import jucarii.Minge;
import jucarii.Racheta;
import magazin.FabricaCutii;
import magazin.Magazin;
import magazin.Pachet;
import magazin.RolaPanglica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(" ===  ===  === Demo cutii ===  ===  === \n");

        ICutie p1 = new Paralelipiped(20, 10, 30);
        ICutie cub1 = new Cub(40);
        ICutie cil1 = new Cilindru(60, 50);

        System.out.println(p1);
        System.out.println(cub1);
        System.out.println(cil1);


        System.out.println("\n ===  ===  === Demo Jucarii ===  ===  === \n");

        Jucarie a1 = new Avion(15,25,35);
        Jucarie m1 = new Minge(45);
        Jucarie r1 = new Racheta(65, 55);

        System.out.println(a1);
        System.out.println(m1);
        System.out.println(r1);


        System.out.println("\n ===  ===  === Demo Fabrica de cutii ===  ===  === \n");

        System.out.println(FabricaCutii.toString(a1));
        System.out.println(FabricaCutii.toString(m1));
        System.out.println(FabricaCutii.toString(r1));


        System.out.println("\n ===  ===  === Demo Panglica ===  ===  === \n");

        System.out.println(RolaPanglica.getRolaPanglica().toString(p1));
        System.out.println(RolaPanglica.getRolaPanglica().toString(cub1));
        System.out.println(RolaPanglica.getRolaPanglica().toString(cil1));


        System.out.println("\n ===  ===  === Demo Pachet ===  ===  === \n");

        Minge m2 = new Minge(5);

        Pachet pachet1 = new Pachet(m2, true, true);

        System.out.println(pachet1);


        System.out.println("\n ===  ===  === Demo Magazin ===  ===  === \n");

        Magazin m = new Magazin();
        ArrayList<Pachet> vanzari = m.getListaVanzari();
        vanzari.add( new Pachet(new Minge(10), true, true) );
        vanzari.add( new Pachet(new Minge(10), true, false) );
        vanzari.add( new Pachet(new Minge(10), true, true) );
        vanzari.add( new Pachet(new Minge(10), false, false) );
        vanzari.add( new Pachet(new Racheta(10,20), false, false) );
        vanzari.add( new Pachet(new Avion(10,20, 30), false, false) );
        vanzari.add( new Pachet(new Avion(10,20, 30), true, false) );
        m.afisVanzari();
        System.out.println("In rola au mai ramas " + RolaPanglica.getRolaPanglica().getDisponibilToString()+" cm");

        System.out.println("\n ===  ===  === Tema Ex1 ===  ===  === \n");

        m.afisPacheteDupaPret(false);
        System.out.println();
        m.afisPacheteDupaPret(true);

    }
}