import java.util.Scanner;

/**
 * Tod im Grandhotel Aurora - ein Detektivspiel für die Konsole.
 * Autor: Markus
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scene[] scenes = Story.scenes();
        Clue[] clues = Story.clues();
        Suspect[] suspects = Story.suspects();
        GameState state = new GameState(Story.SCENE_START, Story.MAX_ACTIONS, clues.length);

        printIntro();

        // TODO: Spielschleife
        //  1. aktuelle Szene anzeigen (printScene)
        //  2. gefundenen Hinweis merken (collectClue)
        //  3. Ende? -> Schleife verlassen
        //  4. verfügbare Wahlmöglichkeiten anzeigen und Eingabe lesen
        //  5. Zeit abziehen, state.currentScene = choice.nextScene()
        //  6. Zeit abgelaufen? -> Ende "Zeit abgelaufen"

        input.close();
    }

    static void printIntro() {
        // TODO: Titel, Einleitung und Spielanleitung ausgeben
    }

    static void printScene(Scene scene, GameState state) {
        // TODO: Titel, Text und verbleibende Zeit ausgeben
    }

    static void collectClue(Scene scene, Clue[] clues, GameState state) {
        // TODO: falls die Szene einen Hinweis enthält, in state.foundClues markieren und melden
    }

    static boolean isChoiceAvailable(Choice choice, GameState state) {
        // TODO: prüfen, ob der benötigte Hinweis (requiredClue) gefunden wurde
        return true;
    }

    static void printChoices(Choice[] choices, GameState state) {
        // TODO: nur verfügbare Wahlmöglichkeiten nummeriert ausgeben
    }

    static int readNumber(Scanner input, int min, int max) {
        // TODO: Zahl einlesen und bei ungültiger Eingabe erneut fragen
        return min;
    }

    static void printInventory(Clue[] clues, GameState state) {
        // TODO: alle gefundenen Hinweise auflisten
    }

    static void accuse(Scanner input, Suspect[] suspects, Clue[] clues, GameState state) {
        // TODO: Täter, Motiv und Beweis auswählen lassen und passendes Ende bestimmen
    }
}
