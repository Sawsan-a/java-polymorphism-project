@SuppressWarnings({ "rawtypes", "unchecked" })
public class Test {

    public static void main(String[] args) {

        System.out.println("=== 1/2: Grafik und Quadrat ===");

        Quadrat quadrat = new Quadrat(10, 20, 5.0, "Rot");
        System.out.println(quadrat);

        quadrat.positionieren(30, 40);
        System.out.println("Nach dem Verschieben: " + quadrat);

        quadrat.setFarbe("Blau");
        System.out.println("Nach Farbänderung: " + quadrat);

        quadrat.setLaenge(8.0);
        System.out.println("Nach Längenänderung: " + quadrat);

        quadrat.draw();

        // Polymorphismus über die abstrakte Oberklasse:
        Grafik grafik = quadrat;
        grafik.positionieren(50, 60);
        System.out.println("Über Grafik-Referenz: " + grafik);
        grafik.draw();

        System.out.println();
        System.out.println("=== 3/4: Rollbar, Kreis und Tonne ===");

        Kreis kreis = new Kreis(5, 5, 10.0, "Grün");
        kreis.setGeschwindigkeit(12.5);
        System.out.println(kreis);
        kreis.draw();

        Tonne tonne = new Tonne();
        tonne.setGeschwindigkeit(7.0);
        System.out.println(tonne);

        System.out.println();
        System.out.println("=== 5a: Polymorphismus mit Rollbar ===");

        Rollbar meineRolle = kreis;
        System.out.println("Kreis rollen(): " + meineRolle.rollen());

        meineRolle = tonne;
        System.out.println("Tonne rollen(): " + meineRolle.rollen());

        System.out.println();
        System.out.println("=== 5b: Comparable mit Strings ===");

        Comparable comp1 = "Apfel";
        Comparable comp2 = "Banane";
        System.out.println("\"Apfel\" compareTo \"Banane\": " + comp1.compareTo(comp2));

        System.out.println();
        System.out.println("=== 5c: Comparable mit Kreisen ===");

        comp1 = new Kreis(0, 0, 4.0, "Schwarz");
        comp2 = new Kreis(1, 1, 8.0, "Weiß");
        System.out.println("Kreis compareTo Kreis: " + comp1.compareTo(comp2));

        System.out.println();
        System.out.println("=== 5d: Warum Tonne nicht als Comparable? ===");

        System.out.println(
            "Tonne implementiert Rollbar, aber nicht Comparable. "
            + "Deshalb kann eine Tonne nicht einer Comparable-Variable zugewiesen werden."
        );

        // Diese Zeilen würden absichtlich NICHT kompilieren:
        // comp1 = new Tonne();
        // comp2 = new Tonne();
        // System.out.println(comp1.compareTo(comp2));
    }
}
