public class Cargo extends Nava{
    private int capacitateIncarcare;


    public Cargo(int capacitateIncarcare,String nume, String pavilion) {
        super(nume, pavilion);
        this.capacitateIncarcare=capacitateIncarcare;
    }

    @Override
    public void utilizare() {
        System.out.println("Transport marfuri");
    }
    @Override
    public String toString() {
        return "Cargo - " +"capacitateIncarcare=" + capacitateIncarcare +", nume=" + nume +", pavilion='" + pavilion;
    }
}
