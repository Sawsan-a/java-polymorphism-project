# OOP2 – Abstrakte Klassen, Vererbung, Interfaces und Polymorphismus

Kleines Java-Projekt aus dem Studium zur praktischen Anwendung zentraler Konzepte der objektorientierten Programmierung.

## Lernziele

- abstrakte Klassen
- Vererbung
- Kapselung
- Überschreiben von Methoden
- Interfaces
- Polymorphismus
- `Comparable`
- UML-Klassendiagramme

## Klassen und Interfaces

- `Grafik` – abstrakte Basisklasse mit Position und Farbe
- `Quadrat` – konkrete Subklasse von `Grafik`
- `Kreis` – Subklasse von `Grafik`, implementiert `Rollbar` und `Comparable`
- `Tonne` – implementiert `Rollbar`, erbt aber nicht von `Grafik`
- `Rollbar` – Interface für rollbare Objekte
- `Test` – enthält Beispielaufrufe und Tests

## Projektidee

Das Projekt demonstriert, dass der Datentyp eines Objekts nicht nur durch seine Vererbung, sondern auch durch implementierte Interfaces bestimmt wird.

Beispiel:

```java
Rollbar meineRolle = new Kreis(0, 0, 5.0, "Rot");
meineRolle.rollen();

meineRolle = new Tonne();
meineRolle.rollen();
```

Obwohl `Kreis` und `Tonne` keine gemeinsame spezielle Oberklasse außer `Object` besitzen, können beide über das Interface `Rollbar` einheitlich verwendet werden.

## Ausführen

In Eclipse:

1. Projekt importieren oder neues Java-Projekt anlegen.
2. Die Dateien aus `src/` in den Source-Ordner kopieren.
3. `Test.java` öffnen.
4. `Run -> Run As -> Java Application`.

Oder im Terminal:

```bash
javac src/*.java
java -cp src Test
```

## Hinweise zur Aufgabenstellung

Nach dem Hinzufügen einer abstrakten Methode `draw()` muss auch die Klasse `Grafik` als `abstract` deklariert werden. Eine abstrakte Klasse kann anschließend nicht mehr direkt mit `new Grafik(...)` instanziiert werden.

Wenn `Quadrat` von `Grafik` erbt, muss `Quadrat` die abstrakte Methode `draw()` implementieren, sofern `Quadrat` selbst nicht ebenfalls abstrakt sein soll.

Felder in einem Java-Interface sind implizit `public static final`. Daher eignet sich ein normales Interface-Feld nicht als veränderbare Instanzvariable für eine Geschwindigkeit. Stattdessen wird eine Methode wie `setGeschwindigkeit(double)` im Interface festgelegt.

`Tonne` kann über `Rollbar` verwendet werden, aber nicht über `Comparable`, weil die Klasse `Comparable` nicht implementiert.

## UML

Das UML-Modell befindet sich unter `uml/klassendiagramm.puml`.
