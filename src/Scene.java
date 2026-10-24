/**
 * Eine Szene der Geschichte, z. B. "Bibliothek" oder "Befragung von Emil".
 *
 * @param title     kurzer Titel der Szene
 * @param text      Beschreibung, die beim Betreten angezeigt wird
 * @param choices   mögliche Wahlmöglichkeiten
 * @param foundClue Index des Hinweises, den man in dieser Szene findet (-1 = keiner)
 * @param isEnding  true, wenn das Spiel mit dieser Szene endet
 */
record Scene(String title, String text, Choice[] choices, int foundClue, boolean isEnding) {
}
