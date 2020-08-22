package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(38*x-841*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160281 Numerator of Hermite(n, 19/29).
 * @author Georg Fischer
 */
public class A160281 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160281() {
    super(0, "[[0],[1682],[-38],[2,1]]", "[1,38,-238,-136876]", 2);
    setGfType(1);
  }
}
