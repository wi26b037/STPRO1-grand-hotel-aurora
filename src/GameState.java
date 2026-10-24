/**
 * Der veränderliche Zustand eines laufenden Spiels.
 * Bewusst eine einfache Klasse (kein Record), weil sich die Werte während des Spiels ändern.
 */
class GameState {
    int currentScene;
    int actionsLeft;
    boolean[] foundClues;
    boolean trustsLena;

    GameState(int startScene, int maxActions, int clueCount) {
        currentScene = startScene;
        actionsLeft = maxActions;
        foundClues = new boolean[clueCount];
        trustsLena = false;
    }
}
