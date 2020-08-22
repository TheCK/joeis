package irvine.oeis.a159;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(9*x-100*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A159660 Numerator of Hermite(n, 9/20).
 * @author Georg Fischer
 */
public class A159660 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159660() {
    super(0, "[[0],[200],[-9],[2,1]]", "[1,9,-119,-4671]", 2);
    setGfType(1);
  }
}
