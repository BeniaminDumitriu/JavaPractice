public class Feribot extends NavaCroaziera{
    private int nrAuto;

    public Feribot(int nrAuto, int nrPasageri, String nume, String pavilion) {
        super(nrPasageri,nume, pavilion);
        this.nrAuto=nrAuto;
    }

    @Override
    public void utilizare() {
        System.out.println("Transport vehicule si pasageri");
    }

    @Override
    public String toString() {
        return "Feribot - " +"nrAuto=" + nrAuto + ", nume='" + nume + ", pavilion='" + pavilion +", nrPasageri=" + nrPasageri;
    }
}
