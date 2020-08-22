package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(32*x-361*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159654 Numerator of Hermite(n, 16/19).
 * @author Georg Fischer
 */
public class A159654 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159654() {
    super(0, "[[0],[722],[-32],[2,1]]", "[1,32,302,-36544]", 2);
    setGfType(1);
  }
}
