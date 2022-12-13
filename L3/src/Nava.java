abstract class Nava {
    String nume;
    String pavilion;

    public Nava(String nume, String pavilion) {
        this.nume = nume;
        this.pavilion = pavilion;
    }

    public void utilizare(){

    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Nava" +"nume='" + nume  +", pavilion='" + pavilion;
    }
}
