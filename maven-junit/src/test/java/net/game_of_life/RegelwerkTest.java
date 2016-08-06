package net.game_of_life;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;

import static net.game_of_life.Lebenszustand.*;
import static org.junit.Assert.assertTrue;

public class RegelwerkTest {

  /* Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
   * live cell < 2 live neighbours = cell dead
   */

  @Test
  public void lebende_Zelle_stirbt_wenn_sie_weniger_als_zwei_lebende_Nachbarn_hat() {
    Zelle lebendeZelle = new Zelle(LEBENDIG);
    assertEquals(lebendeZelle.getLebenszustand(), LEBENDIG);
    lebendeZelle.addNachbar(new Zelle(LEBENDIG));
    lebendeZelle.entwickeln();
    assertThat(lebendeZelle.getAnzahlVonNachbarn(), lessThan(2));
    assertEquals(TOT, lebendeZelle.getLebenszustand());
  }

  /* Any live cell with more than three live neighbours dies, as if by overcrowding.
   * live cell > 3 live neighbours = cell dead
   */

  /* Any live cell with two or three live neighbours lives on to the next generation.
   * live cell > 2,3 live neighbours = live cell
   */

  /* Any dead cell with exactly three live neighbours becomes a live cell.
   * dead cell == 3 live neighbours = live cell
   */

}
