public abstract class Grafik {

    private int x;
    private int y;
    private String farbe;

    public Grafik(int x, int y, String farbe) {
        positionieren(x, y);
        setFarbe(farbe);
    }

    public void positionieren(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Position=(" + x + ", " + y + "), Farbe=" + farbe;
    }

    public abstract void draw();
}
