/**
 * Eine Wahlmöglichkeit innerhalb einer Szene.
 *
 * @param text         Text, der dem Spieler angezeigt wird
 * @param nextScene    Index der Szene, zu der diese Wahl führt
 * @param requiredClue Index des Hinweises, der nötig ist, damit die Wahl erscheint
 *                     (-1 = keine Bedingung)
 * @param timeCost     wie viele Aktionen (Zeit) diese Wahl kostet
 */
record Choice(String text, int nextScene, int requiredClue, int timeCost) {
}
