## Dojo: 8.8.2016, Softwerkkammer Magdeburg, Kata: Conways game of life

Veranstaltung [Softwerkkammer Magdeburg, Dojo am 08.08.2016](https://www.softwerkskammer.org/activities/magdeburg_treffen_36)

Bei einem Coding Dojo wird gemeinsam (Pair Programming) eine kleine, überschaubare Übungsaufgabe (Coding Kata) testgetrieben (TDD) entwickelt. Dabei steht das gemeinsame voneinander Lernen und Üben von bereits Gelerntem im Fokus. Die komplette Lösung der Aufgabe ist nicht zwingend. Vielmehr ist der Weg das Ziel. Um den Schwierigkeitsgrad zu steigern können zusätzlich zur eigentlichen Übungsaufgabe Constraints festgelegt werden.

Die Wahl der Übungsaufgabe fiel diesen Monat auf die Conways Game of Life.

Als Einschränkung (Constraint) gibt es "No Primitives accross method boundaries (input or output)". Die Teams arbeiten in Paaren. Ihr benötigt ein Unit-Testing Framework für eure gewählte Programmiersprache mit einer installierten Entwicklungsumgebung.

Die Einschränkung "No Primitives accross method boundaries (input or output)" bedeutet, dass abgesehen von einem Konstruktor keine Methode einen primitiven Datentyp als Übergabe- oder Rückgabeparameter erwartet.

- Als primitive Datentypen gelten int, string, array, list, usw…
- Statt dessen sind Datentypen zu verwenden die wir selbst definiert haben im Sinne von "ValueObjects".
- Wir konzentrieren uns auf das was die Datentypen im Konzept der Anwendung repräsentieren und erstellen dafür eigene Datentypen.
- 
Wer hat, bringt einen Laptop mit installierter Entwicklungsumgebung und entsprechendem Unit-Testing Framework mit.

Das Kata wird von Tobias Hochgürtel durchgeführt.

Auf unseren Veranstaltungen werden regelmäßig Fotos und Videos durch die Organisatoren gemacht. Dieses Bild- und Tonmaterial wird auf verschiedenen Webseiten im Internet veröffentlicht. Mit deiner Anmeldung bzw. deinem Erscheinen willigst du ein, dass das mit deiner ausdrücklichen Zustimmung passiert. Das Material wird nach dem § 23 Abs. 1, Nr. 3 Kunsturhebergesetz behandelt.

## Überblick:

```
mvn test

....
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running net.game_of_life.AnzahlVonNachbarnTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.095 sec
Running net.game_of_life.ZelleTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec

Results :

Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
....
```

