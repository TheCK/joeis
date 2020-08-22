package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(2*x-289*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159529 Numerator of Hermite(n, 1/17).
 * @author Georg Fischer
 */
public class A159529 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159529() {
    super(0, "[[0],[578],[-2],[2,1]]", "[1,2,-574,-3460]", 2);
    setGfType(1);
  }
}
