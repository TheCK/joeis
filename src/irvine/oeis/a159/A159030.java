package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(2*x-81*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159030 Numerator of Hermite(n, 1/9).
 * @author Georg Fischer
 */
public class A159030 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159030() {
    super(0, "[[0],[162],[-2],[2,1]]", "[1,2,-158,-964]", 2);
    setGfType(1);
  }
}
