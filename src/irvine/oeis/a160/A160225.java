package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(4*x-841*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160225 Numerator of Hermite(n, 2/29).
 * @author Georg Fischer
 */
public class A160225 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160225() {
    super(0, "[[0],[1682],[-4],[2,1]]", "[1,4,-1666,-20120]", 2);
    setGfType(1);
  }
}
