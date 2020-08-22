package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(44*x-625*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160066 Numerator of Hermite(n, 22/25).
 * @author Georg Fischer
 */
public class A160066 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160066() {
    super(0, "[[0],[1250],[-44],[2,1]]", "[1,44,686,-79816]", 2);
    setGfType(1);
  }
}
