public class Quadrat extends Grafik {

    private double laenge;

    public Quadrat(int x, int y, double laenge, String farbe) {
        super(x, y, farbe);
        setLaenge(laenge);
    }

    public void setLaenge(double laenge) {
        if (laenge <= 0) {
            throw new IllegalArgumentException("Die Länge muss größer als 0 sein.");
        }
        this.laenge = laenge;
    }

    public double getLaenge() {
        return laenge;
    }

    @Override
    public void draw() {
        System.out.println("Quadrat wird gezeichnet: " + this);
    }

    @Override
    public String toString() {
        return "Quadrat{" + super.toString() + ", Länge=" + laenge + "}";
    }
}
