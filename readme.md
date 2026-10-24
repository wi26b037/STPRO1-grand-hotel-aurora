# Tod im Grandhotel Aurora

**Autor:** Markus
**Lehrveranstaltung:** Strukturierte Programmierung 1
**Abgabe:** 15.12.

Ein textbasiertes Detektivspiel für die Konsole, geschrieben in Java.

## Story

Wien, 1925, eine verschneite Nacht. Hotelbesitzer **Viktor Brandt** liegt tot in der
verschlossenen Bibliothek des Grandhotels Aurora, vergiftet am Cognac. Wegen des
Schneesturms kommt niemand hinein oder hinaus. Du bist Detektiv:in und hast bis zum
Morgengrauen Zeit (12 Aktionen), um den Fall zu lösen.

**Verdächtige:**

1. **Clara Brandt** – die Ehefrau, erbt alles.
2. **Dr. Felix Hartmann** – der Hausarzt, hat Zugang zu Gift und Schulden bei Viktor.
3. **Emil** – der Butler, hat den Bibliotheksschlüssel und wurde gestern entlassen.
4. **Lena Vogt** – eine Journalistin, recherchiert über Viktors dunkle Geschäfte.

Du bewegst dich durch die Räume des Hotels, untersuchst Spuren, befragst Verdächtige
und sammelst Hinweise. Am Ende erhebst du Anklage: Täter, Motiv und Beweis. Je nachdem,
wie gut deine Ermittlungen waren, erreichst du eines von mehreren Enden.

## Technischer Ansatz

Das Spiel ist **datengetrieben**: Die Story besteht aus einem Array von `Scene`-Records.
Jede Wahlmöglichkeit (`Choice`) zeigt auf den Index der nächsten Szene. Die Hauptschleife
bleibt dadurch kurz:

1. aktuelle Szene anzeigen
2. Wahl einlesen
3. `current = choice.nextScene()`

Neue Story-Zweige sind reine Daten und brauchen keinen neuen Code.

Gemäß den Vorgaben der Lehrveranstaltung verwendet das Projekt nur strukturierte
Programmierung mit Records und einfachen Klassen: keine Vererbung, keine Interfaces,
keine Collections (nur Arrays), keine Streams oder Lambdas.

## Projektstruktur

```
readme.md         Diese Datei
features.md       Nummerierte Liste der Features
agents.md         Hinweise für KI-Assistenten
src/
  Main.java       Einstiegspunkt und Spielschleife
  Story.java      Alle Spieldaten (Szenen, Hinweise, Verdächtige)
  GameState.java  Veränderlicher Spielzustand (Zeit, Hinweise, aktuelle Szene)
  Scene.java      Record: eine Szene
  Choice.java     Record: eine Wahlmöglichkeit
  Clue.java       Record: ein Hinweis
  Suspect.java    Record: eine verdächtige Person
```

## Starten

Voraussetzung: JDK 17 oder neuer (Records).

```bash
cd src
javac *.java
java Main
```
