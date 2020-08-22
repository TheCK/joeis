package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x-16*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159014 Numerator of Hermite(n, 1/8).
 * @author Georg Fischer
 */
public class A159014 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159014() {
    super(0, "[[0],[32],[-1],[2,1]]", "[1,1,-31,-95]", 2);
    setGfType(1);
  }
}
