package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(12*x-841*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160237 Numerator of Hermite(n, 6/29).
 * @author Georg Fischer
 */
public class A160237 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160237() {
    super(0, "[[0],[1682],[-12],[2,1]]", "[1,12,-1538,-58824]", 2);
    setGfType(1);
  }
}
