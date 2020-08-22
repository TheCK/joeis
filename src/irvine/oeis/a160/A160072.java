package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(7*x-169*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160072 Numerator of Hermite(n, 7/26).
 * @author Georg Fischer
 */
public class A160072 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160072() {
    super(0, "[[0],[338],[-7],[2,1]]", "[1,7,-289,-6755]", 2);
    setGfType(1);
  }
}
