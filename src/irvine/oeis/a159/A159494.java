package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(6*x-169*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159494 Numerator of Hermite(n, 3/13).
 * @author Georg Fischer
 */
public class A159494 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159494() {
    super(0, "[[0],[338],[-6],[2,1]]", "[1,6,-302,-5868]", 2);
    setGfType(1);
  }
}
