package net.game_of_life;

import org.junit.Test;

import static net.game_of_life.Lebenszustand.LEBENDIG;
import static net.game_of_life.Lebenszustand.TOT;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class ZelleTest {

  /* Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
   * live cell < 2 live neighbours = cell dead
   */
  @Test
  public void lebende_Zelle_stirbt_wenn_sie_von_weniger_als_zwei_lebenden_Nachbarn_umgeben_ist() {
    Zelle lebendeZelle = new Zelle(LEBENDIG);
    assertEquals(lebendeZelle.getLebenszustand(), LEBENDIG);
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    lebendeZelle.entwickeln();
    assertThat(lebendeZelle.getAnzahlVonNachbarn(), lessThan(new AnzahlVonNachbarn(2)));
    assertEquals(TOT, lebendeZelle.getLebenszustand());
  }

  /* Any live cell with more than three live neighbours dies, as if by overcrowding.
   * live cell > 3 live neighbours = cell dead
   */
  @Test
  public void lebende_Zelle_stirbt_wenn_sie_von_mehr_als_drei_lebenden_Nachbarn_umgeben_ist() {
    Zelle lebendeZelle = new Zelle(LEBENDIG);
    assertEquals(lebendeZelle.getLebenszustand(), LEBENDIG);
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    lebendeZelle.entwickeln();
    assertThat(lebendeZelle.getAnzahlVonNachbarn(), greaterThan(new AnzahlVonNachbarn(3)));
    assertEquals(TOT, lebendeZelle.getLebenszustand());
  }

  /* Any live cell with two or three live neighbours lives on to the next generation.
   * live cell > 2,3 live neighbours = live cell
   */
  @Test
  public void lebende_Zelle_bleibt_am_leben_wenn_sie_von_genau_zwei_oder_genau_drei_lebenden_Nachbarn_umgeben_ist() {
    Zelle lebendeZelle = new Zelle(LEBENDIG);
    assertEquals(lebendeZelle.getLebenszustand(), LEBENDIG);
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    assertThat(lebendeZelle.getAnzahlVonNachbarn(), is(new AnzahlVonNachbarn(2)));
    lebendeZelle.entwickeln();
    assertEquals(LEBENDIG, lebendeZelle.getLebenszustand());
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    assertThat(lebendeZelle.getAnzahlVonNachbarn(), is(new AnzahlVonNachbarn(3)));
    lebendeZelle.entwickeln();
    assertEquals(LEBENDIG, lebendeZelle.getLebenszustand());
  }

  /* Any dead cell with exactly three live neighbours becomes a live cell.
   * dead cell == 3 live neighbours = live cell
   */
  @Test
  public void tote_Zelle_lebt_wenn_sie_von_genau_drei_lebenden_Nachbarn_umgeben_ist() {
    Zelle toteZelle = new Zelle(TOT);
    assertEquals(toteZelle.getLebenszustand(), TOT);
    toteZelle.addNachbar(new Zelle(LEBENDIG));
    toteZelle.addNachbar(new Zelle(LEBENDIG));
    toteZelle.addNachbar(new Zelle(LEBENDIG));
    assertThat(toteZelle.getAnzahlVonNachbarn(), is(new AnzahlVonNachbarn(3)));
    toteZelle.entwickeln();
    assertEquals(LEBENDIG, toteZelle.getLebenszustand());
  }

}
