package irvine.oeis.a160;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(42*x-625*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A160065 Numerator of Hermite(n, 21/25).
 * @author Georg Fischer
 */
public class A160065 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160065() {
    super(0, "[[0],[1250],[-42],[2,1]]", "[1,42,514,-83412]", 2);
    setGfType(1);
  }
}
