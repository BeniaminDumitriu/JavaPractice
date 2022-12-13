import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Flota {
    Nava[] nave;
    int nrNave;

    public Flota() {
        nave=new Nava[10];
        nrNave=0;
    }

    public Flota(String fisier) throws FileNotFoundException{
        Scanner scanner= new Scanner( new File("C:\\Users\\Sebastian\\Desktop\\SDA_L3\\Claudiu\\src\\NaveMaritime\\fisier.txt"));
        int k= scanner.nextInt();
        this.nrNave = k;
        this.nave = new Nava[k];
        String[] s;
        scanner.nextLine();
        for(int j=0;j < k;j++)
        {
            s = scanner.nextLine().split(", ");

            if(Objects.equals(s[2], "NavaCroaziera")) {
                int nrPasageri = Integer.parseInt(s[3]);
                NavaCroaziera n = new NavaCroaziera( nrPasageri ,s[0], s[1]);
                this.nave[j] = n;


            }
            if(Objects.equals(s[2],"Cargo"))
            {
                int capacitate = Integer.parseInt(s[3]);
                Cargo c = new Cargo( capacitate,s[0], s[1]);
                this.nave[j] = c;
            }
            if(Objects.equals(s[2],"Feribot"))
            {
                int nrPasageri = Integer.parseInt(s[3]);
                int nrMasini= Integer.parseInt(s[4]);
                Feribot f = new Feribot( nrMasini, nrPasageri,s[0], s[1]);
                this.nave[j] = f;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
/*        Flota flota1 = new Flota();
        NavaCroaziera sv = new NavaCroaziera(1000, "Suceava", "RO");
        System.out.println();
        flota1.adaugaNava(sv);
        flota1.adaugaNava(new NavaCroaziera(5000, "Victoria", "RO"));
        flota1.adaugaNava(new Cargo(5000, "Iasi", "RO"));
        flota1.adaugaNava(new Feribot(5000,200, "Bucuresti", "RO"));
        System.out.println(flota1);
        flota1.utilizare();*/

        Flota flota=new Flota("fisier.txt");
        System.out.println(flota);
        flota.utilizare();
        System.out.println(flota.toStringFlota(false));
    }

    @Override
    public String toString() {
        StringBuilder stringNave=new StringBuilder();
        System.out.println("Flota:");
        for(int i=0;i<nrNave;i++)
            stringNave.append(i+1).append(". ").append(nave[i].toString()).append("\n");
        return stringNave.toString();
    }
    public String toStringFlota(boolean dupaNume) {
        if(dupaNume){
            for (int i = 0; i < nrNave; i++) {
                for (int j = i + 1; j < nrNave; j++) {

                    // to compare one string with other strings
                    if ((nave[i].nume).compareTo(nave[j].nume) > 0) {
                        // swapping
                        Nava temp = nave[i];
                        nave[i] = nave[j];
                        nave[j] = temp;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < nrNave; i++) {
                for (int j = i + 1; j < nrNave; j++) {

                    // to compare one string with other strings
                    if ((nave[i].pavilion).compareTo(nave[j].pavilion) > 0) {
                        // swapping
                        Nava temp = nave[i];
                        nave[i] = nave[j];
                        nave[j] = temp;
                    }
                }
            }
        }

        return toString();
    }
    public void adaugaNava(Nava nava)
    {
        if(nrNave==nave.length)
            nave=Arrays.copyOf(nave,nave.length*2);
        nave[nrNave++]=nava;
    }
    private void utilizare() {
        System.out.println("\nUtilizare flota:\n");
        for(int i=0;i<nrNave;i++) {
            System.out.print(nave[i].nume + " - ");
            nave[i].utilizare();
        }
    }
}
