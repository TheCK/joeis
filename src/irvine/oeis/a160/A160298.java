package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(29*x-225*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160298 Numerator of Hermite(n, 29/30).
 * @author Georg Fischer
 */
public class A160298 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160298() {
    super(0, "[[0],[450],[-29],[2,1]]", "[1,29,391,-14761]", 2);
    setGfType(1);
  }
}
