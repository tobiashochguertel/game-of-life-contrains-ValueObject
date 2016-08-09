package net.game_of_life;

import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class AnzahlVonNachbarnTest {

  @Test
  public void fünf_ist_nicht_kleiner_als_drei(){
    AnzahlVonNachbarn fünf = new AnzahlVonNachbarn(5);
    AnzahlVonNachbarn drei = new AnzahlVonNachbarn(3);
    assertFalse(fünf.kleinerAls(drei));
  }

  @Test
  public void fünf_ist_gleich_fünf(){
    AnzahlVonNachbarn fünf = new AnzahlVonNachbarn(5);
    assertEquals(new AnzahlVonNachbarn(5), fünf);
  }

  @Test
  public void fünf_ist_nicht_gleich_sechs(){
    AnzahlVonNachbarn fünf = new AnzahlVonNachbarn(5);
    AnzahlVonNachbarn sechs = new AnzahlVonNachbarn(6);
    assertNotEquals(sechs, fünf);
  }

  @Test
  public void sechs_ist_nicht_gleich_sechs(){
    AnzahlVonNachbarn sechs2 = new AnzahlVonNachbarn(6);
    AnzahlVonNachbarn sechs = new AnzahlVonNachbarn(6);
    assertEquals(sechs, sechs2);
  }

}