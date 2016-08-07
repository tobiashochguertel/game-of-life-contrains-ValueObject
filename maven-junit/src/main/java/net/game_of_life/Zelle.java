package net.game_of_life;

import java.util.ArrayList;
import java.util.List;

public class Zelle {
  private List<Zelle> nachbarn;
  private Lebenszustand lebenszustand;

  public Zelle(Lebenszustand lebenszustand) {
    this.lebenszustand = lebenszustand;
    nachbarn = new ArrayList<Zelle>();
  }

  public Zelle(Lebenszustand lebenszustand, List<Zelle> nachbarn) {
    this(lebenszustand);
    this.nachbarn.addAll(nachbarn);
  }

  public Lebenszustand getLebenszustand() {
    return lebenszustand;
  }

  public void addNachbar(Zelle neighbour) {
    nachbarn.add(neighbour);
  }

  public AnzahlVonNachbarn getAnzahlVonNachbarn() {
    return new AnzahlVonNachbarn(nachbarn.size());
  }

  public void entwickeln() {
    if (getAnzahlVonNachbarn().kleinerAls(new AnzahlVonNachbarn(2))) {
      lebenszustand = Lebenszustand.TOT;
    }
    if (getAnzahlVonNachbarn().großerAls(new AnzahlVonNachbarn(3))) {
      lebenszustand = Lebenszustand.TOT;
    }
   if (getAnzahlVonNachbarn().equals(new AnzahlVonNachbarn(3))) {
      lebenszustand = Lebenszustand.LEBENDIG;
    }
  }
}
