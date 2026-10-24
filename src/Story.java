/**
 * Alle Inhalte des Spiels: Szenen, Hinweise und Verdächtige.
 * Story-Inhalte gehören hierher, nicht als if-Ketten in Main.
 */
class Story {

    static final int MAX_ACTIONS = 12;
    static final int NO_CLUE = -1;

    // Indizes der Hinweise im Array von clues()
    static final int CLUE_LETTER = 0;      // halb verbrannter Brief im Kamin
    static final int CLUE_VIAL = 1;        // leeres Medizinfläschchen
    static final int CLUE_NOTEBOOK = 2;    // Lenas Notizbuch mit Schuldnerliste
    static final int CLUE_ARTICLE = 3;     // Zeitungsartikel über gefälschte Rezepte
    static final int CLUE_BUTLER = 4;      // Aussage des Butlers
    static final int CLUE_COGNAC = 5;      // Cognac, den nur Viktor trank
    static final int CLUE_WILL = 6;        // falsche Fährte: Testament-Gespräch
    static final int CLUE_DISMISSAL = 7;   // falsche Fährte: Emils Kündigungsbrief
    static final int CLUE_PHOTO = 8;       // falsche Fährte: Lenas Foto vom Tatort

    // Indizes wichtiger Szenen im Array von scenes()
    static final int SCENE_START = 0;

    static Scene[] scenes() {
        // TODO: alle Szenen anlegen (Eingangshalle, Räume, Befragungen, Anklage, Enden)
        Scene[] scenes = new Scene[1];
        scenes[SCENE_START] = new Scene(
                "Eingangshalle",
                "TODO: Einleitungstext",
                new Choice[0],
                NO_CLUE,
                false);
        return scenes;
    }

    static Clue[] clues() {
        // TODO: alle 9 Hinweise anlegen, Reihenfolge passend zu den CLUE_-Konstanten
        return new Clue[9];
    }

    static Suspect[] suspects() {
        // TODO: Clara, Dr. Hartmann, Emil und Lena anlegen
        return new Suspect[4];
    }
}
