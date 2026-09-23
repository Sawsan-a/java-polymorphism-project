public class Tonne implements Rollbar {

    private double geschwindigkeit;

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
    public String toString() {
        return "Tonne{Geschwindigkeit=" + geschwindigkeit + "}";
    }
}
