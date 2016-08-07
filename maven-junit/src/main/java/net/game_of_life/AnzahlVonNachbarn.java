package net.game_of_life;

import java.util.HashMap;
import java.util.Objects;

public class AnzahlVonNachbarn implements Comparable<AnzahlVonNachbarn> {

  final int LESS = -1;
  final int EQUAL = 0;
  final int GREATER = 1;

  final int anzahlDerNachbarn;

  public AnzahlVonNachbarn(int anzahlDerNachbarn) {
    this.anzahlDerNachbarn = anzahlDerNachbarn;
  }

  /**
   * Compares this object with the specified object for order.  Returns a
   * negative integer, zero, or a positive integer as this object is less
   * than, equal to, or greater than the specified object.
   * <p>
   *
   * @param o
   *   the object to be compared.
   * @return a negative integer, zero, or a positive integer as this object
   * is less than, equal to, or greater than the specified object.
   *
   * @throws NullPointerException
   *   if the specified object is null
   * @throws ClassCastException
   *   if the specified object's type prevents it from being compared to this object.
   */
  public int compareTo(AnzahlVonNachbarn o) {
    if (Objects.equals(anzahlDerNachbarn, o.anzahlDerNachbarn)) return EQUAL;

    if (anzahlDerNachbarn < o.anzahlDerNachbarn) return LESS;
    if (anzahlDerNachbarn > o.anzahlDerNachbarn) return GREATER;

    return EQUAL;
  }

  public boolean kleinerAls(AnzahlVonNachbarn groessereAnzahlVonNachbarn) {
    return this.compareTo(groessereAnzahlVonNachbarn) == LESS;
  }

  public boolean großerAls(AnzahlVonNachbarn groessereAnzahlVonNachbarn) {
    return this.compareTo(groessereAnzahlVonNachbarn) == GREATER;
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   * <p>
   *
   * @param obj
   *   the reference object with which to compare.
   * @return {@code true} if this object is the same as the obj
   * argument; {@code false} otherwise.
   *
   * @see #hashCode()
   * @see HashMap
   */
  @Override
  public boolean equals(Object obj) {
    if ( obj == null )
      return false;

    if ( obj == this )
      return true;

    if (!obj.getClass().equals(getClass()))
      return false;

    AnzahlVonNachbarn o = (AnzahlVonNachbarn) obj;
    return this.compareTo(o) == EQUAL;
  }

  /**
   * Returns a hash code value for the object. This method is
   * supported for the benefit of hash tables such as those provided by
   * {@link HashMap}.
   * <p>
   *
   * @return a hash code value for this object.
   *
   * @see Object#equals(Object)
   * @see System#identityHashCode
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
