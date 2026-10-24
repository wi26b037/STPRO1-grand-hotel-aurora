# Features

1. **Startbildschirm** mit Titel, Einleitung und kurzer Spielanleitung.
2. **Szenen-basierte Story**: Die Geschichte ist ein Array aus Szenen, jede Wahl führt zu einer nächsten Szene.
3. **Räume erkunden**: Bibliothek, Salon, Küche, Arztzimmer, Personalräume und Lenas Zimmer.
4. **Untersuchen**: In jedem Raum können Spuren untersucht werden.
5. **Befragen**: Verdächtige können befragt werden, ihre Aussagen ändern sich je nach Wissensstand.
6. **Hinweis-Inventar**: Gefundene Hinweise werden in einem `boolean[]` gespeichert und können jederzeit angezeigt werden.
7. **Falsche Fährten**: Nicht jeder Hinweis führt zum Täter.
8. **Bedingte Wahlmöglichkeiten**: Manche Optionen erscheinen erst, wenn ein bestimmter Hinweis gefunden wurde (z. B. den Arzt mit dem Brief konfrontieren).
9. **Zeitlimit**: Jede Aktion kostet Zeit, nach 12 Aktionen bricht der Morgen an.
10. **Anklage**: Am Ende werden Täter, Motiv und Beweis ausgewählt.
11. **Mehrere Enden**:
    1. Perfekte Auflösung (Täter, Motiv und Beweis richtig)
    2. Halber Erfolg (Täter richtig, Beweis fehlt)
    3. Justizirrtum (eigener Epilog pro falsch angeklagter Person)
    4. Zeit abgelaufen
    5. Geheimes Ende (mit Lenas Hilfe)
12. **Eingabeprüfung**: Ungültige Eingaben werden abgefangen, ohne dass das Spiel abstürzt.
13. **Übersicht freigeschalteter Enden** (optional, Erweiterung).
14. **Speichern und Laden** des Spielstands in eine Textdatei (optional, Erweiterung).
