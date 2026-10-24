/**
 * Eine verdächtige Person.
 *
 * @param name        Name der Person
 * @param role        Rolle im Hotel, z. B. "Butler"
 * @param motive      mögliches Motiv
 * @param alibi       angegebenes Alibi
 * @param isMurderer  true für den wahren Täter
 */
record Suspect(String name, String role, String motive, String alibi, boolean isMurderer) {
}
