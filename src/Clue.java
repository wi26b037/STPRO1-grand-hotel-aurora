/**
 * Ein Hinweis, der im Laufe der Ermittlung gefunden werden kann.
 *
 * @param name        kurzer Name für das Inventar
 * @param description ausführliche Beschreibung
 * @param isRedHerring true, wenn es sich um eine falsche Fährte handelt
 */
record Clue(String name, String description, boolean isRedHerring) {
}
