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

  public List<Zelle> getNachbarn() {
    return nachbarn;
  }

  public void setNachbarn(List<Zelle> nachbarn) {
    this.nachbarn = nachbarn;
  }

  public Lebenszustand getLebenszustand() {
    return lebenszustand;
  }

  public void addNachbar(Zelle neighbour) {
    nachbarn.add(neighbour);
  }

  public int getAnzahlVonNachbarn() {
    return nachbarn.size();
  }


  public void entwickeln() {
    if(getAnzahlVonNachbarn() < 2) {
      lebenszustand = Lebenszustand.TOT;
    }
  }
}
