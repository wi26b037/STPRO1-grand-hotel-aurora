# Hinweise für KI-Assistenten

Dieses Repository ist ein Uni-Projekt für die Lehrveranstaltung
**Strukturierte Programmierung 1**. Der Autor (Markus) lernt Java gerade erst.
Erkläre Änderungen kurz und verständlich, statt nur Code zu liefern.

## Harte Vorgaben der Lehrveranstaltung

Das Projekt muss strukturierte Programmierung in Java verwenden, inklusive Records oder
einfacher Klassen. **Nicht erlaubt** sind:

- Vererbung (`extends`), abstrakte Klassen, Interfaces (`implements`)
- Collections (`List`, `ArrayList`, `Map`, `Set`, ...). Stattdessen **nur Arrays**.
- Streams, Lambdas, Methodenreferenzen, `Optional`
- Generics, Enums mit Verhalten, sonstige höhere Java-Features

Erlaubt und erwünscht:

- `record`s für unveränderliche Daten (`Scene`, `Choice`, `Clue`, `Suspect`)
- einfache Klassen mit Feldern für veränderlichen Zustand (`GameState`)
- `static` Methoden, Schleifen, `if`/`switch`, Arrays
- `Scanner` für Konsoleneingabe

## Architektur

- Das Spiel ist **datengetrieben**. Story-Inhalte gehören in `Story.java`, nicht in
  `if`-Ketten in `Main.java`.
- Jede `Choice` verweist per Index (`nextScene`) auf die nächste Szene im Szenen-Array.
- Hinweise werden über ihren Index im `boolean[] foundClues` von `GameState` verwaltet.
- `Main.java` enthält nur die Spielschleife und Hilfsmethoden für Ein- und Ausgabe.

## Konventionen

- Sprache der Spieltexte: Deutsch. Code-Bezeichner: Englisch.
- Kleine, gut benannte `static` Methoden statt langer Methoden.
- Konstanten für Indizes verwenden (z. B. `Story.CLUE_LETTER`) statt magischer Zahlen.

## Bauen und Testen

```bash
cd src
javac *.java
java Main
```

Vor jeder Änderung sicherstellen, dass `javac *.java` ohne Fehler durchläuft.
