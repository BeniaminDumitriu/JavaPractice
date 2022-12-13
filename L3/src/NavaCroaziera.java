public class NavaCroaziera extends Nava{
    int nrPasageri;

    public NavaCroaziera(int nrPasageri,String nume, String pavilion) {
        super(nume, pavilion);
        this.nrPasageri=nrPasageri;
    }

    @Override
    public void utilizare() {
        System.out.println("Croaziere de lux");
    }

    @Override
    public String toString() {
        return "NavaCroaziera - " +"nume='" + nume + ", pavilion=" + pavilion +", nrPasageri=" + nrPasageri ;
    }
}
