package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(5*x-16*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159019 Numerator of Hermite(n, 5/8).
 * @author Georg Fischer
 */
public class A159019 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159019() {
    super(0, "[[0],[32],[-5],[2,1]]", "[1,5,-7,-355]", 2);
    setGfType(1);
  }
}
