package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(52*x-841*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160288 Numerator of Hermite(n, 26/29).
 * @author Georg Fischer
 */
public class A160288 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160288() {
    super(0, "[[0],[1682],[-52],[2,1]]", "[1,52,1022,-121784]", 2);
    setGfType(1);
  }
}
