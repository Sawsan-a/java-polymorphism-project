@SuppressWarnings("rawtypes")
public class Kreis extends Grafik implements Rollbar, Comparable {

    private double radius;
    private double geschwindigkeit;

    public Kreis(int x, int y, double radius, String farbe) {
        super(x, y, farbe);
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Der Radius muss größer als 0 sein.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void setGeschwindigkeit(double geschwindigkeit) {
        if (geschwindigkeit < 0) {
            throw new IllegalArgumentException("Die Geschwindigkeit darf nicht negativ sein.");
        }
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public int rollen() {
        return (int) Math.round(geschwindigkeit);
    }

    @Override
    public void draw() {
        System.out.println("Kreis wird gezeichnet: " + this);
    }

    @Override
    public int compareTo(Object obj) {
        // Laut Aufgabenstellung zunächst keine echte Vergleichslogik nötig.
        return 0;
    }

    @Override
    public String toString() {
        return "Kreis{" + super.toString()
                + ", Radius=" + radius
                + ", Geschwindigkeit=" + geschwindigkeit
                + "}";
    }
}
